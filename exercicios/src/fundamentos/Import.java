package fundamentos;

//Obs: o importe fica fora da classe 
import java.util.Date; // date importado

public class Import {
	
	public static void main(String[] args) {
		
		/* por padrão o java não tem o "date" liberado para o uso igual acontece com os tipos primitivos e etc.
		 * Mas para utilizalo eu apenas preciso importar ele, igual ou feito acima, para fazer essa importação eu posso
		 * escrever "import java.util.Date;" ou eu escrevo "Date" no meu codigo normalmente e o proprio compilador vai 
		 * dar a opçao de fazer a importação automatica
		 */
		Date d = new Date();  
		System.out.println(d); // esle está imprimindo a data e hora atual da execuçao
		
		/*
		 * Sempre observar o tipo de importação que está fazendo para não importar errado. 
		 * Ex: o data existe mais de um tipo (java.util.Date, java.sql.Date entre outros)
		 * Se fizer a importação errada, logo seu codigo não vai ter o tipo correto para trabalhar 
		 * as funcionalidades conforme esperado
		 */
		
		
	}

}
