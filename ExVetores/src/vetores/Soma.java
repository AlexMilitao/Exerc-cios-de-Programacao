package vetores;

import java.util.Scanner;

/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor*/

public class Soma {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	
	
	System.out.println("quantos numeros voce vai digitar? ");
	int n = sc.nextInt();
	double vect[] = new double[n];
	double sum = 0;
	
	for(int i = 0;i < vect.length;i++) {
		System.out.println("Digite um numero: ");
		vect[i] = sc.nextDouble();
		sum += vect[i];
	}
	System.out.println();
	
	double average = sum/vect.length;
	
	System.out.print("valores = ");
	for (int i = 0;i < vect.length; i++) {
	System.out.print(vect[i] + " ");
	}
	System.out.println();
	
	System.out.printf("Soma = %.2f%n",sum);
	System.out.printf("Media = %.2f%n",average);
	sc.close();


	}

}
