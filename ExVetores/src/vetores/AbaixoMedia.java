package vetores;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/

public class AbaixoMedia {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas elementos vai ter o vetor?");
		int n = sc.nextInt();
		double[] vect = new double [n]; 
		double soma = 0;
		
		for (int i = 0; i < vect.length;i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		System.out.println();
		
		double media =  soma / n;
		
		System.out.printf("Media do vetor %.3f%n",media);
		
		System.out.println("Elementos abaixo da media:");
		for (int i = 0; i < vect.length;i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f%n",vect[i]);
			}
		}
		
		
		sc.close();
	}
}

