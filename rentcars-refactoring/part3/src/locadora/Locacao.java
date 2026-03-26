package locadora;

public class Locacao {
	   private Automovel carro;
	   private int diasAlugado;
	 
	   public Locacao(Automovel carro, int diasAlugado) {
	      this.carro = carro;
	      this.diasAlugado = diasAlugado;
	   }
	 
	   public Automovel getCarro() {
	      return carro;
	   }
	 
	   public int getDiasAlugado() {
	      return diasAlugado;
	   }

	   public Double valorDeUmaLocacao(Locacao locacao) {
		  double valorCorrente = 0.0;

		  switch(locacao.getCarro().getCodigoDoPreco()) {
		  case Automovel.BASICO: // R$ 90.00 por dia
			  valorCorrente += locacao.getDiasAlugado() * 90.0;
			  break;

		  case Automovel.FAMILIA: // R$ 130.00 por dia
			  valorCorrente += locacao.getDiasAlugado() * 130.0;
			  break;

		  case Automovel.LUXO: // R$ 200.00 por dia
			  valorCorrente += locacao.getDiasAlugado() * 200.0;
			
			// Adiciona um desconto de 10% se alugar o carro por mais de 4 dias
			  if(locacao.getDiasAlugado() > 4) {
				  valorCorrente *= 0.9;
			  }
			  break;

		  }
		  return valorCorrente;
	  }

	  public int getPontosDeLocadorFrequente(Locacao locacao){
		  int pontosDeLocadorFrequente = 0;
		  // trata de pontos de locador frequente
		  pontosDeLocadorFrequente++;
		  // adiciona bonus para locação de um carro de luxo por pelo menos 3 dias
		  if(locacao.getCarro().getCodigoDoPreco() == Automovel.LUXO &&
			  locacao.getDiasAlugado() > 2) {
			  pontosDeLocadorFrequente+=2;
		  }
		  return pontosDeLocadorFrequente;
	  }
}
