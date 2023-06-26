package vetores;

import java.util.Scanner;

/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.*/

public class SomaVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter cada vetor?");
		int n = sc.nextInt();
		
		
		int[] a = new int[n];
		int[] b = new int [n];
		int[] c = new int[n];
			
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();		
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();		
		}
		
		System.out.println("Valor  resultante: ");
		for(int i = 0; i < c.length; i++) {
			
			c[i] = a[i] + b[i];
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		sc.close();

	}

}
