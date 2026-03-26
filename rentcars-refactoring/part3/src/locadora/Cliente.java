package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Locacao> carrosAlugados = new ArrayList<Locacao>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionaLocacao(Locacao locacao) {
		carrosAlugados.add(locacao);
	}

	private Double getValorTotal(){
		double valorTotal = 0.0;
		Iterator<Locacao> locacoes = carrosAlugados.iterator();
		while(locacoes.hasNext()) {
			Locacao locacao = locacoes.next();
			valorTotal += locacao.valorDeUmaLocacao(locacao);
		}
		return valorTotal;
	}
	
	private int getPontosTotaisDeLocadorFrequente(){
		int pontosTotaisDeLocadorFrequente = 0;
		Iterator<Locacao> locacoes = carrosAlugados.iterator();
		while(locacoes.hasNext()){
			Locacao locacao = locacoes.next();
			pontosTotaisDeLocadorFrequente += locacao.getPontosDeLocadorFrequente(locacao);
		}
		return pontosTotaisDeLocadorFrequente;
	}

	public String extrato() {
		final String fimDeLinha = System.getProperty("line.separator");
		int sequencia = 0;

		String resultado = "Registro de Locacoes de " + getNome() + fimDeLinha;
		resultado += String.format("Seq Automovel             Ano  Diarias   Valor Pago"+fimDeLinha);
		resultado += String.format("=== ==================== ===== ========= ==========="+fimDeLinha);

		
		Iterator<Locacao> locacoes = carrosAlugados.iterator();
		while(locacoes.hasNext()){
			Locacao locacao = locacoes.next();
			sequencia++;
			resultado += String.format("%02d. %-20s  %4d    %2d     R$ %8.2f"+fimDeLinha,sequencia, locacao.getCarro().getDescricao(),locacao.getCarro().getAno(), locacao.getDiasAlugado(), locacao.valorDeUmaLocacao(locacao));
		}

		// adiciona rodapé
		resultado += "====================================================" + fimDeLinha;
		resultado += String.format("Valor Acumulado em diarias............:  R$ %8.2f" + fimDeLinha, getValorTotal());
		resultado += "Voce acumulou " + getPontosTotaisDeLocadorFrequente() +
              " pontos de locador frequente";

		return resultado;
	}
	
}