package MainPacote;

public class pagamento {
	
	private String gerarCompPagamento;
	private String gerarCompIngresso;
	private String formaPagamento;
	private String email;
	
	public pagamento(String formaPagamento, carrinho ing) {
		setFormaPagamento(formaPagamento);
		if (ing.getQuantIngressos() > 1) {
			setGerarCompIngresso(" Os ingressos foram cadastrados com sucesso, um PDF será enviado para o e-mail: ");
		} else if (ing.getQuantIngressos() == 1) {
			setGerarCompIngresso(" Seu ingresso foi cadastrado com sucesso, um PDF será enviado para o e-mail: ");
		}		
	}
	
	public void compPagamento(boolean confirm, Usuario info) {
		if (confirm) {
			setGerarCompPagamento(" Seu comprovante foi gerado com sucesso, um PDF foi enviado para o e-mail: ");
		} else {
			setGerarCompPagamento(null);
		}
		email = info.getEmail();
	}
	
	public String getGerarCompPagamento() {
		return gerarCompPagamento;
	}
	public void setGerarCompPagamento(String gerarCompPagamento) {
		this.gerarCompPagamento = gerarCompPagamento;
	}
	public String getGerarCompIngresso() {
		return gerarCompIngresso;
	}
	public void setGerarCompIngresso(String gerarCompIngresso) {
		this.gerarCompIngresso = gerarCompIngresso;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pagamento [gerarCompPagamento=");
		builder.append(gerarCompPagamento);
		if (gerarCompPagamento != null) {
			builder.append(email);
		}		
		builder.append(", gerarCompIngresso=");
		builder.append(gerarCompIngresso);
		builder.append(email);
		builder.append(", formaPagamento=");
		builder.append(formaPagamento);
		builder.append("]");
		return builder.toString();
	}	
}
