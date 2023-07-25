package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		//neste exempplo abaixo estou informando variavéis, valores que podem ser alterados
		double raio = 3.4;
		final double PI = 3.14159; //ao digitar final, transformei de variavel para contante, ou seja, não posso altrar este valor em nenhum outro momento 
		//OBS: sempre que for usar contantes, deve ser usar em CAIXA ALTA
		
		
		//posso criar uma variavel para calcular os valores fornecidos acima ou
		double area = PI * raio * raio;
		// posso calcular dentro do sysout: (System.out.println(PI * raio * raio);
		//o resultado é o mesmo, sao apenas formas diferentes de obter o mesmo resultado
		System.out.println(area);
		
		raio = 10; // como raio é uma variavel, eu mudei seu valor aqui de 3.4 para 10.
		area = PI * raio *raio;
		System.out.println("Área = " + area + "m2.");
				
		
		
	}

}
