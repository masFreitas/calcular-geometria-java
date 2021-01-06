import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla
		 * precis�o: A, B e C. Em seguida, calcule e mostre: 
		 * a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura. 
		 * b) a �rea do c�rculo de raio C. (pi = 3.14159) 
		 * c) a �rea do trap�zio que tem A e B por bases e C por altura.
		 * d) a �rea do quadrado que tem lado B. 
		 * e) a �rea do ret�ngulo que tem lados A e B.
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		double pi = 3.14159;
		
		System.out.println("-- EXERCICIO 5 --");
		System.out.println("-- CALCULAR AREA DO TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO E TRAPEZIO --");
		
		System.out.println("Informe A, B e C, com duas casas decimais (Ex: 10.10): ");
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTriangulo = (A * C) / 2;
		areaCirculo = pi * Math.pow(C, 2.0);
		areaTrapezio = ((A + B) * C) / 2;
		areaQuadrado = Math.pow(B, 2.0);
		areaRetangulo = A * B;
				
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
	
		sc.close();		

	}

}
