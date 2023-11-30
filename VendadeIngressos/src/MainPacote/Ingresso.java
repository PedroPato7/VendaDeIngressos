package MainPacote;

import java.util.ArrayList;

public class Ingresso {
	
	private Usuario compradorUsuario;
	private ArrayList<String>nomeIngressos;
	
	
	public Ingresso(Usuario compradorUsuario, ArrayList<String> nomeIngressos) {
		setCompradorUsuario(compradorUsuario);
		setNomeIngressos(nomeIngressos);
	}
	
	public Usuario getCompradorUsuario() {
		return compradorUsuario;
	}

	public void setCompradorUsuario(Usuario compradorUsuario) {
		this.compradorUsuario = compradorUsuario;
	}

	public ArrayList<String> getNomeIngressos() {
		return nomeIngressos;
	}

	public void setNomeIngressos(ArrayList<String> nomeIngressos) {
		this.nomeIngressos = nomeIngressos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ingresso [compradorUsuario=");
		builder.append(compradorUsuario);
		builder.append(", nomeIngressos=");
		builder.append(nomeIngressos);
		builder.append("]");
		return builder.toString();
	}

	
}
