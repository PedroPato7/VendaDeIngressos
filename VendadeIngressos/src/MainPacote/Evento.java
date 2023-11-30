package MainPacote;

import java.time.LocalDate;

public class Evento {
	
	private LocalDate dataEvento;
	private boolean restricaoIdade;
	private int limitIngresso;
	private String descricaoEvento;
	
	public Evento(LocalDate dataEvento, boolean restricaoIdade, int limitIngresso, String descricaoEvento) {
		setDataEvento(dataEvento);
		setRestricaoIdade(restricaoIdade);
		setLimitIngresso(limitIngresso);
		setDescricaoEvento(descricaoEvento);
	}
	
	public void atualizarEvento(LocalDate dataE, boolean ri, int li, String descE) {
		setDataEvento(dataE);
		setRestricaoIdade(ri);
		setLimitIngresso(li);
		setDescricaoEvento(descE);
	}
	
	public void removerEvento(boolean remover) {
		if (remover) {
			setDataEvento(null);
			setRestricaoIdade(false);
			setLimitIngresso(0);
			setDescricaoEvento(null);
		}
	}
	
	public LocalDate getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}
	public boolean isRestricaoIdade() {
		return restricaoIdade;
	}
	public void setRestricaoIdade(boolean restricaoIdade) {
		this.restricaoIdade = restricaoIdade;
	}
	public int getLimitIngresso() {
		return limitIngresso;
	}
	public void setLimitIngresso(int limitIngresso) {
		this.limitIngresso = limitIngresso;
	}
	public String getDescricaoEvento() {
		return descricaoEvento;
	}
	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Evento [dataEvento=");
		builder.append(dataEvento);
		builder.append(", restricaoIdade=");
		builder.append(restricaoIdade);
		builder.append(", limitIngresso=");
		builder.append(limitIngresso);
		builder.append(", descricaoEvento=");
		builder.append(descricaoEvento);
		builder.append("]");
		return builder.toString();
	}
}
