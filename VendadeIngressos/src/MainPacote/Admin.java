package MainPacote;

public class Admin extends Conta {
	
	
	public Admin(String nome, String senha, String email) {
		setNome(nome);
		setSenha(senha);
		setEmail(email);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Admin [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
}
