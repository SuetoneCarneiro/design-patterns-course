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
		  return locacao.getCarro().valorDeUmaLocacao(locacao);
	  }

	  public int getPontosDeLocadorFrequente(Locacao locacao){
		  return locacao.getCarro().getPontosDeLocadorFrequente(locacao);
	  }
}
