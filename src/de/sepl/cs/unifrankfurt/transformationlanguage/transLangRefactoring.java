package de.sepl.cs.unifrankfurt.transformationlanguage;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.cdt.core.dom.ast.IASTNode;
import org.eclipse.cdt.core.dom.ast.IASTPreprocessorPragmaStatement;
import org.eclipse.cdt.core.dom.ast.IASTPreprocessorStatement;
import org.eclipse.cdt.core.dom.ast.IASTStatement;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.internal.core.dom.parser.cpp.CPPASTFunctionDefinition;
import org.eclipse.cdt.internal.ui.refactoring.CRefactoring;
import org.eclipse.cdt.internal.ui.refactoring.ModificationCollector;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ltk.core.refactoring.RefactoringDescriptor;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ptp.pldt.mpi.analysis.cdt.graphs.IBlock;
import org.eclipse.ptp.pldt.mpi.analysis.cdt.graphs.ICallGraphNode;
import org.eclipse.ptp.pldt.mpi.analysis.cdt.graphs.IControlFlowGraph;
import org.eclipse.ptp.pldt.mpi.analysis.cdt.graphs.impl.ControlFlowGraph;
import org.eclipse.text.edits.TextEditGroup;

@SuppressWarnings("restriction")
public class transLangRefactoring extends CRefactoring {
	private Log logger = LogFactory.getLog(getClass());
	private List<Integer> forLoopLineNos = new ArrayList<Integer>();
	private IASTNode selectedNode = null;

	public transLangRefactoring(ICElement element, ISelection selection, ICProject project) {
		super(element, selection, project);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected RefactoringDescriptor getRefactoringDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RefactoringStatus checkInitialConditions(IProgressMonitor pm)
			throws CoreException, OperationCanceledException {
		selectedNode = getAST(getTranslationUnit(), pm).getNodeSelector(null).findNode(selectedRegion.getOffset(),
				selectedRegion.getLength());
		IASTStatement funcBody = getParentFunctionBody(selectedNode);
		IControlFlowGraph cfg = new ControlFlowGraph(funcBody);
		cfg.buildCFG();
		// print CFG
		IBlock entryBlock = cfg.getEntry();
		for (IBlock block = entryBlock; block != null; block = block.getTopNext()) {
			System.out.println("Printing Block");
			block.print();
		}
		return super.checkInitialConditions(pm);
	}

	private IASTStatement getParentFunctionBody(IASTNode selectedNode) {
		while (!(selectedNode instanceof CPPASTFunctionDefinition)) {
			selectedNode = selectedNode.getParent();
		}
		return ((CPPASTFunctionDefinition) selectedNode).getBody();
	}

	@Override
	protected void collectModifications(IProgressMonitor pm, ModificationCollector collector)
			throws CoreException, OperationCanceledException {
		final TextEditGroup editGroup = new TextEditGroup("Api Refactoring final modifications");
		IASTTranslationUnit ast = getAST(tu, pm);
		for (IASTPreprocessorStatement stat : ast.getAllPreprocessorStatements()) {
			if (stat instanceof IASTPreprocessorPragmaStatement) {
				String[] messages = ((IASTPreprocessorPragmaStatement) stat).getRawSignature().split(" ");
				logger.info("Preprocessor message : " + ((IASTPreprocessorPragmaStatement) stat).getRawSignature());
				if (messages[1].equalsIgnoreCase("vectorizeloop")) {
					try {
						forLoopLineNos.add(stat.getFileLocation().getStartingLineNumber());
					} catch (Exception e) {
						logger.error("Pragma cannot be processed. Please supply number after #pragma vectorizeLoop");
					}
				}
				ast.accept(
						new LoopVectorizeVisitor(forLoopLineNos, collector.rewriterForTranslationUnit(ast), editGroup));
			}
		}
	}

}
