package de.sepl.cs.unifrankfurt.transformationlanguage;

import org.eclipse.cdt.core.model.IWorkingCopy;
import org.eclipse.cdt.ui.CUIPlugin;
import org.eclipse.cdt.ui.IWorkingCopyManager;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class transLangHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IShellProvider shellProvider = getShellProvider(event);
		IWorkingCopyManager wcManager = CUIPlugin.getDefault().getWorkingCopyManager();
		IWorkingCopy wc = wcManager.getWorkingCopy(editor.getEditorInput());
		new transLangRefactoringRunner(wc, selection, shellProvider, wc.getCProject()).run();
		return null;
	}

	private IShellProvider getShellProvider(ExecutionEvent event) {
		return new IShellProvider() {
			@Override
			public Shell getShell() {
				return HandlerUtil.getActiveShell(event);
			}
		};
	}
}
