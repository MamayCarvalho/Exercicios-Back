package Exercicios;

public class ExercicioQuestao05 {

	public static void main(String[] args) {
		int codPeca1 = 12;
		int qtPeca1 = 1;
		double valorPeca1 = 5.30;
		
		int codPeca2 = 16;
		int qtPeca2 = 2;
		double valorPeca2 = 5.10;
		double resultado;
		
		resultado = qtPeca1*valorPeca1 + qtPeca2*valorPeca2;
		
		System.out.printf("Valor a pagar: R$ %.2f%n", resultado);
	}

}
