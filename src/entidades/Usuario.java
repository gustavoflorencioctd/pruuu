package entidades;

public class Usuario {
	private String nome;
	private String email;
	private String cpf;
	private Pru pru;

	public void setPru(String texto) {
		this.pru = new Pru();
		pru.mensagem(texto);
	}

	public Pru getPru() {
		return pru;
	}

	public void criarMensagem(String texto) {
		setPru(texto);
	}

	@Override
	public String toString() {
		return "Usuario [getPru()=" + getPru() + "]";
	}

}
