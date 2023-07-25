package fundamentos;

public class TipoPrimitivos {
	
	public static void main(String[] args) {
		//Informações do funcionario
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // para o sistema entender que é um literal log, preciso informar o "L" no final
		
		//Tipo numéricos reais
		float salario = 11_445.44F;// para o sistema entender que é um literal float, preciso informar o "F" no final
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		//Tipo caractere
		char status = 'A'; // ativo  | sempre deve ser usado apenas 1 caracter (simbolos ou numeros) ou '\u0010' isso significa um numero dentro sa tabela
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		//Java_Coder
		//Curso de Java da Coder.com
		
	}

}
