package locadora;

public class Automovel implements Alugavel{
	  public static final int BASICO = 0;   // Carros hatch
	  public static final int FAMILIA = 1;  // Carros Sedan ou SUV basico
	  public static final int LUXO = 2;     // Carros padrao luxo
	  // public static final int PREMIUM = 3;   // Carros de luxo premium

	  private String descricao;
	  private String placa;
	  private int ano; // Ano de fabricacao
	  private int codigoDoPreco;
	  
	  public Automovel(String descricao, int ano, String placa, int codigoDoPreco) {
	    this.descricao = descricao;
	    this.placa = placa;
	    this.ano = ano;
	    this.codigoDoPreco = codigoDoPreco;
	  }
	 
	  public String getDescricao() {
	    return descricao;
	  }
	  
	  public String getPlaca() {
	    return placa;
	  }
	  
	  public String getAno() {
	    return String.valueOf(ano);
	  }
	 
	  public int getCodigoDoPreco() {
	    return codigoDoPreco;
	  }

	  @Override
	  public double getValorDeUmaLocacao(Locacao locacao) {
		  return valorDeUmaLocacao(locacao);
	  }

	  @Override
	  public int getPontosDeAlugadorFrequente(int diasAlugada) {
		  return getPontosDeLocadorFrequente(new Locacao(this, diasAlugada));
	  }
	 
	  public void setCodigoDoPreco(int codigoDoPreco) {
	    this.codigoDoPreco = codigoDoPreco;
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
