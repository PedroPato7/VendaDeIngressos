package MainPacote;

import java.time.LocalDate;

public class Usuario extends Conta {
	
	private LocalDate dataNasc;
	
	public Usuario(LocalDate dataNasc, String nome, String senha, String email) {
		setDataNasc(dataNasc);
		setNome(nome);
		setSenha(senha);
		setEmail(email);
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [dataNasc=");
		builder.append(dataNasc);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
