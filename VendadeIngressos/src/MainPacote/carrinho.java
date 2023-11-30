package MainPacote;

public class carrinho {

	private double valorTotal;
	private int quantIngressos;
	private int quantAd;
	private int quantRem;
	
	public carrinho(categoriaIngresso ingresso, int quantIngressos, Evento ev) {
		setQuantIngressos(quantIngressos);
		if (quantIngressos > ev.getLimitIngresso()) {
			setQuantIngressos(ev.getLimitIngresso());
		}
		adicionarCarrinho(quantAd, ingresso, ev);
		removerCarrinho(quantRem, ingresso);
		calculo(ingresso);		
	}
	
	public void adicionarCarrinho(int quantAd, categoriaIngresso ingresso, Evento ev) {
		setQuantIngressos(quantIngressos + quantAd);
		if (quantIngressos > ev.getLimitIngresso()) {
			setQuantIngressos(ev.getLimitIngresso());
		}
		setQuantAd(quantAd);
		calculo(ingresso);
	}
	
	public void removerCarrinho(int quantRem, categoriaIngresso ingresso) {
		setQuantIngressos(quantIngressos - quantRem);
		setQuantRem(quantRem);
		if (quantIngressos < 0) {
			setQuantIngressos(0);
		}
		calculo(ingresso);
	}
	
	public void calculo(categoriaIngresso ingresso) {
		valorTotal = quantIngressos * ingresso.getPreco();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("carrinho [valorTotal=");
		builder.append(valorTotal);
		builder.append(", quantIngressos=");
		builder.append(quantIngressos);
		builder.append(", quantAd=");
		builder.append(quantAd);
		builder.append(", quantRem=");
		builder.append(quantRem);
		builder.append("]");
		return builder.toString();
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getQuantIngressos() {
		return quantIngressos;
	}

	public void setQuantIngressos(int quantIngressos) {
		this.quantIngressos = quantIngressos;
	}

	public int getQuantAd() {
		return quantAd;
	}

	public void setQuantAd(int quantAd) {
		this.quantAd = quantAd;
	}

	public int getQuantRem() {
		return quantRem;
	}

	public void setQuantRem(int quantRem) {
		this.quantRem = quantRem;
	}
}
