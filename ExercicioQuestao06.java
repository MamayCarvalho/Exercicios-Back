package Exercicios;

import java.util.Locale;

public class ExercicioQuestao06 {

	public static void main(String[] args) {
		Locale locale=new Locale("en","EN");
		Locale.setDefault(locale);
		
		double pi = 3.14159;
		double a = 12.7;
		double b = 10.4;
		double c = 15.2;
		
		
		double circulo = pi * (c*c);
		double trapezio = ((a+b)*c)/2;
		double retangulo = a*b;
		double triangulo = (a*c)/2;
		double quadrado = b*b;
		
		System.out.printf("Triangulo: %.3f%n", triangulo);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retangulo: %.3f%n", retangulo);

	}

}
