package vetores;

import java.util.Scanner;

import entities.PessoaVet;

/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.*/

public class DadosPessoas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		
		int n = sc.nextInt(), homens= 0,mulheres = 0;
		double menor = 0,maior = 0,soma = 0;
		
		PessoaVet[] pessoa = new PessoaVet[n];
		
		for(int i = 0;i<pessoa.length;i++) {
			System.out.println("Altura da " + (i+1) + "º pessoa:");
			double altura = sc.nextDouble();
			System.out.println("Genero da " + (i+1) + "º pessoa:");
			char genero = sc.next().charAt(0);
			
			if (altura > maior) {
				maior = altura;
			}
		
			if (altura < menor || menor == 0) {
				menor = altura;
			}
		
			if(genero == 'F') {
				soma += altura;
				mulheres++;
			} 
			else {
				homens ++;
			}
		
			pessoa[i] = new PessoaVet(genero,altura); 
			}
		
		double media = soma/mulheres;
		
		System.out.println("Menor altura: " + menor);
		System.out.println("Maior altura: " + maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n",media);
		System.out.println("Numero de homens = " + homens);
		sc.close();

	}

}
