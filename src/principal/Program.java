package principal;

import entidades.Usuario;

public class Program {

	public static void main(String[] args) {
		
		Usuario gustavo = new Usuario();
		Usuario rafael = new Usuario();
		
		gustavo.criarMensagem("Oi, essa e minha primeira mensagem");
		rafael.criarMensagem("Mais um teste de mensagens!");
		
		System.out.println(gustavo);
		System.out.println(rafael);
		
	}

}
