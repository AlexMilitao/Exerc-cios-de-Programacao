package vetores;

import java.util.Scanner;

/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

import entities.PessoaVet;

public class Altura {

	public static void main(String[] args) { // lê um numero inteiro de pessoas e depois calcula a média
	Scanner  sc = new Scanner(System.in);
	
	System.out.println("Digite o numero de pessoas:");
	int number = sc.nextInt(), count = 0;
	double sum = 0;
	String smaller[] = new String[number];
	PessoaVet[] pessoa = new PessoaVet[number];
	
	for(int i = 0;i < number;i++) {
		 System.out.println("Digite os dados da " + (i + 1) + "ª pessoa: ");
		 sc.nextLine();
		 System.out.println("Nome: ");
		 String name = sc.nextLine();
		 
		 System.out.println("Idade: ");
         int age = sc.nextInt();
         
         System.out.println("Altura: ");
         double heigth = sc.nextDouble();
         sum += heigth;
         
         pessoa[i] = new PessoaVet(name,age,heigth);   
         
         	if (age < 16 ) {
        	  smaller[i] = pessoa[i].getName();
        	  count += 1;
        	  
         	}
 }
	
	double avg = sum / number;
	double middleAge = (double)count/number * 100;
	System.out.printf("Altura média: %.2f%n", avg);
	System.out.println("Pessoas com menos de 16 anos: " + middleAge + "%");
	
	for(int i = 0;i < number;i++) {
		if (smaller[i] != null) {	
		System.out.println(smaller[i]);
		}
	}
	sc.close();

	}

}
