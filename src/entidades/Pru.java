package entidades;

import java.util.Date;

public class Pru {
	private int id;
	private String texto;
	private Date data;
	private int quantidadeLikes;
	private boolean bloqueado;

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void mensagem(String texto) {
		setTexto(texto);
	}

	@Override
	public String toString() {
		return "Pru [texto=" + texto + "]";
	}

}
