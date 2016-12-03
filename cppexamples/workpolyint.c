#include <assert.h>
#include "complessi.h"
#include "utility.h"
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#ifndef POLYNOMIAL_H
#define POLYNOMIAL_H

#define FAST_MUL_ADD 0 //se 1 uso fast_mul e fast add [SCONSIGLIATO] - se 0 uso uso add e mul [CONSIGLIATO]

#define NEW_ROOTS_RECURSIVE 0 //se 1 usi l'algoritmo nuovo di roots recursive [SCONSIGLIATO] - se 0 usi il solito roots recursive [CONSIGLIATO]

typedef struct real_big_polynomial //chiamare init_polynomial per usarla correttamente
{
	mpz_t* coefficients;
	mpz_t* degrees;
	int num_elements;
} r_big_polynomial;

typedef struct root_set {
	mpz_t* roots; //da inizializzare!!!
	int num_elements;
} s_root_set;

//////////////////////////////////////////////////////        REALI   BIG     //////////////////////////////////////////////////////

//funzionano in logica inversa rispetto ai complessi - ordinati in maniera crescente
void init_real_big_polynomial(int* coef, int c_size, int* deg, int d_size,
		r_big_polynomial* poly, int n) {
	//printf("CSIZE: %d\n", c_size);
	//CONTROLLI DI CONSISTENZA
	assert(c_size == d_size && d_size > 0);

	int* new_coef = (int*) malloc(sizeof(int) * c_size); //poi verranno riallocati in caso qualche coefficiente divenga zero
	int* new_deg = (int*) malloc(sizeof(int) * c_size);

	int i;
	int new_c_size = 0; //dimensione nuovo array di coefficienti

	for (i = 0; i < d_size; i++) {
		coef[i] = coef[i] % n;

		if ((coef[i] - 0) != 0) //non è stato annullato dopo la riduzione modulo n
				{
			new_coef[new_c_size] = coef[i];
			new_deg[new_c_size] = deg[i];
			new_c_size++;
		}

		assert((deg[i] - 0) >= 0); //no frazioni! 1/x
		if (i != 0)
			assert((deg[i] - deg[i - 1]) > 0); //strettamente maggiore
	}
	//CONTROLLI DI CONSISTENZA

	//printf("NEW SIZE: %d\n", new_c_size);

	if (new_c_size != c_size && new_c_size != 0) //se uguale evito di riallocare, perchè significa che non ho eliminato termini
			{
		new_coef = (int*) realloc(new_coef, sizeof(int) * new_c_size);
		new_deg = (int*) realloc(new_deg, sizeof(int) * new_c_size);
	}

	if (new_c_size == 0) //azzerato totalmente il polinomio
			{
		poly->coefficients = (int*) malloc(sizeof(int));
		poly->coefficients[0] = 0;

		poly->degrees = (int*) malloc(sizeof(int));
		poly->degrees[0] = 0;

		poly->num_elements = 1;

		return;
	}

	poly->num_elements = new_c_size;
	poly->coefficients = new_coef;
	poly->degrees = new_deg;
}

//funzionano in logica inversa rispetto ai complessi
//senza riduzione modulo n
void init_real_big_polynomial_no_mod(int* coef, int c_size, int* deg,
		int d_size, r_big_polynomial* poly) {
	//printf("CSIZE: %d\n", c_size);
	//CONTROLLI DI CONSISTENZA
	assert(c_size == d_size && d_size > 0);

	int* new_coef = (int*) malloc(sizeof(int) * c_size); //poi verranno riallocati in caso qualche coefficiente divenga zero
	int* new_deg = (int*) malloc(sizeof(int) * c_size);

	int i;
	int new_c_size = 0; //dimensione nuovo array di coefficienti

	for (i = 0; i < d_size; i++) {
		//mpz_mod(coef[i], coef[i], n);

		if ((coef[i] - 0) != 0) //non è stato annullato dopo la riduzione modulo n
				{
			new_coef[new_c_size] = coef[i];
			new_deg[new_c_size] = deg[i];
			new_c_size++;
		}

		assert((deg[i] - 0) >= 0); //no frazioni! 1/x
		if (i != 0)
			assert((deg[i] - deg[i - 1]) > 0); //strettamente maggiore
	}
	//CONTROLLI DI CONSISTENZA

	//printf("NEW SIZE: %d\n", new_c_size);

	if (new_c_size != c_size && new_c_size != 0) //se uguale evito di riallocare, perchè significa che non ho eliminato termini
			{
		new_coef = (int*) realloc(new_coef, sizeof(int) * new_c_size);
		new_deg = (int*) realloc(new_deg, sizeof(int) * new_c_size);
	}

	if (new_c_size == 0) //azzerato totalmente il polinomio
			{
		poly->coefficients = (int*) malloc(sizeof(int));
		poly->coefficients[0] = 0;

		poly->degrees = (int*) malloc(sizeof(int));
		poly->degrees[0] = 0;

		poly->num_elements = 1;

		return;
	}

	poly->num_elements = new_c_size;
	poly->coefficients = new_coef;
	poly->degrees = new_deg;
}

void r_big_polynomial_simple_mul(r_big_polynomial* poly_mul,
		r_big_polynomial poly_A, r_big_polynomial poly_B, int p) {
	//printf("Simple Mul\n");

	int num_el_A = poly_A.num_elements;
	int num_el_B = poly_B.num_elements;

	int max_num_el = num_el_A * num_el_B;
	int* new_coef = (int*) malloc(sizeof(int) * max_num_el);
	int* new_deg = (int*) malloc(sizeof(int) * max_num_el);

	//printf("max_num_el: %d\n", max_num_el);

	int i, j;
	int real_size = 0;

	for (i = 0; i < max_num_el; i++) {
		new_coef[i] = 0;
		new_deg[i] = 0; //mi serve come segnalatore di posizione non dirty
	}

	for (i = 0; i < num_el_A; i++) //scorro primo polinomio
			{
		for (j = 0; j < num_el_B; j++) //scorro secondo polinomio
				{
			new_deg[real_size] = poly_A.degrees[i] + poly_B.degrees[j]; //il grado è la somma dei due gradi
			new_coef[real_size] = poly_A.coefficients[i]
					* poly_B.coefficients[j]; //il coefficiente è il prodotto dei due coefficienti

			real_size++;
		}
	}

	//printf("start quicksort\n");
	quicksort_deg_coef_bottom_up(new_deg, new_coef, 0, real_size - 1); //i gradi doppioni sono messi di fila
	//printf("end quicksort\n");

	//for(i = 0; i < max_num_el; i++)
	//	printf("%Zd x^%Zd\n", new_coef[i], new_deg[i]);

	real_size = 0;

	int cur_deg;
	cur_deg = 0;

	for (i = 0; i < max_num_el; i++) //rallenta l'algoritmo, ma lo rende MOOOLTO meno esoso in termini di ram (alloco subito solo lo spazio di cui ho bisogno)
			{
		cur_deg = new_deg[i];

		for (j = i + 1; j < max_num_el; j++) {
			if ((cur_deg - new_deg[j]) == 0)
				i++;
			else
				break;
		}
		real_size++;
	}
	//printf("real_size: %d\n", real_size);
	int* final_coef = (int*) malloc(sizeof(int) * real_size);
	int* final_deg = (int*) malloc(sizeof(int) * real_size);

	real_size = 0;

	for (i = 0; i < max_num_el; i++) //ci sono doppioni in new_deg
			{
		final_coef[real_size] = new_coef[i];
		final_deg[real_size] = new_deg[i];

		for (j = i + 1; j < max_num_el; j++) {
			if ((new_deg[j] - final_deg[real_size]) == 0) {
				final_coef[real_size] = final_coef[real_size] + new_coef[j];
				i++; //per non contare un'altra volta questo elemento nel ciclo esterno
			} else
				break;
		}
		real_size++;
	}

	//printf("real_size: %d\n", real_size);

	init_real_big_polynomial(final_coef, real_size, final_deg, real_size,
			poly_mul, p);

	for (i = 0; i < max_num_el; i++) {
	}

	for (i = 0; i < real_size; i++) {
	}

	free(new_coef);
	free(new_deg);

	free(final_coef);
	free(final_deg);
}

void r_big_polynomial_simple_add(r_big_polynomial* poly_add,
		r_big_polynomial poly_A, r_big_polynomial poly_B, int p) {
	//printf("Simple Add\n");

	int num_el_A = poly_A.num_elements;
	int num_el_B = poly_B.num_elements;

	int max_num_el = num_el_A + num_el_B;
	int* new_coef = (int*) malloc(sizeof(int) * max_num_el);
	int* new_deg = (int*) malloc(sizeof(int) * max_num_el);

	int i, j;
	int real_size = 0;

	for (i = 0; i < max_num_el; i++) {
		new_coef[i] = 0;
		new_deg[i] = 0;
	}

	for (i = 0; i < num_el_A; i++) //scorro il primo polinomio
			{
		new_coef[real_size] = poly_A.coefficients[i];
		new_deg[real_size] = poly_A.degrees[i];
		real_size++;
	}

	for (i = 0; i < num_el_B; i++) //scorro il secondo polinomio
			{
		new_coef[real_size] = poly_B.coefficients[i];
		new_deg[real_size] = poly_B.degrees[i];
		real_size++;
	}

	//printf("start quicksort\n");
	quicksort_deg_coef_bottom_up(new_deg, new_coef, 0, real_size - 1);
	//printf("end quicksort\n");

	real_size = 0;

	int cur_deg;
	cur_deg = 0;

	for (i = 0; i < max_num_el; i++) //rallenta l'algoritmo, ma lo rende MOOOLTO meno esoso in termini di ram (alloco subito solo lo spazio di cui ho bisogno)
			{
		cur_deg = new_deg[i];

		for (j = i + 1; j < max_num_el; j++) {
			if ((cur_deg - new_deg[j]) == 0)
				i++;
			else
				break;
		}
		real_size++;
	}
	//printf("real_size: %d\n", real_size);
	int* final_coef = (int*) malloc(sizeof(int) * real_size);
	int* final_deg = (int*) malloc(sizeof(int) * real_size);

	real_size = 0;

	for (i = 0; i < max_num_el; i++) //ci sono doppioni in new_deg
			{
		final_coef[real_size] = new_coef[i];
		final_deg[real_size] = new_deg[i];

		for (j = i + 1; j < max_num_el; j++) {
			if ((new_deg[j] - final_deg[real_size]) == 0) {
				final_coef[real_size] = final_coef[real_size] + new_coef[j];
				i++; //per non contare un'altra volta questo elemento nel ciclo esterno
			} else
				break;
		}
		real_size++;
	}

	//printf("real_size: %d\n", real_size);

	init_real_big_polynomial(final_coef, real_size, final_deg, real_size,
			poly_add, p);

	for (i = 0; i < max_num_el; i++) {
	}

	for (i = 0; i < real_size; i++) {
	}

	free(new_coef);
	free(new_deg);

	free(final_coef);
	free(final_deg);
}

void r_big_polynomial_add(r_big_polynomial* poly_add, r_big_polynomial poly_A,
		r_big_polynomial poly_B, int p) {
	int num_el_A = poly_A.num_elements;
	int num_el_B = poly_B.num_elements;

	int max_num_el = num_el_A + num_el_B;
	int* new_coef = (int*) malloc(sizeof(int) * max_num_el);
	int* new_deg = (int*) malloc(sizeof(int) * max_num_el);

	int i;
	int k;
	int z = 0;

	for (i = 0; i < max_num_el; i++) {
		new_coef[i] = 0;
		new_deg[i] = -1; //mi serve come segnalatore di posizione non dirty
	}

	for (i = 0; i < num_el_A; i++) //scorro il primo polinomio e lo scrivo sul polinomio finale, senza altre operazioni
			{
		new_coef[z] = poly_A.coefficients[i];
		new_deg[z] = poly_A.degrees[i];
		z++;
	}

	int cur_deg;
	cur_deg = 0;

	int cur_coef;
	cur_coef = 0;

	for (i = 0; i < num_el_B; i++) //scorro il secondo polinomio
			{
		cur_deg = poly_B.degrees[i];
		cur_coef = poly_B.coefficients[i];

		for (z = 0; z < max_num_el; z++) //scorro polinomio prodotto (ancora non completamente inizializzati i gradi e coefficienti relativi) alla ricerca della posizione in cui inserire il nuovo elemento
				{
			if ((new_deg[z] - -1) == 0) //aggiungo semplicemente il nuovo termine, perchè -1 è il segnalatore che questo posto è libero
					{
				new_deg[z] = cur_deg;
				new_coef[z] = cur_coef;
				break;
			}

			if ((cur_deg - new_deg[z]) == 0) //se ho aggiunto già un termine di questo grado, aggiorno il relativo coefficiente (il grado chiaramente resta invariato)
					{
				new_coef[z] = new_coef[z] + cur_coef;
				break;
			}
			if ((cur_deg - new_deg[z]) < 0) //inserisco in posizione z l'elemento cur_deg, ma prima shifto a destra tutti gli elementi diversi da -1
					{
				int max_num_el_shift = max_num_el - 1 - z; //massimo numero di elementi shiftabili (l'ultimo lo tengo fuori)
				int* shift_deg = (int*) malloc(sizeof(int) * max_num_el_shift);
				int* shift_coef = (int*) malloc(sizeof(int) * max_num_el_shift);

				int count = 0;
				//l'ultimo elemento chiaramente non è da shiftare, altrimenti vai out of bound. Viene sovrascritto (perchè tanto è necessariamente -1)
				for (k = z; k < max_num_el - 1; k++) //mi copio i valore da shiftare (quindi quelli diversi da -1)
						{
					if ((new_deg[k] - -1) == 0)
						break;

					shift_deg[count] = new_deg[k];
					shift_coef[count] = new_coef[k];
					count++;
				}

				new_deg[z] = cur_deg;
				new_coef[z] = cur_coef;

				for (k = 0; k < count; k++) //li copio di nuovo nell'array dei coefficienti
						{
					z++;
					new_deg[z] = shift_deg[k];
					new_coef[z] = shift_coef[k];
				}

				free(shift_deg);
				free(shift_coef);

				break;
			}
		}
	}

	int* coefficients = (int*) malloc(sizeof(int) * max_num_el);
	int* degrees = (int*) malloc(sizeof(int) * max_num_el);

	int count = 0;
	for (i = 0; i < max_num_el; i++) {
		if ((new_deg[i] - -1) == 0)
			break;
		//printf("%Zd*x^%Zd\n", new_coef[i], new_deg[i]);
		new_coef[i] = new_coef[i] % p;

		if ((new_coef[i] - 0) == 0) //se il coefficiente è nullo, non dovrò inserirlo nell'array finale, quindi tengo anche fermo il conteggio di elementi dell'array finale
			continue;

		coefficients[count] = new_coef[i];
		degrees[count] = new_deg[i];

		count++;
	}

	if (count == 0) //polinomio nullo, ossia non ho resto quindi poly_A e poly_B sono perfettamente divisibili
			{
		//creo polinomio nullo
		poly_add->coefficients = (int*) malloc(sizeof(int));
		poly_add->degrees = (int*) malloc(sizeof(int));
		poly_add->coefficients[0] = 0;
		poly_add->degrees[0] = 0;
		poly_add->num_elements = 1;

		free(coefficients);
		free(degrees);
	} else {
		coefficients = (int*) realloc(coefficients, sizeof(int) * count);
		degrees = (int*) realloc(degrees, sizeof(int) * count);

		poly_add->coefficients = coefficients;
		poly_add->degrees = degrees;
		poly_add->num_elements = count;
	}

	for (i = 0; i < max_num_el; i++) {
	}
	free(new_coef);
	free(new_deg);
}

void r_big_polynomial_mul(r_big_polynomial* poly_mul, r_big_polynomial poly_A,
		r_big_polynomial poly_B, int p) {
	int num_el_A = poly_A.num_elements;
	int num_el_B = poly_B.num_elements;

	int max_num_el = num_el_A * num_el_B;
	int* new_coef = (int*) malloc(sizeof(int) * max_num_el);
	int* new_deg = (int*) malloc(sizeof(int) * max_num_el);

	int i, j, z, k;

	for (i = 0; i < max_num_el; i++) {
		new_coef[i] = 0;
		new_deg[i] = -1; //mi serve come segnalatore di posizione non dirty
	}

	int cur_deg;
	cur_deg = 0;

	int cur_coef;
	cur_coef = 0;

	for (i = 0; i < num_el_A; i++) //scorro primo polinomio
			{
		for (j = 0; j < num_el_B; j++) //scorro secondo polinomio
				{
			cur_deg = poly_A.degrees[i] + poly_B.degrees[j]; //il grado è la somma dei due gradi
			cur_coef = poly_A.coefficients[i] * poly_B.coefficients[j]; //il coefficiente è il prodotto dei due coefficienti

			for (z = 0; z < max_num_el; z++) //scorro polinomio prodotto (ancora non completamente inizializzati i gradi e coefficienti relativi) alla ricerca della posizione in cui inserire il nuovo elemento
					{
				if ((new_deg[z] - -1) == 0) //aggiungo semplicemente il nuovo termine, perchè -1 è il segnalatore che questo posto è libero
						{
					new_deg[z] = cur_deg;
					new_coef[z] = cur_coef;
					break;
				}

				if ((cur_deg - new_deg[z]) == 0) //se ho aggiunto già un termine di questo grado, aggiorno il relativo coefficiente (il grado chiaramente resta invariato)
						{
					new_coef[z] = new_coef[z] + cur_coef;
					break;
				}

				if ((cur_deg - new_deg[z]) < 0) //inserisco in posizione z l'elemento cur_deg, ma prima shifto a destra tutti gli elementi diversi da -1
						{
					int max_num_el_shift = max_num_el - 1 - z; //massimo numero di elementi shiftabili (l'ultimo lo tengo fuori)
					int* shift_deg = (int*) malloc(
							sizeof(int) * max_num_el_shift);
					int* shift_coef = (int*) malloc(
							sizeof(int) * max_num_el_shift);

					int count = 0;
					//l'ultimo elemento chiaramente non è da shiftare, altrimenti vai out of bound. Viene sovrascritto (perchè tanto è necessariamente -1)
					for (k = z; k < max_num_el - 1; k++) //mi copio i valore da shiftare (quindi quelli diversi da -1)
							{
						if ((new_deg[k] - -1) == 0)
							break;

						shift_deg[count] = new_deg[k];
						shift_coef[count] = new_coef[k];
						count++;
					}

					new_deg[z] = cur_deg;
					new_coef[z] = cur_coef;

					for (k = 0; k < count; k++) //li copio di nuovo nell'array dei coefficienti
							{
						z++;
						new_deg[z] = shift_deg[k];
						new_coef[z] = shift_coef[k];
					}

					free(shift_deg);
					free(shift_coef);

					break;
				}
			}
		}
	}

	int* coefficients = (int*) malloc(sizeof(int) * max_num_el);
	int* degrees = (int*) malloc(sizeof(int) * max_num_el);

	int count = 0;
	for (i = 0; i < max_num_el; i++) {
		if ((new_deg[i] - -1) == 0)
			break;
		//printf("%Zd*x^%Zd\n", new_coef[i], new_deg[i]);
		new_coef[i] = new_coef[i] % p;

		if ((new_coef[i] - 0) == 0) //se il coefficiente è nullo, non dovrò inserirlo nell'array finale, quindi tengo fermo il conteggio di elementi dell'array finale
			continue;

		coefficients[count] = new_coef[i];
		degrees[count] = new_deg[i];

		count++;
	}

	if (count == 0) //polinomio nullo
			{
		//creo polinomio nullo
		poly_mul->coefficients = (int*) malloc(sizeof(int));
		poly_mul->degrees = (int*) malloc(sizeof(int));
		poly_mul->coefficients[0] = 0;
		poly_mul->degrees[0] = 0;
		poly_mul->num_elements = 1;

		free(coefficients);
		free(degrees);
	} else {
		coefficients = (int*) realloc(coefficients, sizeof(int) * count);
		degrees = (int*) realloc(degrees, sizeof(int) * count);

		poly_mul->coefficients = coefficients;
		poly_mul->degrees = degrees;
		poly_mul->num_elements = count;
	}

	for (i = 0; i < max_num_el; i++) {
	}
	free(new_coef);
	free(new_deg);
}

/*
 void r_big_polynomial_new_add(r_big_polynomial* poly_add, r_big_polynomial poly_A, r_big_polynomial poly_B, mpz_t p)
 {
 int num_el_A = poly_A.num_elements;
 int num_el_B = poly_B.num_elements;

 int max_num_el = num_el_A + num_el_B;
 mpz_t* new_coef_tmp = (mpz_t*)malloc(sizeof(mpz_t)*max_num_el);
 mpz_t* new_deg_tmp = (mpz_t*)malloc(sizeof(mpz_t)*max_num_el);

 mpz_t cur_deg;
 mpz_init(cur_deg);

 mpz_t cur_coef;
 mpz_init(cur_coef);

 int i;
 int j;
 int k = 0;

 for(k = 0; k < max_num_el; k++)
 {
 mpz_init(new_deg_tmp[k]);
 mpz_init(new_coef_tmp[k]);
 }

 k = 0;
 for(i = 0; i < num_el_A; i++) //scorro primo polinomio
 {
 mpz_set(new_deg_tmp[k], poly_A.degrees[i]);
 mpz_set(new_coef_tmp[k], poly_A.coefficients[i]);
 k++;
 }

 for(j = 0; j < num_el_B; j++) //scorro secondo polinomio
 {
 mpz_set(new_deg_tmp[k], poly_B.degrees[j]);
 mpz_set(new_coef_tmp[k], poly_B.coefficients[j]);
 k++;
 }

 quicksort_deg_coef_bottom_up(new_deg_tmp, new_coef_tmp, 0, max_num_el - 1);

 int equals = 0; //numero di elementi uguali (stesso grado, non interessa coefficiente) fra i due polinomi

 for(i = 0; i < num_el_A; i++) //scorro primo polinomio
 {
 for(j = 0; j < num_el_B; j++) //scorro secondo polinomio
 {
 if(mpz_cmp(poly_A.degrees[i], poly_B.degrees[j]) == 0)
 equals++;
 }
 }

 int new_num_el = num_el_A + num_el_B - equals;

 //printf("new_num_el: %d\n", new_num_el);

 mpz_t* new_coef = (mpz_t*)malloc(sizeof(mpz_t)*new_num_el);
 mpz_t* new_deg = (mpz_t*)malloc(sizeof(mpz_t)*new_num_el);

 k = 0;
 for(i = 0; i < max_num_el; i++)
 {
 mpz_set(cur_coef, new_coef_tmp[i]);
 mpz_set(cur_deg, new_deg_tmp[i]);

 //printf("new_coef_tmp[%d]: %Zd\t", i, cur_coef);
 //printf("new_deg_tmp[%d]: %Zd\n", i, cur_deg);

 for(j = i + 1; j < max_num_el; j++)
 {
 if(mpz_cmp(new_deg_tmp[j], cur_deg) == 0)
 {
 //printf("----\n");
 //printf("new_coef_tmp[%d]: %Zd\t", j, new_coef_tmp[j]);
 //printf("new_deg_tmp[%d]: %Zd\n", j, new_deg_tmp[j]);
 //printf("----\n");

 mpz_add(cur_coef, cur_coef, new_coef_tmp[j]);
 }
 else
 {
 break;
 }
 }
 mpz_init_set(new_coef[k], cur_coef);
 mpz_init_set(new_deg[k], cur_deg);
 k++;
 i = j - 1; //così vado direttamente al grado successivo
 }

 //printf("k: %d\n", k);

 init_real_big_polynomial(new_coef, new_num_el, new_deg, new_num_el, poly_add, p);

 for(k = 0; k < max_num_el; k++)
 {
 mpz_clear(new_deg_tmp[k]);
 mpz_clear(new_coef_tmp[k]);
 }

 free(new_deg_tmp);
 free(new_coef_tmp);

 mpz_clear(cur_deg);
 mpz_clear(cur_coef);

 for(k = 0; k < new_num_el; k++)
 {
 mpz_clear(new_coef[k]);
 mpz_clear(new_deg[k]);
 }

 free(new_coef);
 free(new_deg);
 }
 */
/*
 void r_big_polynomial_new_mul(r_big_polynomial* poly_mul, r_big_polynomial poly_A, r_big_polynomial poly_B, mpz_t p)
 {
 int num_el_A = poly_A.num_elements;
 int num_el_B = poly_B.num_elements;

 int i;
 int j;
 int k = 0;

 mpz_t cur_deg; //ad ogni iterazione calcolo il grado del termine corrente, mi basta una variabile tanto nella hashtable salvo la stringa con il grado
 mpz_init(cur_deg);

 //generazione dimensione massima chiave
 mpz_t max_degree; //grado massimo fra polinomio A e B

 if(mpz_cmp(poly_A.degrees[num_el_A - 1], poly_B.degrees[num_el_B - 1]) >= 0)
 mpz_init_set(max_degree, poly_A.degrees[num_el_A - 1]);
 else
 mpz_init_set(max_degree, poly_B.degrees[num_el_B - 1]);

 int max_key_string_size = mpz_sizeinbase(max_degree, 10) + 2; //i due byte in più sono per l'eventuale segno e per il cararattere di terminazione della stringa
 //la chiave è generata dal grado del termine corrente, quindi se prendo il grado massimo non ho problemi di dimensionamento (non devo riallocare spazio per chiavi più grandi)

 int max_num_el = num_el_A*num_el_B;

 //Quando un elemento viene aggiunto alla hashtable, viene inserito il relativo indirizzo e non una copia dell'elemento, quindi per ogni chiave è necessario inserire una variabile-valore differente! (per questo creo array)
 mpz_t* coef_in_ht = (mpz_t*)malloc(sizeof(mpz_t)*max_num_el);

 char* keys_in_ht = (char*)malloc(sizeof(char)*max_key_string_size);

 printf("-------\n");
 printf("max_num_el: %d\n", max_num_el);

 int hint = 1000; //max_num_el

 hashmap* ht = newHashmap(hint);

 for(i = 0; i < num_el_A; i++) //scorro primo polinomio
 {
 for(j = 0; j < num_el_B; j++) //scorro secondo polinomio
 {
 mpz_init(coef_in_ht[k]);

 mpz_add(cur_deg, poly_A.degrees[i], poly_B.degrees[j]); //il grado è la somma dei due gradi
 mpz_mul(coef_in_ht[k], poly_A.coefficients[i], poly_B.coefficients[j]); //il coefficiente è il prodotto dei due coefficienti

 mpz_get_str(keys_in_ht, 10, cur_deg);

 mpz_t* ht_element; //è solo un puntatore ad un elemento della hash table, non và clearato!
 ht_element = hashmapGet(ht, keys_in_ht);

 //printf("cur_deg: %Zd\t", cur_deg);
 //printf("key: -%s-\t\t", keys_in_ht);
 //printf("cur_coef: %Zd\t\t", coef_in_ht[k]);

 if(ht_element == NULL)
 {
 hashmapSet(ht, (void*)&coef_in_ht[k], keys_in_ht);
 //printf("NULL: ");
 }
 else
 {	//printf("%Zd\t\t", *ht_element);
 mpz_add(coef_in_ht[k], coef_in_ht[k], *ht_element); //così stò modificando direttamente l'elemento nella hashtable
 hashmapSet(ht, (void*)&coef_in_ht[k], keys_in_ht);
 }

 //ht_element = hashmapGet(ht, keys_in_ht);
 //printf("%Zd\n", *ht_element);

 k++;
 }
 }
 //printf("-------\n");
 //hashmapProcess(ht, hashmapProcGetAllKeys);
 //printf("-------\n");

 int num_elements = ht->count;

 //printf("num_elements: %d\n", ht->count);
 printf("-------\n");

 mpz_t* deg = (mpz_t*)malloc(sizeof(mpz_t)*num_elements);
 mpz_t* coef = (mpz_t*)malloc(sizeof(mpz_t)*num_elements);

 for(i = 0; i < num_elements; i++)
 {
 mpz_init(deg[i]);
 mpz_init(coef[i]);
 }

 hashmapGetDegCoef(ht, deg, coef);

 //for(i = 0; i < num_elements; i++)
 //{
 //	printf("deg[%d]: %Zd\t\t", i, deg[i]);
 //	printf("coef[%d]: %Zd\n", i, coef[i]);
 //}

 init_real_big_polynomial(coef, num_elements, deg, num_elements, poly_mul, p);

 //clear
 mpz_clear(cur_deg);
 mpz_clear(max_degree);

 deleteHashmap(ht); //distrugge la hashtable, ma non gli elementi contenuti in essa!

 //elimino gli elementi che prima stavano nella hashtable
 for(i = 0; i < max_num_el; i++)
 mpz_clear(coef_in_ht[i]);


 free(coef_in_ht);
 free(keys_in_ht);
 ////////////////////////////////////////////////////////

 //elimino i coefficienti e i gradi del nuovo polinomio
 for(i = 0; i < num_elements; i++)
 {
 mpz_clear(deg[i]);
 mpz_clear(coef[i]);
 }

 free(deg);
 free(coef);
 ////////////////////////////////////////////////////////
 }*/

//Algorithm 9.3.1 (Binary ladder exponentiation (left-right form))
void r_big_polynomial_iterative_ipow(r_big_polynomial* poly, int exp, int p) {
	//printf("Iterative Pow\n");
	unsigned long int num_bits = numPlaces(exp, 2); // intervallo bit: [0, num_bits - 1]
	//printf("num_bits: %lu\n", num_bits);

	r_big_polynomial poly_start;
	r_big_polynomial_copy(&poly_start, *poly); //polinomio iniziale

	r_big_polynomial poly_copy;
	r_big_polynomial_copy(&poly_copy, *poly);

	int j;
	for (j = num_bits - 2; j >= 0; j--) //parte dal penultimo bit
			{
		//printf("j: %d\n", j);
		r_big_polynomial_clear(poly);

		if (FAST_MUL_ADD)
			r_big_polynomial_fast_mul(poly, poly_copy, poly_copy, p);
		else
			r_big_polynomial_simple_mul(poly, poly_copy, poly_copy, p);

		r_big_polynomial_clear(&poly_copy);

		//printf("test_bit(%d): %d\n", j, mpz_tstbit(exp, j));

		if (((exp) & (1 << (j))) == 1) //yj == 1
				{
			if (FAST_MUL_ADD)
				r_big_polynomial_fast_mul(&poly_copy, *poly, poly_start, p);
			else
				r_big_polynomial_simple_mul(&poly_copy, *poly, poly_start, p);

			r_big_polynomial_clear(poly);
			r_big_polynomial_copy(poly, poly_copy);
		} else
			r_big_polynomial_copy(&poly_copy, *poly);
	}

	r_big_polynomial_clear(&poly_start);
	r_big_polynomial_clear(&poly_copy);
}

void r_big_polynomial_iterative_pow_mod(r_big_polynomial* poly,
		r_big_polynomial poly_mod, int exp, int p) {
	//printf("Iterative Pow\n");
	unsigned long int num_bits = numPlaces(exp, 2); // intervallo bit: [0, num_bits - 1]
	//printf("num_bits: %lu\n", num_bits);

	r_big_polynomial poly_start;
	r_big_polynomial_copy(&poly_start, *poly); //polinomio iniziale

	r_big_polynomial poly_copy;
	r_big_polynomial_copy(&poly_copy, *poly);

	r_big_polynomial poly_quoz_temp;

	int j;
	for (j = num_bits - 2; j >= 0; j--) //parte dal penultimo bit
			{
		//printf("j: %d\n", j);
		r_big_polynomial_clear(poly);

		if (FAST_MUL_ADD)
			r_big_polynomial_fast_mul(poly, poly_copy, poly_copy, p);
		else
			r_big_polynomial_simple_mul(poly, poly_copy, poly_copy, p);

		r_big_polynomial_clear(&poly_copy);

		if ((poly->degrees[poly->num_elements - 1]
				- poly_mod.degrees[poly_mod.num_elements - 1]) >= 0) //se ho superato o eguagliato il grado del polinomio poly_mod
				{
			r_big_polynomial_fast_mod(&poly_copy, &poly_quoz_temp, *poly,
					poly_mod, p);
			r_big_polynomial_clear(&poly_quoz_temp);

			r_big_polynomial_clear(poly);
			r_big_polynomial_copy(poly, poly_copy);
			r_big_polynomial_clear(&poly_copy);
		}

		//printf("test_bit(%d): %d\n", j, mpz_tstbit(exp, j));

		if (((exp) & (1 << (j))) == 1) //yj == 1
				{
			if (FAST_MUL_ADD)
				r_big_polynomial_fast_mul(&poly_copy, *poly, poly_start, p);
			else
				r_big_polynomial_simple_mul(&poly_copy, *poly, poly_start, p);

			r_big_polynomial_clear(poly);

			if ((poly_copy.degrees[poly_copy.num_elements - 1]
					- poly_mod.degrees[poly_mod.num_elements - 1]) >= 0) {
				r_big_polynomial_fast_mod(poly, &poly_quoz_temp, poly_copy,
						poly_mod, p); //problema qui per nextprime(10^500)

				r_big_polynomial_clear(&poly_quoz_temp);

				r_big_polynomial_clear(&poly_copy);
				r_big_polynomial_copy(&poly_copy, *poly);
			} else
				r_big_polynomial_copy(poly, poly_copy);
		} else
			r_big_polynomial_copy(&poly_copy, *poly);
	}

	r_big_polynomial_clear(&poly_start);
	r_big_polynomial_clear(&poly_copy);
	//poly_quoz_temp è già stato clearato
}

//Algorithm 2.1.5 (Recursive powering algorithm).
void r_big_polynomial_recursive_ipow(r_big_polynomial* poly, int exp, int p) {
	printf("exp: %Zd\n", exp);

	if ((exp - 1) == 0) //poly rimane invariato
		return;

	int new_exp;
	new_exp = 0;

	r_big_polynomial poly_copy;
	r_big_polynomial_copy(&poly_copy, *poly);

	int exp_mod;
	exp_mod = 0;
	exp_mod = exp % 2;

	if ((exp_mod - 0) == 0) //esponente pari
			{
		new_exp = exp / 2; //new_exp = exp/2

		r_big_polynomial_recursive_ipow(&poly_copy, new_exp, p); //ricorsione

		r_big_polynomial_clear(poly);

		if (FAST_MUL_ADD)
			r_big_polynomial_fast_mul(poly, poly_copy, poly_copy, p);
		else
			r_big_polynomial_simple_mul(poly, poly_copy, poly_copy, p);

		//printf("mul 1\n");

	} else //esponente dispari
	{
		new_exp = exp - 1;
		new_exp = exp / 2; //new_exp = (exp-1)/2

		r_big_polynomial_recursive_ipow(&poly_copy, new_exp, p); //ricorsione

		r_big_polynomial poly_temp_mul_1;

		if (FAST_MUL_ADD)
			r_big_polynomial_fast_mul(&poly_temp_mul_1, poly_copy, poly_copy,
					p);
		else
			r_big_polynomial_simple_mul(&poly_temp_mul_1, poly_copy, poly_copy,
					p);

		//printf("mul 2.1\n");

		r_big_polynomial poly_copy2;
		r_big_polynomial_copy(&poly_copy2, *poly);

		r_big_polynomial_clear(poly);

		if (FAST_MUL_ADD)
			r_big_polynomial_fast_mul(poly, poly_copy2, poly_temp_mul_1, p);
		else
			r_big_polynomial_simple_mul(poly, poly_copy2, poly_temp_mul_1, p);

		//printf("mul 2.2\n");

		r_big_polynomial_clear(&poly_temp_mul_1);
		r_big_polynomial_clear(&poly_copy2);
	}
	r_big_polynomial_clear(&poly_copy);
}

int r_big_polynomial_is_equal(r_big_polynomial* poly_A,
		r_big_polynomial* poly_B) {
	int num_el_A = poly_A->num_elements;
	int num_el_B = poly_B->num_elements;

	if (num_el_A != num_el_B)
		return 0; //diversi

	int i;

	for (i = 0; i < num_el_A; i++) {
		if ((poly_A->coefficients[i] - poly_B->coefficients[i]) != 0
				|| (poly_A->degrees[i] - poly_B->degrees[i]) != 0)
			return 0; //diversi
	}

	return 1; //uguali
}

void r_big_polynomial_printf(r_big_polynomial* poly) {
	int i = 0;
	for (i = 0; i < poly->num_elements; i++) {
		printf("%Zd x^%Zd \n", poly->coefficients[i], poly->degrees[i]);
	}
}

void r_big_polynomial_copy(r_big_polynomial* poly_A, r_big_polynomial poly_B) {
	poly_A->num_elements = poly_B.num_elements;

	poly_A->coefficients = (int*) malloc(sizeof(int) * poly_A->num_elements);
	poly_A->degrees = (int*) malloc(sizeof(int) * poly_A->num_elements);

	int i;
	for (i = 0; i < poly_B.num_elements; i++) {
		poly_A->coefficients[i] = poly_B.coefficients[i];
		poly_A->degrees[i] = poly_B.degrees[i];
	}
}

void r_big_polynomial_clear(r_big_polynomial* poly) {
	int i;
	for (i = 0; i < poly->num_elements; i++) {
	}

	free(poly->coefficients);
	free(poly->degrees);

	poly->num_elements = 0;
}

//Algorithm 2.1.5 (Recursive powering algorithm) - pdf. 100
//visto che il secondo polinomio (il divisore) deve essere monico, moltiplico entrambi i polinomi per l'inverso del coefficiente del termine di grado massimo del divisore
//quando ho ottenuto il resto, poichè questo risulta moltiplicato per il termine di sopra, per "eliminarlo" moltiplico stavolta per il coefficiente stesso del termine di grado massimo del divisore (e non per l'inverso)
//Restituisce resto (poly_rem) e  quoziente (poly_quoz)
//fattorizza, ma trova solo le radici (quindi manca la molteplicità), ma a noi basta questo
void r_big_polynomial_fast_mod(r_big_polynomial* poly_rem,
		r_big_polynomial* poly_quoz, r_big_polynomial poly_xt,
		r_big_polynomial poly_yt, int p) {
	//////////////////////////////////////////////////////////////////////////////////////
	//Calcolo inverso del coefficiente di grado massimo del divisore (secondo polinomio)

	//RENDO MONICO IL SECONDO POLINOMIO
	int max_coefficient_yt;
	max_coefficient_yt = poly_yt.coefficients[poly_yt.num_elements - 1];

	if ((max_coefficient_yt - 1) != 0) //y_t non è monico
			{
		int inverse;
		inverse = 0;

		if (inverse = mul_inv(max_coefficient_yt, p) == 0) //inverso inesistente
				{
			printf("FAST MOD: Inverso di %Zd inesistente\n",
					max_coefficient_yt);
			exit(0);
			//return -1; //o deve crashare tutto????
		}

		//Moltiplico entrambi i polinomi per l'inverso del coefficiente di grado massimo del divisore (secondo polinomio) ed eseguo riduzione modulo è dei coefficienti
		//si potrebbero creare coefficienti intermedi nulli dopo il modulo, (??????) VEDIAMO
		int i;
		for (i = 0; i < poly_yt.num_elements; i++) {
			poly_yt.coefficients[i] = poly_yt.coefficients[i] * inverse;
			poly_yt.coefficients[i] = poly_yt.coefficients[i] % p;
		}
		for (i = 0; i < poly_xt.num_elements; i++) {
			poly_xt.coefficients[i] = poly_xt.coefficients[i] * inverse;
			poly_xt.coefficients[i] = poly_xt.coefficients[i] % p;
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////

	//1. [Initialize]
	if ((poly_yt.degrees[poly_yt.num_elements - 1] - 0) == 0) {
		int inverse;
		inverse = 0;

		if (inverse = mul_inv(poly_yt.coefficients[0], p) == 0) //inverso inesistente
				{
			printf("FUNC. FAST MOD: Inverso di %Zd inesistente\n",
					poly_yt.coefficients[0]);
			exit(0);
		}

		poly_quoz->coefficients = (int*) malloc(sizeof(int));
		poly_quoz->degrees = (int*) malloc(sizeof(int));
		poly_quoz->coefficients[0] = inverse;
		poly_quoz->degrees[0] = 0;
		poly_quoz->num_elements = 1;

		poly_rem->coefficients = (int*) malloc(sizeof(int));
		poly_rem->degrees = (int*) malloc(sizeof(int));
		poly_rem->coefficients[0] = 0;
		poly_rem->degrees[0] = 0;
		poly_rem->num_elements = 1;
		return;
	}

	int d;
	d = 0;
	d = poly_xt.degrees[poly_xt.num_elements - 1]
			- poly_yt.degrees[poly_yt.num_elements - 1];

	if ((d - 0) < 0) {
		poly_quoz->coefficients = (int*) malloc(sizeof(int));
		poly_quoz->degrees = (int*) malloc(sizeof(int));
		poly_quoz->coefficients[0] = 0;
		poly_quoz->degrees[0] = 0;
		poly_quoz->num_elements = 1;

		r_big_polynomial_copy(poly_rem, poly_xt);
		return;
	}

	//2. [Reversals]
	r_big_polynomial poly_X;
	r_big_polynomial poly_Y;

	r_big_polynomial_copy(&poly_X, poly_xt); //prima gli assegno xt e poi gli applico reverse
	r_big_polynomial_copy(&poly_Y, poly_yt);

	//printf("xt------------------------------\n");
	//r_big_polynomial_printf(&poly_X);
	//printf("xt------------------------------\n");

	//printf("yt------------------------------\n");
	//r_big_polynomial_printf(&poly_Y);
	//printf("yt------------------------------\n");

	r_big_polynomial_reversal(&poly_X,
			poly_xt.degrees[poly_xt.num_elements - 1]);
	r_big_polynomial_reversal(&poly_Y,
			poly_yt.degrees[poly_yt.num_elements - 1]);

	//printf("REVERSE X------------------------------\n");
	//r_big_polynomial_printf(&poly_X);
	//printf("REVERSE X------------------------------\n");

	//printf("REVERSE Y------------------------------\n");
	//r_big_polynomial_printf(&poly_Y);
	//printf("REVERSE Y------------------------------\n");

	//printf("D: %Zd\n", d);

	//3. [Reciprocation]
	r_big_polynomial poly_q_reciproc;
	r_big_polynomial_fast_inversion(&poly_q_reciproc, poly_Y, d, p);

	//printf("QRE------------------------------\n");
	//r_big_polynomial_printf(&poly_q_reciproc);
	//printf("QRE------------------------------\n");

	//4. [Multiplication and reduction]
	//printf("FAST MOD: fast_mul\n");

	if (FAST_MUL_ADD)
		r_big_polynomial_fast_mul(poly_quoz, poly_q_reciproc, poly_X, p);
	else
		r_big_polynomial_simple_mul(poly_quoz, poly_q_reciproc, poly_X, p);

	//printf("QUOZ------------------------------\n");
	//r_big_polynomial_printf(poly_quoz);
	//printf("QUOZ------------------------------\n");

	r_big_polynomial_truncate(poly_quoz, d);//sul libro mette t^(d+1) ma il risultato è un troncamento a d

	//printf("QUOZ------------------------------\n");
	//r_big_polynomial_printf(poly_quoz);
	//printf("QUOZ------------------------------\n");

	r_big_polynomial poly_neg_qY;
	//printf("FAST MOD: fast_mul\n");

	if (FAST_MUL_ADD)
		r_big_polynomial_fast_mul(&poly_neg_qY, *poly_quoz, poly_Y, p);
	else
		r_big_polynomial_simple_mul(&poly_neg_qY, *poly_quoz, poly_Y, p);

	//printf("NEG------------------------------\n");
	//r_big_polynomial_printf(&poly_neg_qY);
	//printf("NEG------------------------------\n");

	r_big_polynomial_negative(&poly_neg_qY, p);

	//printf("NEG------------------------------\n");
	//r_big_polynomial_printf(&poly_neg_qY);
	//printf("NEG------------------------------\n");

	if (FAST_MUL_ADD)
		r_big_polynomial_fast_add(poly_rem, poly_X, poly_neg_qY, p); //faccio add perchè ho già cambiato il segno
	else
		r_big_polynomial_simple_add(poly_rem, poly_X, poly_neg_qY, p); //faccio add perchè ho già cambiato il segno

	//printf("REM------------------------------\n");
	//r_big_polynomial_printf(poly_rem);
	//printf("REM------------------------------\n");

	int index;
	index = 0;

	int d_plus_1;
	d_plus_1 = 0;
	d_plus_1 = d + 1;

	r_big_polynomial_index(index, *poly_rem, d_plus_1);

	//printf("INDEX: %Zd\n", index);

	r_big_polynomial_degrade(poly_rem, index);

	//printf("REM------------------------------\n");
	//r_big_polynomial_printf(poly_rem);
	//printf("REM------------------------------\n");

	int rev_degree;
	rev_degree = 0;
	rev_degree = poly_xt.degrees[poly_xt.num_elements - 1] - index;

	//printf("REV_DEGREE: %Zd\n", rev_degree);

	//printf("QUOZ------------------------------\n");
	//r_big_polynomial_printf(poly_quoz);
	//printf("QUOZ------------------------------\n");

	//QUESTO CE L'HO AGGIUNTO IO!!!!!!!!!!!!!!
	if (poly_quoz->num_elements == 1) //ho visto che quando c'è un solo elemento, viene il coefficiente giusto ma il grado sbagliato
			{
		poly_quoz->degrees[0] = d; //setto il grado dell'unico termine alla differenza fra i gradi del dividendo e del divisore
	} else {
		r_big_polynomial_reversal(poly_quoz,
				poly_quoz->degrees[poly_quoz->num_elements - 1]); //ho visto che quando c'è più di un elemento il quoziente viene esattamente invertito (reverse)
	}

	//QUESTO CE L'HO AGGIUNTO IO!!!!!!!!!!!!!!

	//printf("QUOZ------------------------------\n");
	//r_big_polynomial_printf(poly_quoz);
	//printf("QUOZ------------------------------\n");

	r_big_polynomial_reversal(poly_rem, rev_degree);

	//printf("REM FINALE------------------------------\n");
	//r_big_polynomial_printf(poly_rem);
	//printf("REM FINALE------------------------------\n");

	//////////////////////////////////////////////////////////////////////////////////////
	//DEVO MOLTIPLICARE IL RESTO PER IL COEFFICIENTE (NON L'INVERSO) DEL TERMINE DI GRADO MAGGIORE DEL SECONDO POLINOMIO (IL DIVISORE) PRIMA DI RESTITUIRLO
	if ((max_coefficient_yt - 1) != 0) //se y_t non era monico
			{
		//moltiplico entrambi i polinomi per il coefficiente iniziale del secondo polinomio, per portarli allo stato iniziale
		int i;
		for (i = 0; i < poly_yt.num_elements; i++) {
			poly_yt.coefficients[i] = poly_yt.coefficients[i]
					* max_coefficient_yt;
			poly_yt.coefficients[i] = poly_yt.coefficients[i] % p;
		}
		for (i = 0; i < poly_xt.num_elements; i++) {
			poly_xt.coefficients[i] = poly_xt.coefficients[i]
					* max_coefficient_yt;
			poly_xt.coefficients[i] = poly_xt.coefficients[i] % p;
		}
		//MOLTIPLICO ANCHE IL RESTO PER IL PRIMO COEFFICIENTE, ----- IL QUOZIENTE RIMANE INVARIATO -----
		for (i = 0; i < poly_rem->num_elements; i++) {
			poly_rem->coefficients[i] = poly_rem->coefficients[i]
					* max_coefficient_yt;
			poly_rem->coefficients[i] = poly_rem->coefficients[i] % p;
		}
	}

	r_big_polynomial_clear(&poly_X);
	r_big_polynomial_clear(&poly_Y);
	r_big_polynomial_clear(&poly_q_reciproc);
	r_big_polynomial_clear(&poly_neg_qY);
}

//diminuisce ogni termini del grado degree, restituisce anche termini negativi (anche se l'algoritmo che lo richiama evita che succeda questo, passandogli un grado "consistente")
void r_big_polynomial_degrade(r_big_polynomial* poly, int degree) {
	int num_el = poly->num_elements;
	int i;

	for (i = 0; i < num_el; i++) {
		poly->degrees[i] = poly->degrees[i] - degree;
	}
}

//ogni coefficiente viene moltiplicato per -1 e vengono eseguiti calcoli mod p subito dopo
void r_big_polynomial_negative(r_big_polynomial* poly, int p) {
	int i;
	for (i = 0; i < poly->num_elements; i++) {
		poly->coefficients[i] = -poly->coefficients[i];
		poly->coefficients[i] = poly->coefficients[i] % p;
	}
}

void r_big_polynomial_reversal(r_big_polynomial* poly, int degree) {
	int i;
	int found = 0;
	for (i = 0; i < poly->num_elements; i++) //controllo che il polinomio non sia completamente nullo
			{
		if ((poly->coefficients[i] - 0) != 0) {
			found = 1;
			break;
		}
	}
	if (!found)
		return;

	//printf("ASSERTION\n");
	//printf("degree: %Zd\n", degree);
	assert((degree - 0) >= 0);
	//printf("ASSERTION PASSED\n");
	int num_el = poly->num_elements;

	//anche se il grado è maggiore di quello del polinomio, non devo abbassarlo!!!

	int k = 0;

	int temp_deg;
	temp_deg = 0;

	int* new_coef = (int*) malloc(sizeof(int) * num_el); //poi rialloco
	int* new_deg = (int*) malloc(sizeof(int) * num_el);

	for (i = poly->num_elements - 1; i >= 0; i--) {
		if ((poly->degrees[i] - degree) > 0)
			continue;

		temp_deg = degree - poly->degrees[i];
		new_coef[k] = poly->coefficients[i];
		new_deg[k] = temp_deg;
		k++;
	}
	new_coef = (int*) realloc(new_coef, sizeof(int) * k);
	new_deg = (int*) realloc(new_deg, sizeof(int) * k);

	r_big_polynomial_clear(poly);

	poly->coefficients = new_coef;
	poly->degrees = new_deg;
	poly->num_elements = k;
}
//out_degree viene allocato dentro alla funzione
void r_big_polynomial_index(int out_degree, r_big_polynomial poly,
		int in_degree) {
	int num_el = poly.num_elements;
	int i;

	for (i = 0; i < num_el; i++) {
		if ((poly.degrees[i] - in_degree)
				>= 0 /*&& mpz_cmp(poly.coefficients[i], 0) != 0*/) //il coefficiente automatico è non nullo
				{
			out_degree = poly.degrees[i];
			return;
		}
	}

	out_degree = 0;
}

//MODIFICATO MODIFICATO
//considera solo i termini di poly fino al grado degree INCLUSO (quindi se sul libro gli passo d+1 per intendere d incluso, qua gli passo semplicemente d
void r_big_polynomial_truncate(r_big_polynomial* poly, int degree) {
	assert((degree - 0) >= 0);

	int poly_degree;
	poly_degree = poly->degrees[poly->num_elements - 1];

	if ((poly_degree - degree) <= 0) //grado a cui voglio troncare è maggiore o uguale al grado del polinomio
			{
		return;
	}

	int count = 0;
	int i;
	for (i = 0; i < poly->num_elements; i++) {
		if ((poly->degrees[i] - degree) > 0)
			break;

		count++;
	}

	for (i = count + 1; i < poly->num_elements; i++) {
	}

	poly->coefficients = (int*) realloc(poly->coefficients,
			sizeof(int) * count);
	poly->degrees = (int*) realloc(poly->degrees, sizeof(int) * count);
	poly->num_elements = count;
}

void r_big_polynomial_fast_inversion(r_big_polynomial* poly_trunc_recip,
		r_big_polynomial poly_x, int degree, int p) {
	//IN REALTA' VISTO CHE IL SECONDO POLINOMIO NEL MOD LO IMPONGO MONICO, MI TROVO CHE Y, CHE E' IL REVERSE DEL SECONDO POLINOMIO, HA SEMPRE X0 = 1 E QUINDI POTREI EVITARE QUESTE OPERAZIONI
	//////////////////////////////////////////////////////////////////////////////////////
	int min_coefficient_x; //coefficiente termine di grado più basso
	min_coefficient_x = poly_x.coefficients[0];

	//se il coefficiente del termine di grado zero è nullo, non effettuo questa operazione
	if ((min_coefficient_x - 1) != 0 && (poly_x.degrees[0] - 0) == 0) //x non ha il coefficiente di grado 0 pari a 1
			{
		int inverse;
		inverse = 0;

		if (inverse = mul_inv(min_coefficient_x, p) == 0) //inverso inesistente
				{
			printf("FAST INVERSION: Inverso di %Zd inesistente\n",
					min_coefficient_x);
			exit(0);
			//return -1; //o deve crashare tutto????
		}

		//Moltiplico il polinomio per l'inverso del coefficiente di grado minimo, per rendere quest'ultimo pari a 1
		//si potrebbero creare coefficienti intermedi nulli dopo il modulo, (??????) VEDIAMO
		int i;
		for (i = 0; i < poly_x.num_elements; i++) {
			poly_x.coefficients[i] = poly_x.coefficients[i] * inverse;
			poly_x.coefficients[i] = poly_x.coefficients[i] % p;
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////

	//VORREBBE X0 = 1, ma forse è uguale anche senza, boh da testare!
	//1. [Initialize]
	r_big_polynomial* poly_g_t = (r_big_polynomial*) malloc(
			sizeof(r_big_polynomial));
	; //g(t) = 1
	poly_g_t->coefficients = (int*) malloc(sizeof(int));
	poly_g_t->degrees = (int*) malloc(sizeof(int));
	poly_g_t->coefficients[0] = 1; //1
	poly_g_t->degrees[0] = 0;
	poly_g_t->num_elements = 1;

	int n;
	n = 1;
	int N_plus_1;
	N_plus_1 = 0;
	N_plus_1 = degree + 1;

	int n_minus_1;
	n_minus_1 = 0;

	int two;
	two = 2;

	//2. [Newton loop]

	//int counter_inv = 0;

	while ((n - N_plus_1) < 0) {
		//printf("n: %Zd\n", n);
		n = n * two;

		if ((n - N_plus_1) > 0)
			n = N_plus_1;

		n_minus_1 = n - 1;

		r_big_polynomial poly_x_trunc;
		r_big_polynomial_copy(&poly_x_trunc, poly_x);

		r_big_polynomial_truncate(&poly_x_trunc, n_minus_1); //sul libro c'è scritto mod t^ n che è un troncamento al grado n-1 incluso

		//printf("POLINOMIO X_TRUNC\n");
		//r_big_polynomial_printf(&poly_x_trunc);
		//printf("POLINOMIO X_TRUNC\n");

		r_big_polynomial poly_h_t_neg;

		//printf("FAST INVERSION: fast_mul\n");

		/*printf("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
		 printf("counter_inv: %d\n", counter_inv);
		 printf("POLINOMIO G\n");
		 r_big_polynomial_printf(poly_g_t);
		 printf("POLINOMIO G\n");

		 printf("POLINOMIO X_TRUNC\n");
		 r_big_polynomial_printf(&poly_x_trunc);
		 printf("POLINOMIO X_TRUNC\n");

		 printf("-------------------------------------\n");*/

		if (FAST_MUL_ADD)
			r_big_polynomial_fast_mul(&poly_h_t_neg, poly_x_trunc, *poly_g_t,
					p);
		else
			r_big_polynomial_simple_mul(&poly_h_t_neg, poly_x_trunc, *poly_g_t,
					p);

		r_big_polynomial_truncate(&poly_h_t_neg, n_minus_1);

		//printf("poly_h_t_neg.num_elements: %d\n", poly_h_t_neg.num_elements);

		/*printf("-------------------------------------\n");
		 printf("--------------------------------n_minus_1: %Zd----------------------------------------------------------------\n", n_minus_1);
		 printf("counter_inv: %d\n", counter_inv);
		 printf("POLINOMIO h_t_neg\n");
		 r_big_polynomial_printf(&poly_h_t_neg);
		 printf("POLINOMIO h_t_neg\n");
		 printf("-------------------------------------\n");*/

		r_big_polynomial_negative(&poly_h_t_neg, p); //-h(t)

		if ((poly_h_t_neg.degrees[0] - 0) == 0) //se c'è il termine costante
				{
			//printf("NON COSTANTE\n");
			//printf("-------\n");
			poly_h_t_neg.coefficients[0] = poly_h_t_neg.coefficients[0] + 2; //faccio add perchè prima ho negato ogni coefficiente
			poly_h_t_neg.coefficients[0] = poly_h_t_neg.coefficients[0] % p;
			//printf("-------\n");
		} else //shifto gli altri elementi e aggiungo il termine noto 2 in posizione 0
		{
			//printf("COSTANTE\n");
			int new_size = poly_h_t_neg.num_elements + 1;
			int* temp_coef = (int*) malloc(sizeof(int) * new_size);
			int* temp_deg = (int*) malloc(sizeof(int) * new_size);

			temp_coef[0] = 2;
			temp_deg[0] = 0;

			int i;
			for (i = 1; i < new_size; i++) {
				temp_coef[i] = poly_h_t_neg.coefficients[i - 1];
				temp_deg[i] = poly_h_t_neg.degrees[i - 1];
			}
			r_big_polynomial_clear(&poly_h_t_neg);
			poly_h_t_neg.coefficients = temp_coef;
			poly_h_t_neg.degrees = temp_deg;
			poly_h_t_neg.num_elements = new_size;
		}
		/*printf("-------------------------------------\n");
		 printf("counter_inv: %d\n", counter_inv);
		 printf("POLINOMIO G\n");
		 r_big_polynomial_printf(poly_g_t);
		 printf("POLINOMIO G\n");
		 printf("-------------------------------------\n");
		 printf("counter_inv: %d\n", counter_inv);
		 printf("POLINOMIO h_t_neg\n");
		 r_big_polynomial_printf(&poly_h_t_neg);
		 printf("POLINOMIO h_t_neg\n");
		 printf("-------------------------------------\n");*/

		r_big_polynomial poly_g_t_temp;
		//printf("FAST INVERSION: fast_mul\n");

		if (FAST_MUL_ADD)
			r_big_polynomial_fast_mul(&poly_g_t_temp, *poly_g_t, poly_h_t_neg,
					p);
		else
			r_big_polynomial_simple_mul(&poly_g_t_temp, *poly_g_t, poly_h_t_neg,
					p);

		r_big_polynomial_truncate(&poly_g_t_temp, n_minus_1);

		//printf("poly_g_t_temp.num_elements: %d\n", poly_g_t_temp.num_elements);

		r_big_polynomial_clear(poly_g_t);
		r_big_polynomial_copy(poly_g_t, poly_g_t_temp);

		/*printf("-------------------------------------\n");
		 printf("counter_inv: %d\n", counter_inv);
		 printf("POLINOMIO G\n");
		 r_big_polynomial_printf(poly_g_t);
		 printf("POLINOMIO G\n");
		 printf("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

		 //printf("POLINOMIO G\n");
		 //r_big_polynomial_printf(poly_g_t);
		 //printf("POLINOMIO G\n");*/
		//counter_inv++;
		r_big_polynomial_clear(&poly_x_trunc);
		r_big_polynomial_clear(&poly_h_t_neg);
		r_big_polynomial_clear(&poly_g_t_temp);
	}

	r_big_polynomial_copy(poly_trunc_recip, *poly_g_t);

	//printf("POLINOMIO RECIPROCO\n");
	//r_big_polynomial_printf(poly_trunc_recip);
	//printf("POLINOMIO RECIPROCO\n");

	//////////////////////////////////////////////////////////////////////////////////////
	//se il coefficiente del termine di grado zero era nullo, non effettuo questa operazione
	if ((min_coefficient_x - 1) != 0 && (poly_x.degrees[0] - 0) == 0) //x non aveva il coefficiente di grado 0 pari a 1
			{
		int i;
		//moltiplico di nuovo x per il coefficiente vecchio del termine di grado minimo del polinomio x
		for (i = 0; i < poly_x.num_elements; i++) {
			poly_x.coefficients[i] = poly_x.coefficients[i] * min_coefficient_x;
			poly_x.coefficients[i] = poly_x.coefficients[i] % p;
		}
		//moltiplico l'inverso per il coefficiente vecchio del termine di grado minimo del polinomio x
		for (i = 0; i < poly_trunc_recip->num_elements; i++) {
			poly_trunc_recip->coefficients[i] =
					poly_trunc_recip->coefficients[i] * min_coefficient_x;
			poly_trunc_recip->coefficients[i] =
					poly_trunc_recip->coefficients[i] % p;
		}
	}

	r_big_polynomial_clear(poly_g_t);
}
///////////////////////////////////////////////////////////////////////////////////////////
//Algorithm 2.2.1 (gcd for polynomials) - pdf.104
void r_big_polynomial_gcd(r_big_polynomial* poly_gcd, r_big_polynomial poly_A,
		r_big_polynomial poly_B, int p) {
	//1. [Initialize]
	r_big_polynomial* max_poly = (r_big_polynomial*) malloc(
			sizeof(r_big_polynomial)); //u
	r_big_polynomial* min_poly = (r_big_polynomial*) malloc(
			sizeof(r_big_polynomial));
	; //v

	r_big_polynomial poly_mod;
	r_big_polynomial poly_quoz;

	if ((poly_A.degrees[poly_A.num_elements - 1]
			- poly_B.degrees[poly_B.num_elements - 1]) >= 0) {
		r_big_polynomial_copy(max_poly, poly_A);
		r_big_polynomial_copy(min_poly, poly_B);
		//max_poly = &poly_A;
		//min_poly = &poly_B;
	} else {
		r_big_polynomial_copy(max_poly, poly_B);
		r_big_polynomial_copy(min_poly, poly_A);
		//max_poly = &poly_B;
		//min_poly = &poly_A;
	}
	//printf("----------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
	//printf("POLINOMIO MAX\n");
	//r_big_polynomial_printf(max_poly);
	//printf("POLINOMIO MAX\n");

	//printf("POLINOMIO MIN\n");
	//r_big_polynomial_printf(min_poly);
	//printf("POLINOMIO MIN\n");
	//printf("-----------------------------------------------------------------------------------\n");

	//2. [Euclid loop]
	//Esce solo quando il grado di min_poly è zero e il coefficiente del termine di grado minimo è anche zero, ossia v(x) = 0. Esce anche quando max_poly diventa di grado zero.

	//int counter = 0;

	//printf("Start While\n");
	while (((min_poly->degrees[min_poly->num_elements - 1] - 0) != 0
			|| (min_poly->coefficients[min_poly->num_elements - 1] - 0) != 0)
			&& (max_poly->degrees[max_poly->num_elements - 1] - 0) != 0) {
		//printf("while gcd1\n");

		//r_big_polynomial_printf(max_poly);
		//printf("-----------------\n");
		//r_big_polynomial_printf(min_poly);

		r_big_polynomial_fast_mod(&poly_mod, &poly_quoz, *max_poly, *min_poly,
				p);

		r_big_polynomial_clear(max_poly);
		r_big_polynomial_copy(max_poly, *min_poly);

		r_big_polynomial_clear(min_poly);
		r_big_polynomial_copy(min_poly, poly_mod);

		//counter++;

		//printf("Max degree: %Zd\n", max_poly->degrees[max_poly->num_elements - 1]);
		//printf("Min degree: %Zd\n", min_poly->degrees[min_poly->num_elements - 1]);

		//printf("POLINOMIO MAX\n");
		//r_big_polynomial_printf(max_poly);
		//printf("POLINOMIO MAX\n");

		//printf("POLINOMIO MIN\n");
		//r_big_polynomial_printf(min_poly);
		//printf("POLINOMIO MIN\n");

		//printf("-----------------------------------------------------------------------------------\n");

		r_big_polynomial_clear(&poly_mod);
		r_big_polynomial_clear(&poly_quoz);
	}
	//printf("End While\n");
	//printf("COUNTER: %d\n", counter);

	r_big_polynomial_copy(poly_gcd, *max_poly);

	//printf("POLINOMIO GCD\n");
	//r_big_polynomial_printf(poly_gcd);
	//printf("POLINOMIO GCD\n");

	//3. [Make monic]
	int inverse;
	inverse = 0;
	if (inverse = mul_inv(poly_gcd->coefficients[poly_gcd->num_elements - 1], p)
			== 0) //inverso inesistente
			{
		printf("GCD: Inverso di %Zd inesistente\n",
				poly_gcd->coefficients[poly_gcd->num_elements - 1]);
		exit(0);
		//return -1; //o deve crashare tutto????
	}
	int i;
	//moltiplico ogni termine per l'inverso del coefficiente di termine di grado maggiore
	for (i = 0; i < poly_gcd->num_elements; i++) {
		poly_gcd->coefficients[i] = poly_gcd->coefficients[i] * inverse;
		poly_gcd->coefficients[i] = poly_gcd->coefficients[i] % p;
	}
	//HO GIA' CANCELLATO I POLINOMI MOD E QUOZ ALLA FINE DEL CICLO WHILE SOPRA!
}

//Algorithm 9.6.1 (Fast polynomial multiplication: Binary segmentation) - pdf.519
void r_big_polynomial_fast_mul(r_big_polynomial* poly_mul,
		r_big_polynomial poly_A, r_big_polynomial poly_B, int p) {
	printf("Fast_Mul\n");
	int num_el_A = poly_A.num_elements;
	int num_el_B = poly_B.num_elements;

	int i;
	for (i = 0; i < num_el_A; i++) {
		//printf("deg[%d]: %Zd\n", i, poly_A.degrees[i]);

		if ((poly_A.coefficients[i] - 0) < 0)
			;
		poly_A.coefficients[i] = poly_A.coefficients[i] % p;
	}

	for (i = 0; i < num_el_B; i++) {
		//printf("deg[%d]: %Zd\n", i, poly_B.degrees[i]);

		if ((poly_B.coefficients[i] - 0) < 0)
			;
		poly_B.coefficients[i] = poly_B.coefficients[i] % p;
	}

	int D;
	D = poly_A.degrees[num_el_A - 1];
	D = D + 1; //grado di poly A + 1

	int E;
	E = poly_B.degrees[num_el_B - 1]; //grado di poly B + 1
	E = E + 1; //grado di poly B + 1

	int max_DE;

	if ((D - E) >= 0)
		max_DE = D;
	else
		max_DE = E;

	int max_xj; //il massimo dei coefficienti di poly A
	max_xj = poly_A.coefficients[0];

	for (i = 1; i < num_el_A; i++) {
		if ((poly_A.coefficients[i] - max_xj) > 0)
			max_xj = poly_A.coefficients[i];
	}

	int max_yk; //il massimo dei coefficienti di poly B
	max_yk = poly_B.coefficients[0];

	for (i = 1; i < num_el_B; i++) {
		if ((poly_B.coefficients[i] - max_yk) > 0)
			max_yk = poly_B.coefficients[i];
	}

	int max_mul; //max_DE * max_xj * max_yk
	max_mul = 0;

	max_mul = max_DE * max_xj;
	max_mul = max_mul * max_yk;

	//printf("MAX_MUL: %Zd\n", max_mul);

	int two;
	two = 2;

	unsigned long int b_ui = numPlaces(max_mul, 2); //numero di bit usati per rappresentare max_mul

	//printf("BUI: %lu\n", b_ui);

	int pow_two_b; //2^b
	pow_two_b = 0;

	//printf("b: %Zd\n", b);
	pow_two_b = ipow(two, b_ui); //se ho max=128, mi ritorna 8, ed è giusto che abbia 2^8 = 256 e non 2^7 = 128 perchè il risultato deve essere strettamente maggiore di max
	//printf("b: %d\n", b_ui);
	//printf("2^b: %Zd\n", pow_two_b);

	int temp_mul;
	temp_mul = 0;

	int num_tot_shift;
	num_tot_shift = 0;

	int X; //poly A valutato per x=2^b
	X = 0;

	unsigned long int counter_bit = 4294967295; //max range unsigned long int

	//printf("SHIFT\n");

	for (i = 0; i < num_el_A; i++) {
		num_tot_shift = poly_A.degrees[i] * b_ui; //numero totale di bit di cui devo shiftare
		//printf("num_tot_shift: %Zd\n", num_tot_shift);

		if ((num_tot_shift - counter_bit) <= 0) //shifto direttamente di num_tot_shift bit
				{
			unsigned long int shift_bit = (num_tot_shift % 2);
			temp_mul = poly_A.coefficients[i] << shift_bit; //(coefficiente termine corrente) * ( (2^b)^(grado termine corrente) )
			//printf("temp_mul: %Zd\n", temp_mul);
			X = X + temp_mul;
		} else {
			temp_mul = poly_A.coefficients[i];

			while ((num_tot_shift - counter_bit) > 0) //ad ogni iterazione shifto di counter_bit bit
			{
				unsigned long int shift_bit = counter_bit;
				temp_mul = temp_mul << shift_bit; //shifto di shift bit (senza moltiplicare per il coefficiente)
			}
			//ora num_tot_shift è inferiore a counter_bit
			unsigned long int shift_bit = (num_tot_shift % 2);
			temp_mul = temp_mul << shift_bit; //eseguo un ulteriore shift
			//printf("temp_mul: %Zd\n", temp_mul);
			X = X + temp_mul;
		}

		//mpz_powm(temp_pow, pow_two_b, poly_A.degrees[i], biggest_number); //(2^b)^(grado termine corrente)
		//mpz_mul(temp_mul, poly_A.coefficients[i], temp_pow); //(coefficiente termine corrente) * ( (2^b)^(grado termine corrente) )
		//mpz_add(X, X, temp_mul);
	}
	//printf("X: %Zd\n", X);

	int Y; //poly B valutato per x=2^b
	Y = 0;

	for (i = 0; i < num_el_B; i++) {
		num_tot_shift = poly_B.degrees[i] * b_ui; //numero totale di bit di cui devo shiftare
		//printf("num_tot_shift: %Zd\n", num_tot_shift);

		if ((num_tot_shift - counter_bit) <= 0) //shifto direttamente di num_tot_shift bit
				{
			unsigned long int shift_bit = (num_tot_shift % 2);
			temp_mul = poly_B.coefficients[i] << shift_bit; //(coefficiente termine corrente) * ( (2^b)^(grado termine corrente) )
			//printf("temp_mul: %Zd\n", temp_mul);
			Y = Y + temp_mul;
		} else {
			temp_mul = poly_B.coefficients[i];

			while ((num_tot_shift - counter_bit) > 0) //ad ogni iterazione shifto di counter_bit bit
			{
				unsigned long int shift_bit = counter_bit;
				temp_mul = temp_mul << shift_bit; //shifto di shift bit (senza moltiplicare per il coefficiente)
			}
			//ora num_tot_shift è inferiore a counter_bit
			unsigned long int shift_bit = (num_tot_shift % 2);
			temp_mul = temp_mul << shift_bit; //eseguo un ulteriore shift
			//printf("temp_mul: %Zd\n", temp_mul);
			Y = Y + temp_mul;
		}

		//mpz_powm(temp_pow, pow_two_b, poly_B.degrees[i], biggest_number); //(2^b)^(grado termine corrente)
		//mpz_mul(temp_mul, poly_B.coefficients[i], temp_pow); //(coefficiente termine corrente) * ( (2^b)^(grado termine corrente) )
		//mpz_add(Y, Y, temp_mul);
	}
	//printf("Y: %Zd\n", Y);

	int u;
	u = 0;
	u = X * Y; //IN FAST_ADD QUI C'E' UNA ADD!
	//printf("u: %Zd\n", u);

	int num_el_prod; //numero di elementi del polinomio prodotto (poly_A * poly_B)
	num_el_prod = 0;
	num_el_prod = D + E;
	num_el_prod = num_el_prod - 1; //D + E - 1

	unsigned long int num_el_prod_ui = (num_el_prod % 2);

	//printf("num_el_prod_ui: %lu\n", num_el_prod_ui);
	//printf("N: %d\n", num_el_A*num_el_B);

	int* prod_coef = (int*) malloc(sizeof(int) * num_el_prod_ui);
	int* prod_deg = (int*) malloc(sizeof(int) * num_el_prod_ui);

	for (i = 0; i < num_el_prod_ui; i++) {
		prod_coef[i] = 0;
		prod_deg[i] = 0;
	}

	unsigned long int l;

	int temp_mod;
	temp_mod = 0;

	//printf("num_el_prod_ui: %ld\n", num_el_prod_ui);

	for (l = 0; l < num_el_prod_ui; l++) {
		unsigned long int bl = b_ui * l;	//esponente di (2^b)^l
		temp_mod = u >> bl; //parte intera inferiore di ( u/( (2^b)^l ) ) fatta con shift di bit
		temp_mod = temp_mod & temp_mod; //il risultato di prima calcolato modulo 2^b
		temp_mod = temp_mod % p; //i coefficienti sono sempre e comunque modulo p

		prod_coef[l] = temp_mod;
		prod_deg[l] = l; //grado l
	}

	init_real_big_polynomial(prod_coef, num_el_prod_ui, prod_deg,
			num_el_prod_ui, poly_mul, p);

	//printf("MUL: INIT clear\n");
	for (i = 0; i < num_el_prod_ui; i++) {
	}
	free(prod_coef);
	free(prod_deg);
}

//Algorithm 9.6.1 (Fast polynomial multiplication: Binary segmentation). Adattato per l'addizione
void r_big_polynomial_fast_add(r_big_polynomial* poly_add,
		r_big_polynomial poly_A, r_big_polynomial poly_B, int p) {
	int num_el_A = poly_A.num_elements;
	int num_el_B = poly_B.num_elements;

	int i;
	for (i = 0; i < num_el_A; i++) {
		if ((poly_A.coefficients[i] - 0) < 0)
			;
		poly_A.coefficients[i] = poly_A.coefficients[i] % p;

	}

	for (i = 0; i < num_el_B; i++) {
		if ((poly_B.coefficients[i] - 0) < 0)
			;
		poly_B.coefficients[i] = poly_B.coefficients[i] % p;
	}

	int D;
	D = poly_A.degrees[num_el_A - 1];
	D = D + 1; //grado di poly A + 1

	int E;
	E = poly_B.degrees[num_el_B - 1]; //grado di poly B + 1
	E = E + 1; //grado di poly B + 1

	int max_DE;

	if ((D - E) >= 0)
		max_DE = D;
	else
		max_DE = E;

	int max_xj; //il massimo dei coefficienti di poly A
	max_xj = poly_A.coefficients[0];

	for (i = 1; i < num_el_A; i++) {
		if ((poly_A.coefficients[i] - max_xj) > 0)
			max_xj = poly_A.coefficients[i];
	}

	int max_yk; //il massimo dei coefficienti di poly B
	max_yk = poly_B.coefficients[0];

	for (i = 1; i < num_el_B; i++) {
		if ((poly_B.coefficients[i] - max_yk) > 0)
			max_yk = poly_B.coefficients[i];
	}

	int max_mul; //max_DE * max_xj * max_yk
	max_mul = 0;

	max_mul = max_DE * max_xj;
	max_mul = max_mul * max_yk;

	//printf("MAX_MUL: %Zd\n", max_mul);

	int two;
	two = 2;

	unsigned int b_ui = numPlaces(max_mul, 2); //numero di bit usati per rappresentare max_mul

	int pow_two_b; //2^b
	pow_two_b = 0;

	pow_two_b = ipow(two, b_ui);

	int temp_mul = 0;

	int num_tot_shift;
	num_tot_shift = 0;

	int X; //poly A valutato per x=2^b
	X = 0;

	unsigned long int counter_bit = 4294967295; //max range unsigned long int

	for (i = 0; i < num_el_A; i++) {
		num_tot_shift = poly_A.degrees[i] * b_ui; //numero totale di bit di cui devo shiftare
		//printf("num_tot_shift: %Zd\n", num_tot_shift);

		if ((num_tot_shift - counter_bit) <= 0) //shifto direttamente di num_tot_shift bit
				{
			unsigned long int shift_bit = (num_tot_shift % 2);
			temp_mul = poly_A.coefficients[i] << shift_bit; //(coefficiente termine corrente) * ( (2^b)^(grado termine corrente) )
			//printf("temp_mul: %Zd\n", temp_mul);
			X = X + temp_mul;
		} else {
			temp_mul = poly_A.coefficients[i];

			while ((num_tot_shift - counter_bit) > 0) //ad ogni iterazione shifto di counter_bit bit
			{
				unsigned long int shift_bit = counter_bit;
				temp_mul = temp_mul << shift_bit; //shifto di shift bit (senza moltiplicare per il coefficiente)
			}
			//ora num_tot_shift è inferiore a counter_bit
			unsigned long int shift_bit = (num_tot_shift % 2);
			temp_mul = temp_mul << shift_bit; //eseguo un ulteriore shift
			//printf("temp_mul: %Zd\n", temp_mul);
			X = X + temp_mul;
		}

		//mpz_powm(temp_pow, pow_two_b, poly_A.degrees[i], biggest_number); //(2^b)^(grado termine corrente)
		//mpz_mul(temp_mul, poly_A.coefficients[i], temp_pow); //(coefficiente termine corrente) * ( (2^b)^(grado termine corrente) )
		//mpz_add(X, X, temp_mul);
	}
	//printf("X: %Zd\n", X);

	int Y; //poly B valutato per x=2^b
	Y = 0;

	for (i = 0; i < num_el_B; i++) {
		num_tot_shift = poly_B.degrees[i] * b_ui; //numero totale di bit di cui devo shiftare
		//printf("num_tot_shift: %Zd\n", num_tot_shift);

		if ((num_tot_shift - counter_bit) <= 0) //shifto direttamente di num_tot_shift bit
				{
			unsigned long int shift_bit = (num_tot_shift % 2);
			temp_mul = poly_B.coefficients[i] << shift_bit; //(coefficiente termine corrente) * ( (2^b)^(grado termine corrente) )
			//printf("temp_mul: %Zd\n", temp_mul);
			Y = Y + temp_mul;
		} else {
			temp_mul = poly_B.coefficients[i];

			while ((num_tot_shift - counter_bit) > 0) //ad ogni iterazione shifto di counter_bit bit
			{
				unsigned long int shift_bit = counter_bit;
				temp_mul = temp_mul << shift_bit; //shifto di shift bit (senza moltiplicare per il coefficiente)
			}
			//ora num_tot_shift è inferiore a counter_bit
			unsigned long int shift_bit = (num_tot_shift % 2);
			temp_mul = temp_mul << shift_bit; //eseguo un ulteriore shift
			//printf("temp_mul: %Zd\n", temp_mul);
			Y = Y + temp_mul;
		}

		//mpz_powm(temp_pow, pow_two_b, poly_B.degrees[i], biggest_number); //(2^b)^(grado termine corrente)
		//mpz_mul(temp_mul, poly_B.coefficients[i], temp_pow); //(coefficiente termine corrente) * ( (2^b)^(grado termine corrente) )
		//mpz_add(Y, Y, temp_mul);
	}
	//printf("Y: %Zd\n", Y);

	int u;
	u = 0;
	u = X + Y; //IN FAST MUL QUESTO PEZZO E' UNA MUL
	//printf("u: %Zd\n", u);

	////////////////////////////////////////////////////////////////////////
	//cerco il numero di elementi del polinomio somma
	int num_equals = 0;

	for (i = 0; i < num_el_A; i++) {
		int j;
		for (j = 0; j < num_el_B; j++) {
			if ((poly_A.degrees[i] - poly_B.degrees[j]) == 0) //stesso grado
				num_equals++;
		}
	}

	int num_el_sum_ui = num_el_A + num_el_B - num_equals;

	int* possible_degrees = (int*) malloc(sizeof(int) * (num_el_sum_ui)); //contiene tutti i gradi possibili

	int cur_index = 0;

	for (i = 0; i < num_el_A; i++) {
		possible_degrees[cur_index] = poly_A.degrees[i];
		cur_index++;
	}

	for (i = 0; i < num_el_B; i++) {
		int j;
		int found = 0;

		for (j = 0; j < cur_index; j++) {
			if ((poly_B.degrees[i] - possible_degrees[j]) == 0) {
				found = 1;
				break;
			}
		}

		if (!found) {
			possible_degrees[cur_index] = poly_B.degrees[i];
			cur_index++;
		}
	}

	quicksort_bottom_up(possible_degrees, 0, num_el_sum_ui - 1);
	//printf("---------------------------------------------------------------------------\n");
	//for(i = 0; i < num_el_sum_ui; i++)
	//	printf("possible_degrees[%d]: %Zd\n", i, possible_degrees[i]);
	//printf("---------------------------------------------------------------------------\n");
	////////////////////////////////////////////////////////////////////////

	int* sum_coef = (int*) malloc(sizeof(int) * num_el_sum_ui);
	int* sum_deg = (int*) malloc(sizeof(int) * num_el_sum_ui);

	int temp_mod;
	temp_mod = 0;

	int l;
	for (l = 0; l < num_el_sum_ui; l++) {
		int cur_deg = (possible_degrees[l] % 2);
		int bl = b_ui * cur_deg;	//esponente di (2^b)^l
		temp_mod = u >> bl; //parte intera inferiore di ( u/( (2^b)^l ) ) fatta con shift di bit l sarebbe il grado corrente, quindi in realtà vale cur_deg
		temp_mod = temp_mod & temp_mod; //il risultato di prima calcolato modulo 2^b
		temp_mod = temp_mod % p; //i coefficienti sono sempre e comunque modulo p
		sum_coef[l] = temp_mod;
		sum_deg[l] = cur_deg; //grado l
	}

	init_real_big_polynomial(sum_coef, num_el_sum_ui, sum_deg, num_el_sum_ui,
			poly_add, p);

	//printf("NEW NUM SUM: %d\n", poly_add->num_elements);

	//printf("ADD: INIT clear\n");
	for (i = 0; i < num_el_sum_ui; i++) {
	}
	free(sum_coef);
	free(sum_deg);

	for (i = 0; i < num_el_sum_ui; i++) {
	}

	free(possible_degrees);
}

//low = 0 (posizione primo elemento), high = DIM - 1 (posizione ultimo elemento) - ordina in maniera crescente
void quicksort_bottom_up(int* deg, int low, int high) {
	int i = low;
	int j = high;
	int y;
	y = 0;

	// compare value
	int z;
	z = deg[(low + high) / 2];

	// partition
	do {
		// find member above ...
		while ((deg[i] - z) < 0)
			i++;

		// find element below ...
		while ((deg[j] - z) > 0)
			j--;

		if (i <= j) {
			// swap two elements
			y = deg[i];
			deg[i] = deg[j];
			deg[j] = y;

			i++;
			j--;
		}
	} while (i <= j);

	// recurse
	if (low < j)
		quicksort_bottom_up(deg, low, j);

	if (i < high)
		quicksort_bottom_up(deg, i, high);

}

//low = 0 (posizione primo elemento), high = DIM - 1 (posizione ultimo elemento) - ordina in maniera crescente per grado, e tiene la corrispondenza con i coefficienti
void quicksort_deg_coef_bottom_up(int deg[], int coef[], int low, int high) {
	int i = low;
	int j = high;
	int y;
	y = 0;
	int c;
	c = 0;
	// compare value
	int z;
	z = deg[(low + high) / 2];

	// partition
	do {
		// find member above ...
		while ((deg[i] - z) < 0)
			i++;

		// find element below ...
		while ((deg[j] - z) > 0)
			j--;

		if (i <= j) {
			// swap two elements
			y = deg[i];
			c = coef[i];

			deg[i] = deg[j];
			coef[i] = coef[j];

			deg[j] = y;
			coef[j] = c;

			i++;
			j--;
		}
	} while (i <= j);

	// recurse
	if (low < j)
		quicksort_deg_coef_bottom_up(deg, coef, low, j);

	if (i < high)
		quicksort_deg_coef_bottom_up(deg, coef, i, high);

}

//Algorithm 2.3.10 (Roots of a polynomial over Fp) - pdf.117
//root_set->roots viene inizializzato con mpz_init dentro alla funzione
void roots(s_root_set* root_set, r_big_polynomial poly, int p) {
	//p deve essere dispari
	int test_p;
	test_p = 0;
	test_p = p % 2;
	assert((test_p - 0) != 0);

	//////////////////////////////////////////////////////////////
	//polinomio g(x)
	r_big_polynomial poly_gx;
	r_big_polynomial_copy(&poly_gx, poly);
	//////////////////////////////////////////////////////////////

	/*
	 int i;
	 I PASSAGGI SOTTO COMMENTATI IN REALTA' SONO EVITABILI, PERCHE' A ME COMPLICANO SOLO LA VITA COL FATTO CHE IL GRADO DEL POLINOMIO x^p DIVENTA IMMENSO CON PROBLEMI QUINDI SU BIGGEST NUMBER ECC ECC
	 //////////////////////////////////////////////////////////////
	 //polinomi x^p e x^p mod
	 mpz_t* coef_xp = (mpz_t*)malloc(sizeof(mpz_t));
	 mpz_init_set_ui(coef_xp[0], 1);
	 mpz_t* deg_xp = (mpz_t*)malloc(sizeof(mpz_t));
	 mpz_init_set(deg_xp[0], p);

	 r_big_polynomial poly_xp;
	 poly_xp.coefficients = coef_xp;
	 poly_xp.degrees = deg_xp;
	 poly_xp.num_elements = 1;



	 r_big_polynomial poly_xp_mod;
	 r_big_polynomial poly_temp_quoz;

	 //If p > deg g, one should first compute x^p mod g(x) (usando r_big_polynomial_pow)
	 if(mpz_cmp(p, poly_gx.degrees[poly_gx.num_elements - 1]) > 0)
	 {
	 r_big_polynomial_fast_mod(&poly_xp_mod, &poly_temp_quoz, poly_xp, poly_gx, p);
	 r_big_polynomial_clear(&poly_temp_quoz);
	 }
	 else
	 r_big_polynomial_copy(&poly_xp_mod, poly_xp);

	 //////////////////////////////////////////////////////////////

	 //////////////////////////////////////////////////////////////
	 //polinomio -x
	 mpz_t* coef_x = (mpz_t*)malloc(sizeof(mpz_t));
	 mpz_init_set_si(coef_x[0], -1);
	 mpz_mod(coef_x[0], coef_x[0], p);
	 mpz_t* deg_x = (mpz_t*)malloc(sizeof(mpz_t));
	 mpz_init_set_ui(deg_x[0], 1);

	 r_big_polynomial poly_x;
	 poly_x.coefficients = coef_x;
	 poly_x.degrees = deg_x;
	 poly_x.num_elements = 1;

	 //////////////////////////////////////////////////////////////

	 //////////////////////////////////////////////////////////////
	 //x^p - x
	 r_big_polynomial poly_xp_x;
	 r_big_polynomial_fast_add(&poly_xp_x, poly_xp_mod, poly_x, p);



	 //1. [Initial adjustments]
	 r_big_polynomial poly_gcd;
	 r_big_polynomial_gcd(&poly_gcd, poly_xp_x, poly_gx, p);

	 r_big_polynomial_clear(&poly_gx);
	 r_big_polynomial_copy(&poly_gx, poly_gcd);

	 r_big_polynomial_clear(&poly_gcd);*/

	//poly_gx ha tante radici quanto il suo grado. Visto che non teniamo conto della molteplicità, in realtà l'array potrebbe risultare più piccolo contanto ogni radice solo una volta
	unsigned long int num_radix =
			(poly_gx.degrees[poly_gx.num_elements - 1] % 2); //DOVREBBE CAPITARE SEMPRE CON GRADO NON TROPPO GRANDE NEI NOSTRI CASI, QUINDI POSSO FARLO
	root_set->roots = (int*) malloc(sizeof(int) * num_radix);
	root_set->num_elements = 0;
	unsigned long int count = 0; //quante radici sono state aggiunte
	//printf("num_radix: %lu\n", num_radix);
	if ((poly_gx.degrees[0] - 0) > 0) //se il coefficiente del termine più piccolo ha grado maggiore di zero, allora non è presente il termine costante e quindi zero è una radice
			{
		//printf("RADICE ZERO\n");
		int one;
		one = 1;
		root_set->roots[0] = 0;
		count++;
		r_big_polynomial_degrade(&poly_gx, one);
	}
	//2. [Call recursive procedure and return]
	if (NEW_ROOTS_RECURSIVE)
		new_roots_recursive(root_set, &count, poly_gx, p);
	else
		roots_recursive(root_set, &count, poly_gx, p);

	root_set->roots = (int*) realloc(root_set->roots, sizeof(int) * count);
	root_set->num_elements = count;

	r_big_polynomial_clear(&poly_gx);

	/*for(i = 0; i < poly_xp.num_elements; i++)
	 {
	 mpz_clear(coef_xp[i]);
	 mpz_clear(deg_xp[i]);
	 }
	 free(coef_xp);
	 free(deg_xp);


	 for(i = 0; i < poly_x.num_elements; i++)
	 {
	 mpz_clear(coef_x[i]);
	 mpz_clear(deg_x[i]);
	 }
	 free(coef_x);
	 free(deg_x);*/

	//r_big_polynomial_clear(&poly_xp);
	//r_big_polynomial_clear(&poly_xp_mod);
	//r_big_polynomial_clear(&poly_x);
	//r_big_polynomial_clear(&poly_xp_x);
	//poly_temp_quoz è già stato clearato
}

//FORSE QUANDO AGGIUNGO LE RADICI E' DA CONTROLLARE CHE NON SIANO GIA' PRESENTE NELL'INSIEME (COME NEL CASO IN CUI AGGIUNGO LA RADICE ZERO!!!!!)
void new_roots_recursive(s_root_set* root_set, unsigned long int* count,
		r_big_polynomial poly_gx, int p) {
	/*printf("poly_gx ricorsione-----------------------\n");
	 r_big_polynomial_printf(&poly_gx);

	 //3. [Recursive function roots_recursive()]
	 //polinomio 1
	 mpz_t* coef_one = (mpz_t*)malloc(sizeof(mpz_t)); //vengono clearati quando faccio la clear su poly_one
	 mpz_init_set_ui(coef_one[0], 1);
	 mpz_t* deg_one = (mpz_t*)malloc(sizeof(mpz_t));
	 mpz_init_set_ui(deg_one[0], 0);

	 r_big_polynomial poly_one; //polinomio di grado zero con termine noto pari a 1
	 poly_one.num_elements = 1;
	 poly_one.coefficients = coef_one;
	 poly_one.degrees = deg_one;
	 //polinomio 1

	 //polinomio hx(x) = 1
	 r_big_polynomial poly_hx;
	 r_big_polynomial_copy(&poly_hx, poly_one);
	 //polinomio hx(x) = 1

	 mpz_t a;
	 mpz_init(a); //inizializzato a zero automaticamente

	 mpz_t p_minus1_div2; //(p-1)/2
	 mpz_init(p_minus1_div2);
	 mpz_sub_ui(p_minus1_div2, p, 1);
	 mpz_tdiv_q_ui(p_minus1_div2, p_minus1_div2, 2);

	 //polinomio (x^((p-1)/2)) - 1
	 int num_el_x_gcd = 2;
	 mpz_t* coef_x_gcd = (mpz_t*)malloc(sizeof(mpz_t)*num_el_x_gcd);
	 mpz_init_set_si(coef_x_gcd[0], -1);
	 mpz_mod(coef_x_gcd[0], coef_x_gcd[0], p);
	 mpz_init_set_ui(coef_x_gcd[1], 1);

	 mpz_t* deg_x_gcd = (mpz_t*)malloc(sizeof(mpz_t)*num_el_x_gcd);
	 mpz_init_set_ui(deg_x_gcd[0], 0);
	 mpz_init_set(deg_x_gcd[1], p_minus1_div2);

	 r_big_polynomial poly_x_gcd;

	 poly_x_gcd.coefficients = coef_x_gcd;
	 poly_x_gcd.degrees = deg_x_gcd;
	 poly_x_gcd.num_elements = num_el_x_gcd;


	 //polinomio x-a
	 int num_el_x_minus_a = 2;
	 mpz_t* coef_x_minus_a = (mpz_t*)malloc(sizeof(mpz_t)*num_el_x_minus_a);
	 mpz_init(coef_x_minus_a[0]); //lascio a zero, poi ad ogni iterazione viene posto ad "a"
	 mpz_init_set_ui(coef_x_minus_a[1], 1);

	 mpz_t* deg_x_minus_a = (mpz_t*)malloc(sizeof(mpz_t)*num_el_x_minus_a);
	 mpz_init(deg_x_minus_a[0]);
	 mpz_init_set_ui(deg_x_minus_a[1], 1);

	 r_big_polynomial poly_x_minus_a;
	 poly_x_minus_a.coefficients = coef_x_minus_a;
	 poly_x_minus_a.degrees = deg_x_minus_a;
	 poly_x_minus_a.num_elements = num_el_x_minus_a;

	 //r_big_polynomial_printf(&poly_x_gcd);
	 //r_big_polynomial_printf(&poly_x_minus_a);
	 //getchar();

	 int num_el_gx = poly_gx.num_elements;
	 //printf("num_el_gx: %d\n", num_el_gx);
	 if(mpz_cmp_ui(poly_gx.degrees[num_el_gx - 1], 2) <= 0) //grado di poly_gx minore o uguale a 2
	 {
	 if(mpz_cmp_ui(poly_gx.degrees[num_el_gx - 1], 0) == 0) //grado zero
	 {
	 //printf("B\n");
	 return;
	 }
	 else if(mpz_cmp_ui(poly_gx.degrees[num_el_gx - 1], 1) == 0) //grado uno
	 {
	 //printf("C\n");
	 if(mpz_cmp_ui(poly_gx.degrees[0], 0) == 0) //è presente il termine noto
	 {
	 mpz_t new_root;
	 mpz_init(new_root);

	 if(mpz_cmp_ui(poly_gx.coefficients[1], 1) == 0) //polinomio monico
	 {
	 mpz_neg(new_root, poly_gx.coefficients[0]); //la radice è il termine noto cambiato di segno
	 mpz_mod(new_root, new_root, p);

	 mpz_init_set(root_set->roots[*count], new_root);
	 //printf("------------------COUNT: %d root: %Zd\n\n", *count, root_set->roots[*count]);
	 *count = *count + 1;
	 }
	 else //polinomio non monico - non capita mai con i polinomi di hilbert
	 {
	 mpz_t known_term_neg; //termine noto negato
	 mpz_init(known_term_neg);
	 mpz_neg(known_term_neg, poly_gx.coefficients[0]);

	 mpz_t inv;
	 mpz_init_set(inv, poly_gx.coefficients[1]);

	 int ret_inv = mpz_invert(inv, inv, p); //(a)^(-1)

	 if(ret_inv != 0) //esiste l'inverso
	 {
	 mpz_mul(new_root, known_term_neg, inv);
	 mpz_mod(new_root, new_root, p);

	 mpz_init_set(root_set->roots[*count], new_root);
	 *count = *count + 1;
	 }

	 mpz_clear(inv);
	 mpz_clear(known_term_neg);
	 }

	 mpz_clear(new_root);
	 }
	 else //non è presente il termine noto
	 {
	 mpz_init_set_ui(root_set->roots[*count], 0);
	 //printf("------------------COUNT: %d root: %Zd\n\n", *count, root_set->roots[*count]);
	 *count = *count + 1;
	 }

	 return;
	 }
	 else if(mpz_cmp_ui(poly_gx.degrees[num_el_gx - 1], 2) == 0) //grado due
	 {
	 //printf("D\n");

	 if(poly_gx.num_elements == 1) //ho già verificato che è di grado 2, quindi questo è il caso del polinomio ax^2
	 {
	 //printf("x^2\n");
	 mpz_init_set_ui(root_set->roots[*count], 0);
	 //printf("------------------COUNT: %d root: %Zd\n\n", *count, root_set->roots[*count]);
	 *count = *count + 1;
	 return;
	 }

	 int i;
	 int term_1_index = -1;
	 int term_1_found = 0; //alla ricerca del termine di grado 1
	 for(i = 0; i < poly_gx.num_elements; i++)
	 {
	 if(mpz_cmp_ui(poly_gx.degrees[i], 1) == 0) //ho trovato il termine di grado 1
	 {
	 term_1_index = i; //può stare in posizione 0 o 1; nel primo caso il polinomio è del tipo ax^2 + bx, nel secondo caso ax^2 + bx + c
	 term_1_found = 1;
	 break;
	 }
	 }

	 if(term_1_found) //il polinomio ha il termine di grado 1: ax^2 + bx + c
	 {
	 //printf("ax^2 + bx + c\n");
	 mpz_t a;
	 mpz_init_set(a, poly_gx.coefficients[poly_gx.num_elements - 1]);

	 mpz_t b;
	 mpz_init_set(b, poly_gx.coefficients[term_1_index]);

	 mpz_t c;
	 mpz_init(c);

	 //printf("TERM INDEX: %d\n", term_1_index);

	 if(term_1_index != 0) //term_1_index == 1, polinomio del tipo ax^2 + bx + c
	 {
	 mpz_set(c, poly_gx.coefficients[0]);
	 }
	 else //term_1_index == 0, polinomio del tipo ax^2 + bx
	 {
	 mpz_set_ui(c, 0);
	 }

	 mpz_t b_2; //b^2
	 mpz_init(b_2);
	 mpz_mul(b_2, b, b);

	 mpz_t ac_mul_4; //4ac
	 mpz_init(ac_mul_4);
	 mpz_mul(ac_mul_4, a, c);
	 mpz_mul_ui(ac_mul_4, ac_mul_4, 4);

	 mpz_t delta; //b^2 - 4ac
	 mpz_init(delta);
	 mpz_sub(delta, b_2, ac_mul_4);
	 mpz_mod(delta, delta, p);

	 if(mpz_cmp_ui(delta, 0) == 0)
	 {
	 mpz_t root; //molteplicità doppia, ma poichè non mi interessa la molteplicità salvo solo una volta la radice
	 mpz_init(root);
	 mpz_neg(root, b); //-b

	 mpz_t den;
	 mpz_init(den);
	 mpz_mul_ui(den, a, 2); //2a
	 int ret_inv = mpz_invert(den, den, p); //(2a)^(-1)

	 if(ret_inv != 0) //esiste l'inverso modulo p
	 {
	 mpz_mul(root, root, den); //(-b) * (2a)^(-1)
	 mpz_mod(root, root, p);

	 mpz_init_set(root_set->roots[*count], root);
	 //printf("------------------COUNT: %d root: %Zd\n\n", *count, root_set->roots[*count]);
	 *count = *count + 1;
	 }

	 mpz_clear(root);
	 mpz_clear(den);
	 }
	 else //delta != 0
	 {
	 mpz_t delta_root; //radice(delta) mod p
	 mpz_init(delta_root);

	 //printf("delta: %Zd\n", delta);

	 if(radix_GMP(delta_root, p, delta) == 1) //esistono le radici
	 {
	 //printf("delta_root: %Zd\n", delta_root);
	 mpz_t first_root; //(-b + rad(delta)) * (2a)^(-1)
	 mpz_init(first_root);

	 mpz_t second_root;
	 mpz_init(second_root);

	 mpz_t den;
	 mpz_init(den);
	 mpz_mul_ui(den, a, 2); //2a
	 int ret_inv = mpz_invert(den, den, p); //(2a)^(-1)

	 if(ret_inv != 0) //esiste l'inverso modulo p
	 {
	 mpz_neg(first_root, b);	//-b
	 mpz_add(first_root, first_root, delta_root); //-b + rad(delta) PIU'
	 mpz_mul(first_root, first_root, den); //(-b + rad(delta)) * (2a)^(-1)
	 mpz_mod(first_root, first_root, p);

	 mpz_neg(second_root, b); //-b
	 mpz_sub(second_root, second_root, delta_root); //-b - rad(delta) MENO
	 mpz_mul(second_root, second_root, den); //(-b - rad(delta)) * (2a)^(-1)
	 mpz_mod(second_root, second_root, p);

	 mpz_init_set(root_set->roots[*count], first_root);
	 //printf("------------------COUNT: %d root: %Zd\n\n", *count, root_set->roots[*count]);
	 *count = *count + 1;

	 mpz_init_set(root_set->roots[*count], second_root);
	 //printf("------------------COUNT: %d root: %Zd\n\n", *count, root_set->roots[*count]);
	 *count = *count + 1;
	 }

	 mpz_clear(first_root);
	 mpz_clear(second_root);
	 mpz_clear(den);
	 }
	 //else //non esistono le radici
	 //	printf("NO RADICI :(\n");

	 mpz_clear(delta_root);
	 }

	 mpz_clear(a);
	 mpz_clear(b);
	 mpz_clear(c);
	 mpz_clear(b_2);
	 mpz_clear(ac_mul_4);
	 mpz_clear(delta);

	 return;
	 }
	 else //il polinomio NON ha il termine di grado 1
	 {
	 //printf("ax^2 + c\n");
	 if(mpz_cmp_ui(poly_gx.degrees[0], 0) == 0) //è presente il termine noto
	 {
	 mpz_t coef_0_neg_div; //termine noto cambiato di segno fratto coefficiente termine grado 2
	 mpz_init(coef_0_neg_div);
	 mpz_neg(coef_0_neg_div, poly_gx.coefficients[0]);

	 if(mpz_cmp_ui(poly_gx.coefficients[1], 1) != 0) //polinomio non monico - non capita mai con i polinomi di Hilbert
	 {
	 mpz_t inv;
	 mpz_init_set(inv, poly_gx.coefficients[1]); //a

	 int ret_inv = mpz_invert(inv, inv, p); //(a)^(-1)

	 if(!ret_inv) //inverso inesistente
	 {
	 mpz_clear(coef_0_neg_div);
	 mpz_clear(inv);

	 return;
	 }
	 else
	 {
	 mpz_mul(coef_0_neg_div, coef_0_neg_div, inv);
	 mpz_mod(coef_0_neg_div, coef_0_neg_div, p);

	 mpz_clear(inv);
	 }
	 }

	 mpz_t new_root;
	 mpz_init(new_root);

	 int ret = radix_GMP(new_root, p, coef_0_neg_div); //se ho che il polinomio è ax^2 + c, io voglio ottenere x^2 == (-c/a) mod p (dove == stà per congruo) quindi gli passo il termine noto invertito di segno
	 if(ret == 0)
	 {
	 mpz_clear(new_root);
	 mpz_clear(coef_0_neg_div);
	 return;
	 }

	 //le soluzioni sono +- new_root
	 mpz_init_set(root_set->roots[*count], new_root);
	 *count = *count + 1;

	 mpz_neg(new_root, new_root);
	 mpz_mod(new_root, new_root, p);
	 mpz_init_set(root_set->roots[*count], new_root);
	 *count = *count + 1;

	 mpz_clear(coef_0_neg_div);
	 mpz_clear(new_root);
	 }
	 else //non è presente il termine noto, polinomio ax^2 (in realtà questo caso è già gestito all'inizio, ma lasciamo per completezza)
	 {
	 mpz_init_set_ui(root_set->roots[*count], 0);
	 *count = *count + 1;
	 }
	 }
	 return;
	 }

	 //se di grado 1 la radice è il rapporto tra il termine noto cambiato di segno e il coefficiente del termine di grado 1
	 //se di grado 2 la radice la ottieni usando la formula risolutiva (per la radice del delta viene utilizzato RADIX_GMP)

	 return;
	 }
	 else
	 {
	 //printf("E\n");
	 gmp_randstate_t state;
	 gmp_randinit_mt(state);

	 while(r_big_polynomial_is_equal(&poly_hx, &poly_one) == 1 || r_big_polynomial_is_equal(&poly_hx, &poly_gx) == 1)
	 {
	 //quattro nuovi polinomi sopra da clearare!
	 mpz_urandomm(a, state, p); //estrae numero casuale in [0, p-1], è corretto mettere p come terzo parametro

	 mpz_neg(poly_x_minus_a.coefficients[0], a);

	 r_big_polynomial poly_gx_a; //polinomio g(x-a) - inizializzato a 1
	 r_big_polynomial_copy(&poly_gx_a, poly_one);

	 printf("a: %Zd\n", a);
	 //printf("poly_x_minus_a----------------------\n");
	 //r_big_polynomial_printf(&poly_x_minus_a);

	 int i, j;
	 for(i = 0; i < poly_gx.num_elements; i++)
	 {
	 r_big_polynomial poly_pow_temp; //conterrà di volta in volta le potenze (x-a)^n
	 r_big_polynomial_copy(&poly_pow_temp, poly_x_minus_a);

	 if(mpz_cmp_ui(poly_gx.degrees[i], 0) == 0)
	 {
	 mpz_set(poly_gx_a.coefficients[0], poly_gx.coefficients[i]);
	 continue;
	 }

	 r_big_polynomial_iterative_ipow(&poly_pow_temp, poly_gx.degrees[i], p); //(x-a)^grad[i]

	 //printf("poly_pow_temp: %Zd----------------------\n", poly_gx.degrees[i]);
	 //r_big_polynomial_printf(&poly_pow_temp);
	 //getchar();

	 for(j = 0; j < poly_pow_temp.num_elements; j++)
	 {
	 mpz_mul(poly_pow_temp.coefficients[j], poly_pow_temp.coefficients[j], poly_gx.coefficients[i]);
	 mpz_mod(poly_pow_temp.coefficients[j], poly_pow_temp.coefficients[j], p);
	 }

	 r_big_polynomial poly_gx_a_temp;
	 r_big_polynomial_copy(&poly_gx_a_temp, poly_gx_a);
	 r_big_polynomial_clear(&poly_gx_a);

	 if(FAST_MUL_ADD)
	 r_big_polynomial_fast_add(&poly_gx_a, poly_gx_a_temp, poly_pow_temp, p);
	 else
	 r_big_polynomial_simple_add(&poly_gx_a, poly_gx_a_temp, poly_pow_temp, p);

	 r_big_polynomial_clear(&poly_pow_temp);
	 r_big_polynomial_clear(&poly_gx_a_temp);
	 }
	 //getchar();
	 r_big_polynomial_clear(&poly_hx); //importante farlo prima di calcolare il gcd

	 //printf("poly_x_gcd----------------------\n");
	 //r_big_polynomial_printf(&poly_x_gcd);

	 //printf("poly_gx_a----------------------\n");
	 //r_big_polynomial_printf(&poly_gx_a);

	 printf("inizio gcd\n");
	 r_big_polynomial_gcd(&poly_hx, poly_x_gcd, poly_gx_a, p); //h(x) = gcd( (x + a)^((p−1)/2)  − 1, g(x));
	 printf("fine gcd\n");

	 //printf("poly_hx----------------------\n");
	 //r_big_polynomial_printf(&poly_hx);

	 r_big_polynomial_clear(&poly_gx_a);

	 }

	 new_roots_recursive(root_set, count, poly_hx, p);

	 //printf("poly_gxdddddddd----------------------\n");
	 //r_big_polynomial_printf(&poly_gx);

	 //printf("poly_hxdddddddd----------------------\n");
	 //r_big_polynomial_printf(&poly_hx);

	 r_big_polynomial poly_quoz;
	 r_big_polynomial poly_rem;
	 r_big_polynomial_fast_mod(&poly_rem, &poly_quoz, poly_gx, poly_hx, p);

	 //printf("poly_rem----------------------\n");
	 //r_big_polynomial_printf(&poly_rem);

	 //printf("poly_quoz----------------------\n");
	 //r_big_polynomial_printf(&poly_quoz);

	 r_big_polynomial_clear(&poly_rem); //mi serve solo il quoziente

	 new_roots_recursive(root_set, count, poly_quoz, p);

	 r_big_polynomial_clear(&poly_quoz);
	 gmp_randclear(state);
	 }

	 mpz_clear(a);
	 mpz_clear(p_minus1_div2);

	 r_big_polynomial_clear(&poly_one);
	 r_big_polynomial_clear(&poly_hx);
	 r_big_polynomial_clear(&poly_x_gcd);
	 r_big_polynomial_clear(&poly_x_minus_a);*/
}

void roots_recursive(s_root_set* root_set, unsigned long int* count,
		r_big_polynomial poly_gx, int p) {
	printf("Ricerca radici polinomio: \n");
	r_big_polynomial_printf(&poly_gx);
	printf("\n");

	//3. [Recursive function roots_recursive()]
	//polinomio 1
	int* coef_one = (int*) malloc(sizeof(int));
	coef_one[0] = 1;
	int* deg_one = (int*) malloc(sizeof(int));
	deg_one[0] = 0;

	r_big_polynomial poly_one; //polinomio di grado zero con termine noto pari a 1
	poly_one.num_elements = 1;
	poly_one.coefficients = coef_one;
	poly_one.degrees = deg_one;
	//polinomio 1

	//polinomio hx(x) = 1
	r_big_polynomial poly_hx;
	r_big_polynomial_copy(&poly_hx, poly_one);
	//polinomio hx(x) = 1

	int a;
	a = 0; //inizializzato a zero automaticamente

	//polinomio (x+a)
	int num_el_xa = 2;
	int* coef_xa = (int*) malloc(sizeof(int) * num_el_xa);
	coef_xa[0] = a; //inizializzato a zero, lo aggiorno ad ogni iterazione del ciclo while
	coef_xa[1] = 1;

	int* deg_xa = (int*) malloc(sizeof(int) * num_el_xa);
	deg_xa[0] = 0;
	deg_xa[1] = 1;

	r_big_polynomial poly_xa;
	poly_xa.coefficients = coef_xa;
	poly_xa.degrees = deg_xa;
	poly_xa.num_elements = num_el_xa;
	//polinomio (x+a)

	r_big_polynomial poly_xa_pow; //(x + a)^((p−1)/2)

	int p_minus1_div2; //(p-1)/2
	p_minus1_div2 = 0;
	p_minus1_div2 = p - 1;
	p_minus1_div2 = p_minus1_div2 / 2;

	//printf("(p-1)/2: %Zd\n", p_minus1_div2);

	int num_el_gx = poly_gx.num_elements;
	//printf("num_el_gx: %d\n", num_el_gx);
	if ((poly_gx.degrees[num_el_gx - 1] - 2) <= 0) //grado di poly_gx minore o uguale a 2
			{
		if ((poly_gx.degrees[num_el_gx - 1] - 0) == 0) //grado zero
				{
			//printf("B\n");
			return;
		} else if ((poly_gx.degrees[num_el_gx - 1] - 1) == 0) //grado uno
				{
			//printf("C\n");
			if ((poly_gx.degrees[0] - 0) == 0) //è presente il termine noto
					{
				int new_root;
				new_root = 0;

				if ((poly_gx.coefficients[1] - 1) == 0) //polinomio monico
						{
					new_root = -poly_gx.coefficients[0]; //la radice è il termine noto cambiato di segno
					new_root = new_root % p;

					root_set->roots[*count] = new_root;
					//printf("------------------COUNT: %d root: %Zd\n\n", *count, root_set->roots[*count]);
					*count = *count + 1;
				} else //polinomio non monico - non capita mai con i polinomi di hilbert
				{
					int known_term_neg; //termine noto negato
					known_term_neg = 0;
					known_term_neg = -poly_gx.coefficients[0];

					int inv;
					inv = poly_gx.coefficients[1];

					int ret_inv = inv = mul_inv(inv, p); //(a)^(-1)

					if (ret_inv != 0) //esiste l'inverso
							{
						new_root = known_term_neg * inv;
						new_root = new_root % p;

						root_set->roots[*count] = new_root;
						*count = *count + 1;
					}
				}
			} else //non è presente il termine noto
			{
				root_set->roots[*count] = 0;
				//printf("------------------COUNT: %d root: %Zd\n\n", *count, root_set->roots[*count]);
				*count = *count + 1;
			}

			return;
		} else if ((poly_gx.degrees[num_el_gx - 1] - 2) == 0) //grado due
				{
			//printf("D\n");

			if (poly_gx.num_elements == 1) //ho già verificato che è di grado 2, quindi questo è il caso del polinomio ax^2
					{
				//printf("x^2\n");
				root_set->roots[*count] = 0;
				//printf("------------------COUNT: %d root: %Zd\n\n", *count, root_set->roots[*count]);
				*count = *count + 1;
				return;
			}

			int i;
			int term_1_index = -1;
			int term_1_found = 0; //alla ricerca del termine di grado 1
			for (i = 0; i < poly_gx.num_elements; i++) {
				if ((poly_gx.degrees[i] - 1) == 0) //ho trovato il termine di grado 1
						{
					term_1_index = i; //può stare in posizione 0 o 1; nel primo caso il polinomio è del tipo ax^2 + bx, nel secondo caso ax^2 + bx + c
					term_1_found = 1;
					break;
				}
			}

			if (term_1_found) //il polinomio ha il termine di grado 1: ax^2 + bx + c
			{
				//printf("ax^2 + bx + c\n");
				int a;
				a = poly_gx.coefficients[poly_gx.num_elements - 1];

				int b;
				b = poly_gx.coefficients[term_1_index];

				int c;
				c = 0;

				//printf("TERM INDEX: %d\n", term_1_index);

				if (term_1_index != 0) //term_1_index == 1, polinomio del tipo ax^2 + bx + c
						{
					c = poly_gx.coefficients[0];
				} else //term_1_index == 0, polinomio del tipo ax^2 + bx
				{
					c = 0;
				}

				int b_2; //b^2
				b_2 = 0;
				b_2 = b * b;

				int ac_mul_4; //4ac
				ac_mul_4 = 0;
				ac_mul_4 = a * c;
				ac_mul_4 = ac_mul_4 * 4;

				int delta; //b^2 - 4ac
				delta = 0;
				delta = b_2 - ac_mul_4;
				delta = delta % p;

				if ((delta - 0) == 0) {
					int root; //molteplicità doppia, ma poichè non mi interessa la molteplicità salvo solo una volta la radice
					root = 0;
					root = -b; //-b

					int den;
					den = 0;
					den = a * 2; //2a
					int ret_inv = den = mul_inv(den, p); //(2a)^(-1)

					if (ret_inv != 0) //esiste l'inverso modulo p
							{
						root = root * den; //(-b) * (2a)^(-1)
						root = root % p;

						root_set->roots[*count] = root;
						//printf("------------------COUNT: %d root: %Zd\n\n", *count, root_set->roots[*count]);
						*count = *count + 1;
					}
				} else //delta != 0
				{
					int delta_root; //radice(delta) mod p
					delta_root = 0;

					//printf("delta: %Zd\n", delta);

					if (radix_GMP(delta_root, p, delta) == 1) //esistono le radici
							{
						//printf("delta_root: %Zd\n", delta_root);
						int first_root; //(-b + rad(delta)) * (2a)^(-1)
						first_root = 0;

						int second_root;
						second_root = 0;

						int den;
						den = 0;
						den = a * 2; //2a
						int ret_inv = den = mul_inv(den, p); //(2a)^(-1)

						if (ret_inv != 0) //esiste l'inverso modulo p
								{
							first_root = -b;	//-b
							first_root = first_root + delta_root; //-b + rad(delta) PIU'
							first_root = first_root * den; //(-b + rad(delta)) * (2a)^(-1)
							first_root = first_root % p;

							second_root = -b; //-b
							second_root = second_root - delta_root; //-b - rad(delta) MENO
							second_root = second_root * den; //(-b - rad(delta)) * (2a)^(-1)
							second_root = second_root % p;

							root_set->roots[*count] = first_root;
							//printf("------------------COUNT: %d root: %Zd\n\n", *count, root_set->roots[*count]);
							*count = *count + 1;

							root_set->roots[*count] = second_root;
							//printf("------------------COUNT: %d root: %Zd\n\n", *count, root_set->roots[*count]);
							*count = *count + 1;
						}
					}
				}

				return;
			} else //il polinomio NON ha il termine di grado 1
			{
				//printf("ax^2 + c\n");
				if ((poly_gx.degrees[0] - 0) == 0) //è presente il termine noto
						{
					int coef_0_neg_div; //termine noto cambiato di segno fratto coefficiente termine grado 2
					coef_0_neg_div = 0;
					coef_0_neg_div = -poly_gx.coefficients[0];

					if ((poly_gx.coefficients[1] - 1) != 0) //polinomio non monico - non capita mai con i polinomi di Hilbert
							{
						int inv;
						inv = poly_gx.coefficients[1]; //a

						int ret_inv = inv = mul_inv(inv, p); //(a)^(-1)

						if (!ret_inv) //inverso inesistente
						{
							return;
						} else {
							coef_0_neg_div = coef_0_neg_div * inv;
							coef_0_neg_div = coef_0_neg_div % p;
						}
					}

					int new_root;
					new_root = 0;

					int ret = radix_GMP(new_root, p, coef_0_neg_div); //se ho che il polinomio è ax^2 + c, io voglio ottenere x^2 == (-c/a) mod p (dove == stà per congruo) quindi gli passo il termine noto invertito di segno
					if (ret == 0) {
						return;
					}

					//le soluzioni sono +- new_root
					root_set->roots[*count] = new_root;
					*count = *count + 1;

					new_root = -new_root;
					new_root = new_root % p;
					root_set->roots[*count] = new_root;
					*count = *count + 1;
				} else //non è presente il termine noto, polinomio ax^2 (in realtà questo caso è già gestito all'inizio, ma lasciamo per completezza)
				{
					root_set->roots[*count] = 0;
					*count = *count + 1;
				}
			}
			return;
		}

		//se di grado 1 la radice è il rapporto tra il termine noto cambiato di segno e il coefficiente del termine di grado 1
		//se di grado 2 la radice la ottieni usando la formula risolutiva (per la radice del delta viene utilizzato RADIX_GMP)

		return;
	} else {
		//printf("E\n");
		//gmp_randstate_t state;
		//gmp_randinit_mt(state);

		while (r_big_polynomial_is_equal(&poly_hx, &poly_one) == 1
				|| r_big_polynomial_is_equal(&poly_hx, &poly_gx) == 1) {
			a = rand(); //estrae numero casuale in [0, p-1], è corretto mettere p come terzo parametro

			printf("Estratto: %Zd\n", a);

			poly_xa.coefficients[0] = a; //aggiorno il il termine noto del polinomio x+a al valore di a appena estratto randomicamente

			r_big_polynomial_copy(&poly_xa_pow, poly_xa);

			//printf("inizio pow\n");
			//r_big_polynomial_recursive_ipow(&poly_xa_pow, p_minus1_div2, p); //calcolo (x + a)^((p−1)/2), p dispari quindi viene un numero pari
			r_big_polynomial_iterative_pow_mod(&poly_xa_pow, poly_gx,
					p_minus1_div2, p);
			//printf("fine pow\n");

			//r_big_polynomial_printf(&poly_xa_pow);

			//finisco di costruire polinomio //(x+a)^((p-1)/2) -1
			if ((poly_xa_pow.degrees[0] - 0) == 0) {
				poly_xa_pow.coefficients[0] = poly_xa_pow.coefficients[0] - 1;
				poly_xa_pow.coefficients[0] = poly_xa_pow.coefficients[0] % p;
			} else {
				poly_xa_pow.num_elements = poly_xa_pow.num_elements + 1;
				poly_xa_pow.coefficients = (int*) realloc(
						poly_xa_pow.coefficients,
						sizeof(int) * poly_xa_pow.num_elements);
				poly_xa_pow.degrees = (int*) realloc(poly_xa_pow.degrees,
						sizeof(int) * poly_xa_pow.num_elements);

				poly_xa_pow.coefficients[poly_xa_pow.num_elements - 1] = 0;
				poly_xa_pow.degrees[poly_xa_pow.num_elements - 1] = 0;

				int i;
				for (i = poly_xa_pow.num_elements - 2; i >= 0; i--) {
					poly_xa_pow.coefficients[i + 1] =
							poly_xa_pow.coefficients[i];
					poly_xa_pow.degrees[i + 1] = poly_xa_pow.degrees[i];
				}
				poly_xa_pow.coefficients[0] = -1;
				poly_xa_pow.coefficients[0] = poly_xa_pow.coefficients[0] % p;
				poly_xa_pow.degrees[0] = 0;
			}

			r_big_polynomial_clear(&poly_hx); //importante farlo prima di calcolare il gcd

			//printf("inizio gcd\n");
			r_big_polynomial_gcd(&poly_hx, poly_xa_pow, poly_gx, p); //h(x) = gcd( (x + a)^((p−1)/2)  − 1, g(x));
			//printf("fine gcd\n");

			r_big_polynomial_clear(&poly_xa_pow);
			//printf("clear fine gcd\n");

			/*printf("-----------------\n");
			 r_big_polynomial_printf(&poly_hx);
			 printf("-----------------\n");
			 r_big_polynomial_printf(&poly_gx);
			 printf("-----------------\n");*/

		}
		//printf("ricorsione\n");

		roots_recursive(root_set, count, poly_hx, p);

		r_big_polynomial poly_quoz;
		r_big_polynomial poly_rem;
		r_big_polynomial_fast_mod(&poly_rem, &poly_quoz, poly_gx, poly_hx, p);

		r_big_polynomial_clear(&poly_rem); //mi serve solo il quoziente

		roots_recursive(root_set, count, poly_quoz, p);

		r_big_polynomial_clear(&poly_quoz);
		//gmp_randclear(state);
	}

	r_big_polynomial_clear(&poly_one);
	r_big_polynomial_clear(&poly_hx);
	r_big_polynomial_clear(&poly_xa);
	//poly_xa_pow è stato già "pulito" alla fine del ciclo while
}

//trova una radice di un polinomio, testando tutti gli elementi del campo (molto lento)
//evita di calcolare fattore zero
//restituisce -1 se non trova una radice
void find_one_root(int root, r_big_polynomial poly, int p) {
	int counter;
	counter = 1; //non voglio calcolare fattore zero, quindi vado da 1 a p-1

	int temp_mul;
	temp_mul = 0;

	int temp_exp;
	temp_exp = 0;

	int found = 0;

	while ((counter - p) < 0) //ad ogni iterazione verifico se l'elemento corrente del campo sia una radice o no
	{
		//printf("counter: %Zd\n", counter);
		temp_mul = 0;
		int i;
		for (i = 0; i < poly.num_elements; i++) //scorro tutti i termini del polinomio
				{
			temp_exp = (int) ipow((double) counter, (double) poly.degrees[i])
					% p;
			temp_exp = temp_exp * poly.coefficients[i];
			temp_mul = temp_mul + temp_exp;
			temp_mul = temp_mul % p;
		}

		if ((temp_mul - 0) == 0) //il divisore positivo era una radice
				{
			root = counter; //ho trovato una radice del polinomio!
			found = 1;
			break;
		}
		counter = counter + 1;
	}

	if (!found)
		root = -1;
}

void findDivisors(int* primeDivisors, int* multiplicity, int size,
		int currentDivisor, int currentResult) {
	int currentResult_copy;
	currentResult_copy = currentResult;

	if (currentDivisor == size) {
		//printf("currentResult: %Zd\n", currentResult);
		return;
	}
	// how many times will we take current divisor?
	// we have to try all options
	int i;
	for (i = 0; i <= multiplicity[currentDivisor]; ++i) {
		findDivisors(primeDivisors, multiplicity, size, currentDivisor + 1,
				currentResult_copy);
		currentResult_copy = currentResult_copy * primeDivisors[currentDivisor];
	}
}

//in realtà secondo il Teorema delle radici razionali potrei trovare OGNI radice, ma a me basta una
int findOneRootInDivisors(int one_root, r_big_polynomial poly, int p,
		int* primeDivisors, int* multiplicity, int size, int currentDivisor,
		int currentResult) {
	int currentResult_copy;
	currentResult_copy = currentResult;

	//printf("currentDivisor: %d\n", currentDivisor);

	if (currentDivisor == size) {
		//printf("currentResult: %Zd\n", currentResult_copy);

		int i;

		int temp_mul;
		temp_mul = 0;

		int temp_exp;
		temp_exp = 0;

		temp_mul = 0;
		for (i = 0; i < poly.num_elements; i++) //scorro tutti i termini del polinomio
				{
			temp_exp = (int) ipow((double) currentResult_copy,
					(double) poly.degrees[i]) % p;
			temp_exp = temp_exp * poly.coefficients[i];
			temp_mul = temp_mul + temp_exp;
			temp_mul = temp_mul % p;
		}

		int success = 0;

		if ((temp_mul - 0) == 0) //il divisore positivo era una radice
				{
			one_root = currentResult_copy; //ho trovato una radice del polinomio!
			success = 1;
			//printf("Success: %d\n", success);
		} else //provo con il divisore negativo
		{
			currentResult_copy = -currentResult; //divisore negativo
			//printf("currentResult: %Zd\n", currentResult_copy);

			temp_mul = 0;
			for (i = 0; i < poly.num_elements; i++) //scorro tutti i termini del polinomio
					{
				temp_exp = (int) ipow((double) currentResult_copy,
						(double) poly.degrees[i]) % p;
				temp_exp = temp_exp * poly.coefficients[i];
				temp_mul = temp_mul + temp_exp;
				temp_mul = temp_mul % p;
			}

			if ((temp_mul - 0) == 0) {
				one_root = currentResult_copy; //ho trovato una radice del polinomio!
				success = 1;
			}
			//else success rimane a 0

			//printf("Success: %d\n", success);
		}

		return success;
	}

	int i;
	int success = 0;
	for (i = 0; i <= multiplicity[currentDivisor]; ++i) {
		//printf("i: %d\n", i);
		success = findOneRootInDivisors(one_root, poly, p, primeDivisors,
				multiplicity, size, currentDivisor + 1, currentResult_copy);
		//printf("Success high[%d]: %d\n", i, success);
		if (success) //mi basta trovare UNA radice!
			break;

		currentResult_copy = currentResult_copy * primeDivisors[currentDivisor];
	}

	return success;
}

int mul_inv(int a, int b) {
	int b0 = b, t, q;
	int x0 = 0, x1 = 1;
	if (b == 1)
		return 1;
	while (a > 1) {
		q = a / b;
		t = b, b = a % b, a = t;
		t = x0, x0 = x1 - q * x0, x1 = t;
	}
	if (x1 < 0)
		x1 += b0;
	return x1;
}

int numPlaces(int n, int base) {
	int r = 1;
	if (n < 0)
		n = (n == INT_MIN) ? INT_MAX : -n;
	while (n > (base - 1)) {
		n /= base;
		r++;
	}
	return r;
}

int ipow(int base, int exp) {
	int result = 1;
	while (exp) {
		if (exp & 1)
			result *= base;
		exp >>= 1;
		base *= base;
	}

	return result;
}

int radix_GMP(int radix, int p, int a_a) {
	return 1;
}

s
