package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(4)); // ".charAt" - estou querendo saber qual é a letra entre parenteses
		
		String s = "Boa tarde"; // String é um objeto imutavél eu consigo substituir, não modificar
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		// Nos dois exemplos acima estou usando duas funcionalidades diferente para um mesmo resultado, colocar "!!!" no final da frase
		System.out.println(s.startsWith ("Boa")); // estou validando com falso ou verdadeiro se a String começa com "Boa"
		System.out.println(s.startsWith ("boa")); // Neste mesmo exemplo a resposta vai ser falsa, pois informei com letra minuscula
		System.out.println(s.toLowerCase() .startsWith("boa")); // "s.toLowerCase()" - transformei tudo em minusculo ante de validar o "boa"
		System.out.println(s.endsWith("tarde"));// Estou validando se a frase da String termina com "tarde"
		System.out.println(s.toUpperCase() .endsWith("TARDE"));// Transformei a String em CAIXA ALTA e depois fiz a validação
		System.out.println(s.length()); // Estou determinando quantos caracteres possui a String
		System.out.println(s.equals("boa tarde"));// funcionalidade de comparação - Vai dar falso pois o b é minusculo
		System.out.println(s.equalsIgnoreCase("boa tarde"));// agora o equals vai ignorar se a letra está em maiuscula ou meniscula, mas qual outra coisa que possa estar diferente ele vai acusar
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		//No exemplo acima estou apenas demonstrando que o "var" reconhece o tipo de forma automatica (String, inteiro, double)
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		//Outra forma de fazer a mesma impressão é:
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		/*
		 * Desta forma o codigo fica um pouco mais limpo e organizado
		 * Obs: o "%s" substitui a string; o "%d" subistitui o inteiro; o "%f" substitio o valores ponto flutuantes 
		 * e o "%.2f" significa que é para 
		 * demonstrar apenas duas casas decimais após no ponto no double
		 */
		// Uma terceira forma de fazer é:
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase); // O "String.format" é uma maneira de criar uma String e já concatenar tudo  de uma vez
		
		
		
		
	}

}
