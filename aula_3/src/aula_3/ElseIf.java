package aula_3;

public class ElseIf {
	public String verificarNota(int nota) {
		if (nota >= 90) {
			return "Nota A";
		} else if (nota >= 80) {
			return "Nota B";
		} else if (nota >= 70) {
			return "Nota C";
		} else if (nota >= 60) {
			return "Nota D";
		} else {
			return "Reprovado!";
		}
	}//end method
	
	/*
	 *  - 
	 *  +
	 *  *
	 *  /
	 *  %
	*/
	public double calcular(double num1, double num2, char operator) {
		double resultado = -99999;
		switch(operator) 
		{
			case '+':
				resultado = num1 + num2;
				break;
			case '-':
				resultado = num1 - num2;
				break;
			case '*':
				resultado = num1 * num2;
				break;
			case '/':
				if (num2 != 0) {
					resultado = num1 / num2;
				} else {
					System.out.println("Não se divide por 0!");
				}//end else
				break;
			case '%':
				if (num2 != 0) {
					resultado = num1 % num2;
				} else {
					System.out.println("Não se divide por 0!");
				}//end else
				break;
			default:
				System.out.println("OPERADOR INVÁLIDO!");
				break;
		}//switch end
		return resultado;
	}
		
	public int calcularInt(int num1, int num2, char operator) {
		int resultado = -99999;
		switch(operator) 
		{
			case '+':
				resultado = num1 + num2;
				break;
			case '-':
				resultado = num1 - num2;
				break;
			case '*':
				resultado = num1 * num2;
				break;
			case '/':
				if (num2 != 0) {
					resultado = num1 / num2;
				} else {
					System.out.println("Não se divide por 0!");
				}//end else
				break;
			case '%':
				if (num2 != 0) {
					resultado = num1 % num2;
				} else {
					System.out.println("Não se divide por 0!");
				}//end else
				break;
			default:
				System.out.println("OPERADOR INVÁLIDO!");
				break;
		}//switch end
		return resultado;
	}
	
	public String semaforo(String cor) {
		String action = "";
		switch(cor) 
		{
			case "verde":
				action = "segue";
				break;
			case "amarelo":
				action = "atencao";
				break;
			case "vermelho":
				action = "pare";
				break;
			default:
				System.out.println("Informação Inválida!");
				break;
		}
		return action;
	}
}