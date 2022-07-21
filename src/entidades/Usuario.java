package entidades;

public class Usuario {
	private String nome;
	private String email;
	private String cpf;
	private Pru pru;

	public Usuario() {
	}

	public Usuario(String nome, String email, String cpf, Pru pru) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.pru = pru;
	}

	public void criarMensagem(String texto) {
		//setPru(texto);
		pru.mensagem(texto);
	}

	@Override
	public String toString() {
		return "Usuario [getPru()=" + getPru() + "]";
	}

	public void setPru(Pru pru) {
		//this.pru = new Pru();
		//pru.mensagem(texto);
		this.pru = pru;
	}

	public Pru getPru() {
		return pru;
	}

}
