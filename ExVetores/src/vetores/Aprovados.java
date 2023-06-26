package vetores;

import java.util.Scanner;

/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).*/

import entities.Student;

public class Aprovados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serão digitados: ");
		int n = sc.nextInt();
		Student[] aluno = new Student[n];
		
		for(int i = 0;i < aluno.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "º aluno: ");
			sc.nextLine();
			String name = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			aluno[i] = new Student(name,nota1,nota2);
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0;i < aluno.length; i++) {
			if (aluno[i].aprovado()) {
				System.out.println(aluno[i].name);
			}
		}
		
		sc.close();
	}
}
