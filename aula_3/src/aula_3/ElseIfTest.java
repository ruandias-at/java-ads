package aula_3;

import java.util.Scanner;//importing scanner for enter data

public class ElseIfTest {

	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		ElseIf obj;
		obj = new ElseIf();
		System.out.print("Digite a nota do aluno:");
		int notaAluno = input.nextInt();
		String out = obj.verificarNota(notaAluno);
		System.out.println(out);

		System.out.print("Digite o primeiro valor:");
		double numero1 = input.nextDouble();
		System.out.print("Digite o segundo valor:");
		double numero2 = input.nextDouble();
		System.out.print("Digite o operador:");
		char operator = input.next().charAt(0);
		double outc = obj.calcular(numero1, numero2, operator);
		
		int resInt = obj.calcularInt((int)numero1, (int)numero2, operator);
		
		if (outc != -99999) {
			System.out.printf("O resultado ponto flutuante é: %.2f", outc);
		}
		if (resInt != -99999) {
			System.out.printf("\nO resultado inteiro é: %d", resInt);
		}
		
		System.out.println("\nDigite a cor no semáforo:");
		String cor = input.next();
		String outSemaforo = obj.semaforo(cor);
		System.out.println("A cor do semáforo é " + cor + ", " + outSemaforo + "!");
		
		input.close();
	}//End Main	
}//End Class