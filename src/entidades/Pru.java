package entidades;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Pru {
	private int id;
	private String texto;
	private String data;
	private int quantidadeLikes;
	private boolean bloqueado;

	public Pru() {
	}

	public Pru(int id, String texto, String data, int quantidadeLikes, boolean bloqueado) {
		this.id = id;
		this.texto = texto;
		this.data = data;
		this.quantidadeLikes = quantidadeLikes;
		this.bloqueado = bloqueado;
	}

	public void idAleatorio() {
		Random aleatorio = new Random();
		int limeteId = 100;
		id = aleatorio.nextInt(limeteId);
	}

	public void mensagem(String texto) {
		setTexto(texto);
	}

	public String dataEHoraAtual() {
		Calendar dataEHora = Calendar.getInstance();
		Date data = dataEHora.getTime();
		DateFormat dataEHoraFormatados = DateFormat.getDateTimeInstance();
		return this.data = dataEHoraFormatados.format(data);
	}

	public int Curtir() {
		return ++quantidadeLikes;
	}

	@Override
	public String toString() {
		return "Pru [texto=" + texto + "]";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public int getQuantidadeLikes() {
		return quantidadeLikes;
	}

}
