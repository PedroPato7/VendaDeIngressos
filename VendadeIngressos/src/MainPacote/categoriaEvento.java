package MainPacote;

public class categoriaEvento {
	
	private String nome;
	private String descricaoCategoria;
	
	public categoriaEvento(String nome, String descricaoCategoria) {
		setNome(nome);
		setDescricaoCategoria(descricaoCategoria);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}
	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("categoriaEvento [nome=");
		builder.append(nome);
		builder.append(", descricaoCategoria=");
		builder.append(descricaoCategoria);
		builder.append("]");
		return builder.toString();
	}
}
