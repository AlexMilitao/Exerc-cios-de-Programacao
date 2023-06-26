package vetores;

import java.util.Scanner;

import entities.Product;


public class ProductVetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Quantos produtos serão digitados?");
        int n = sc.nextInt(); // Lê o tamanho do vetor a partir da entrada do usuário
        
        Product[] vect = new Product[n];  // Cria um vetor de objetos ProductVet com tamanho n
        
        for (int i = 0; i < vect.length; i++) { // Loop para preencher o vetor com objetos ProductVet
            sc.nextLine();
            System.out.println("Nome do produto:");
            String name = sc.nextLine(); // Lê o nome do produto do usuário
            System.out.println("Preço do produto:");
            double price = sc.nextDouble(); // Lê o preço do produto do usuário
            vect[i] = new Product(name, price); // Cria um objeto ProductVet com o nome e preço lidos e atribui à posição i do vetor
        }
        
        double sum = 0;
        
        for (int i = 0; i < vect.length; i++) {  // Loop para calcular a soma dos preços dos produtos no vetor
            sum += vect[i].getPrice(); // Obtém o preço do produto na posição i e adiciona à variável sum       
        }
        
        double avg = sum / vect.length; // Calcula a média dos preços dos produtos
        
        System.out.printf("Média dos preços = %.2f%n", avg); // Imprime a média formatada na saída padrão
        
        sc.close();
    }
}
