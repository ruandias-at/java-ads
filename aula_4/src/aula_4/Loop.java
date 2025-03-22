package aula_4;

import java.util.Scanner;

public class Loop {
	 
	public void imprimirValores(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.println("Numero: " + i);
		}//End for
	}//End Method
	
	public void contar(int contador, Scanner entrada) {
		int repetiu = 0;
		while (contador != 0) {
			repetiu = repetiu + 1;
			System.out.println("Fazendo pela " + repetiu + "ª vez.");
			System.out.print("Digite um valor para continuar[0 para parar]: ");
			contador = entrada.nextInt();
		}//End while
		System.out.println("Fim do Loop While.");
	}//End Method
	
	public void contaMais(int contador) {
		for (int i = 1; i <= contador; i++) {
			System.out.println("Repetindo " + i);
		}//End for
	}//End Method
	
	public void core(Scanner input) {
		while (true) {
			System.out.println("Digite um valor para ser repetido");
			int valor = input.nextInt();
			if (valor <= 0) {
				System.out.println("FIM DO PROGRAMA CORE");
				break;
			} 
			this.contaMais(valor);
			System.out.println("******Finalizando Impressão******");
		}//End While
	}//End Method
	
	public void exemploDo(Scanner input) {
		int v1 = 0;
		do {
			System.out.print("Digite um valor entre 1 e 10: ");
			v1 = input.nextInt();
		} while (v1 < 1 || v1 > 10);//Condition Do While
		System.out.println("Valor final de v1: " + v1);
	}//End Method
	
	public void pares(Scanner input) {
		System.out.println("Digite um valor: ");
		int num = input.nextInt();
		int pares = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 && i > 10) {
				pares += 1;
			}//End If
		}//End For
		System.out.println("Foram encontrados " + pares + " números pares.");
	}//End Method
}