package aula_4;

import java.util.Scanner;
public class Teste {
	
	public static void main(String args[]) {
		Loop obj;
		obj = new Loop();
		Scanner entrada;
		entrada = new Scanner(System.in);
		System.out.print("Digite o número de repetições: ");
		int number = entrada.nextInt();
		obj.imprimirValores(number);
		obj.contar(number, entrada);
		obj.core(entrada);
		obj.exemploDo(entrada);
		obj.pares(entrada);
		entrada.close();
		
	}
}