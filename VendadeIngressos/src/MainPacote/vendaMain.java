package MainPacote;

import java.time.LocalDate;
import java.util.ArrayList;

public class vendaMain {

	public static void main(String[] args) {		
		
		Usuario user = new Usuario(LocalDate.parse("2005-01-14"), "Pablo", "PabloReiDelas", "pablinho29@gmail.com");
		// Cadastra o ano de nascimento, nome, senha e Email da conta do Usuario.
		
		
		Admin ad = new Admin("Roberto", "adminnimda", "Administracao@gmail.com");
		// Cadastra o nome, senha e Email da conta do administrador.
		
		
		Evento ev = new Evento(LocalDate.parse("2023-12-25"), false, 100, "Festa de natal no Tortuga.");
		// Cadastra um novo Evento, inserindo a data, se tem restrição de idade, qual o limite de ingressos e a descrição do evento.
		
		
		ev.atualizarEvento(LocalDate.parse("2023-12-31"), false, 50, "Festa de natal no Tortuga, foi adiado por conta de imprevistos.");
		// Atualiza um novo evento, substituindo as informações originais do Evento.
		
		
		ev.removerEvento(false);
		// Faz uma pergunta em boolean para saber se vai remover um evento existente ou não remover.
		
		
		categoriaEvento ce = new categoriaEvento("Banda ao vivo", "Show de banda tocando músicas ao vivo");
		// Cadastra a categoria do evento (Cinema, stand-up, banda ao vivo, etc), e a descrição do tipo de evento  	
		
		
		categoriaIngresso ci = new categoriaIngresso("VIP", 49.99);	
		// Informa a categoria do Ingresso escolhido(VIP, meia-entrada, por lote, etc) e o valor do ingresso.
		
		
		carrinho ca = new carrinho(ci, 1, ev);
		// Faz o calculo da quantidade de ingressos escolhidos, o valor total deles e limita a compra de ingressos para a quantidade máxima de ingressos..
		
		
		ca.adicionarCarrinho(2, ci, ev);
		// Adiciona uma quantia de ingresso ao carrinho.
		
		
		ca.removerCarrinho(0, ci);
		// Remove uma quantia de ingressos do carrinho.
		
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Lito");
		nomes.add("Ana");
		nomes.add("Chico");		
		// Nomes dos donos do ingressos (Caso a quantia de ingressos seja menor, tera de ser removido os nomes, caso se maior, terá de adicionar mais nomes..
		
		
		Ingresso i = new Ingresso(user, nomes);
		// Mostra a conta do usuario que comprou os ingressos e os donos de cada ingresso.
		
		
		pagamento pag = new pagamento("PIX.", ca);
		// Cadastra a forma de pagamento escolhida e envia um comprovante dos ingressos para o e-mail da conta. 
		
		
		pag.compPagamento(false, user);
		// Pergunta se o usuario vai querer o comprovante do pagamento ou não, caso queira, será enviado um e-mail para a conta do mesmo.
		
		
		System.out.println(ev);
		System.out.println(ce);
		System.out.println(ci);
		System.out.println(ca);
		System.out.println(i);
		System.out.println(user);
		System.out.println(ad);
		System.out.println(pag);		
	}

}
