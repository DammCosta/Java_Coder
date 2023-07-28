package fundamentos;

public class NotacaoPonto {
	
	
	public static void main(String[] args) {
		
		
		String s = "Bom dia X";
		//Eu posso utilizar tipo não primitivos a partir do s. (assim, terei acesso a diversas funcionalidades)
		s = s.toUpperCase();// esse funcionalidade vai transformar toda a string em CAIXA ALTA
		System.out.println(s);
		
		
		s = s.replace("X", "Senhora"); // Essa funcionalidade me permite alterar a string
		System.out.println(s);
		
		/*Obs: Vale resaltar que para o toUpperCase funcione em "Senhora" tbm, eu preciso seguir a ordem do exemplo abaixo. 
		Uma vez que o exeplo acima está executando duas coisas em momentos diferentes. 
		*/
		String a = "Bom dia Y";
		a = s.replace("Y", "Senhora"); // Aqui eu altero o "Y" para "Senhora" primeiro
		a = s.toUpperCase(); // Depois eu mando tudo ficar com CAIXA ALTA
		a = s.concat("!!!"); // esse funçao serve para concatenar alguma informaçao
		System.out.println(a);
		
		//Outras maneiras que podem ser utilizadas a notaçao
		System.out.println("Leo" .toUpperCase());
		
		String j = "Daniel".toUpperCase();
		System.out.println(j);
		
		String b = "Boa tarde H" .replace("H", "Jovem");
		System.out.println(b);
		
		//Obs: Tipos primitivos não tem notação ponto
		
		
	}

}
