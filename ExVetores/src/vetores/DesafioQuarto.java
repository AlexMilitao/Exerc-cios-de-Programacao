package vetores;

import java.util.Scanner;

import entities.Quarto;

public class DesafioQuarto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] vetor = new String[9];	
		Quarto[] quarto = new Quarto[9];
		
		System.out.println("Quantos quartos serão alugados? ");
		int aluguel = sc.nextInt();
		
		
		
		for (int i = 0; i < aluguel;i++) {
			System.out.println((i+1) + "º aluguel:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int Numquarto = sc.nextInt();
			
			quarto[Numquarto] = new Quarto(nome,email);
		}
		
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < vetor.length;i++) {
			if (quarto[i] != null) {
				System.out.println(i + ": " + quarto[i]);
			}
		}
		
		sc.close();
	}

}
