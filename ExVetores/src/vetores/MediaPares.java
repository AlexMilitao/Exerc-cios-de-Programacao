package vetores;

import java.util.Scanner;

/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

public class MediaPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int soma = 0;
		int pares = 0;
		
		int[] vect1 = new int[n];
			
		for(int i = 0; i < vect1.length; i++) {
			System.out.println("Digite um numero: ");
			int entry = sc.nextInt();
				if(entry % 2 == 0) {
				soma += entry;
				pares += +1;
				}
		}
		if (pares != 0) {
		double media = soma / pares;
		System.out.printf("A media dos numeros pares é: %.1f%n",media);
		}
		else {
			System.out.println("Nenhum numero par!!!");
		}
		sc.close();
	}

}
