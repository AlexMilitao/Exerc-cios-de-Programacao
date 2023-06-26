package vetores;

import java.util.Scanner;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).*/

public class MaiorPosicao {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce irá digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double maior = 0;
		int pos = 0;
		
		for(int i = 0;i < vect.length;i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
				if (vect[i] > maior) {	
					maior = vect[i];
					pos = i;
				}
		}
		System.out.printf("Maior valor: %.2f%n", maior);
		System.out.println("Posicao do maior valor: " + pos);
		sc.close();

	}
}