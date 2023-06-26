package vetores;

import java.util.Scanner;

import entities.PessoaVet;

public class MaisVelho {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int maior = 0;
	String velho = "Idades digitadas a baixo de 0";
	
	System.out.println("Quantas pessoas vão ser digitadas? ");
	int n = sc.nextInt();
	PessoaVet[] pessoa = new PessoaVet[n];
	
	for(int i = 0; i < pessoa.length; i++) {
		System.out.println("Dados da " + (i+1) + "º pessoa:");
		
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		
		pessoa[i] = new PessoaVet(nome,idade);
		
			if (idade > maior) {
			   maior = idade;
			   velho = pessoa[i].getName();
			}	
	}
	System.out.println("Pessoa mais velha: " + velho);
	
	sc.close();

	}

}
