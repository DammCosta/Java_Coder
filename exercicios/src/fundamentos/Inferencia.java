package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; //declaração e inicialização
		System.out.println(a);
		
		var b = 4.5; // o var serve para quando eu não informo o tipo (int, double etc) o proprio compilador vai identificar o tipo
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto"; // OBS: não posso pegar uma string e tentar converter para numereal e nem o contrario. 
		System.out.println(c);// tbm não posso pegar um numero inteiro e tentar converter para decimal, porem posso pegar um decimal e converter em inteiro
		
		double d; // variável foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d); // usada
		
/*		var e; // OBS: no caso do var, eu não posso declarar a variável em uma linha e inicializar em outra
		e = 123.45; // pq para que o compilador entenda o tipo de var, ela deve ser inicializada na mesma linha de sua declaração
		System.out.println(e);
*/		
	}

}
