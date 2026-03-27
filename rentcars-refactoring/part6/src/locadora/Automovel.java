package locadora;

public class Automovel implements Alugavel{
	  public static final int BASICO = 0;   // Carros hatch
	  public static final int FAMILIA = 1;  // Carros Sedan ou SUV basico
	  public static final int LUXO = 2;     // Carros padrao luxo
	  // public static final int PREMIUM = 3;   // Carros de luxo premium

	  private String descricao;
	  private String placa;
	  private int ano; // Ano de fabricacao
	  private Classificacao classificacao;
	  
	  public Automovel(String descricao, int ano, String placa, Classificacao classificacao) {
	    this.descricao = descricao;
	    this.placa = placa;
	    this.ano = ano;
	    this.classificacao = classificacao;
	  }

	  public Automovel(String descricao, int ano, String placa, int codigoDoPreco) {
        this.descricao = descricao;
        this.placa = placa;
        this.ano = ano;
        switch (codigoDoPreco) {
          case BASICO:
            this.classificacao = new Basico();
            break;
          case FAMILIA:
            this.classificacao = new Familia();
            break;
          case LUXO:
            this.classificacao = new Luxo();
            break;
          default:
            throw new IllegalArgumentException("Codigo de preco desconhecido: " + codigoDoPreco);
        }
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
	    return classificacao.getCodigoDoPreco();
	  }

	  @Override
	  public double getValorDeUmaLocacao(Locacao locacao) {
		  return classificacao.getValorDaLocacao(locacao.getDiasAlugado());
	  }

	  @Override
	  public int getPontosDeAlugadorFrequente(int diasAlugada) {
		  return getPontosDeLocadorFrequente(new Locacao(this, diasAlugada));
	  }
	 
	  public void setCodigoDoPreco(int codigoDoPreco) {
	    switch (codigoDoPreco) {
	      case BASICO:
	        this.classificacao = new Basico();
	        break;
	      case FAMILIA:
	        this.classificacao = new Familia();
	        break;
	      case LUXO:
	        this.classificacao = new Luxo();
	        break;
	      default:
	        throw new IllegalArgumentException("Codigo de preco desconhecido: " + codigoDoPreco);
	    }
	  }

	  public int getPontosDeLocadorFrequente(Locacao locacao){
		  return classificacao.getPontosDeAlugadorFrequente(locacao.getDiasAlugado());
	  }
}
