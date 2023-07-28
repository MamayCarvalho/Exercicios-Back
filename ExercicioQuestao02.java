package Exercicios;

import java.util.Locale;
public class ExercicioQuestao02 {

	public static void main(String[] args) {
		Locale locale=new Locale("en","US");
		Locale.setDefault(locale);
		double pi = 3.14159;
		double valor01 = 150;
		double raio = 0;
		double resultado = 0;
		
		raio = valor01*valor01;
		
		resultado = pi*raio;
		System.out.printf("A = %.4f", resultado);

	}

}
