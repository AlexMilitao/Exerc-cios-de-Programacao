package vetores;
import java.util.Scanner;

/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

public class Negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas numeros serão digitados?");
		int N = sc.nextInt();
		int[] numbers = new int [N]; 
		
		while (N >= 11 && N <= 0) {
			System.out.println("Digite um numero entre 1 e 10!! ");
			N = sc.nextInt();
		}
		
		for (int i = 0; i < numbers.length;i++) {
			System.out.println("Digite um numero: ");
			numbers[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("Numeros Negativos: ");
		for (int i = 0; i < numbers.length;i++) {
			if (numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
		
		
		sc.close();
	}

}
