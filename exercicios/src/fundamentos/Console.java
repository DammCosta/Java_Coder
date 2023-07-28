package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n"); // O "\n" serve para quebrar a linha (enter no teclado conencional)
		// Nesta forma de impressão (print), vai ficar tudo na mesma linha
		
		System.out.println("Bom");
		System.out.println("dia!");
		//Já utilizando o "println" para cada nova impressão é utilizado uma linha diferente, no  caso a linha de baixo
		
		System.out.printf("\nMegaSena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); // O "%n" tbm serve como quebra de linha
		// Estou pegando os caracteres especiais e substituindo pelos valores que informei posteriormente
		System.out.printf("\nSalario: %.1f%n", 1234.5678);
		// Neste exemplo ele mostrou o resultado aopós o "." e arrendou o resultado, que no caso foi para 6
		System.out.printf("\nNome: %s%n%n", "João");
		
		/* 
		 * No exemplo abaixo vou utilizar a entrada de informação vinda do teclado através do 
		 * "System.in". 
		 * O "System.out" é a sáida do sistema, que por padrão é a tela. 
		 */
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine(); // "nextLine" retorna uma String
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
				
		System.out.println("Nome = " + nome + " " + sobrenome);
		
	
		System.out.print("\nDigite sua idade: ");
		int idade = entrada.nextInt(); // "nextInt" retorna um inteiro
		
		System.out.printf("%n%s %s tem %d anos.", nome, sobrenome, idade); 
		/*
		 * Obs: neste tipo de impressão + contatenação do resultado eu preciso usar o "printf" 
		 * e não o "println" igual foi usado nos exemplos acima 
		 */
		entrada.close(); // estou encerrando a entrada aberta lá em cima
	}

}
