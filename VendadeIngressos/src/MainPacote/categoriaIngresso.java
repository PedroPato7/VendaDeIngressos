package MainPacote;

public class categoriaIngresso {

	private String ingresso;
	private double preco;
	
	public categoriaIngresso(String ingresso, double preco) {
		setIngresso(ingresso);
		setPreco(preco);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("categoriaIngresso [ingresso=");
		builder.append(ingresso);
		builder.append(", preco=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}
	public String getIngresso() {
		return ingresso;
	}
	public void setIngresso(String ingresso) {
		this.ingresso = ingresso;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
