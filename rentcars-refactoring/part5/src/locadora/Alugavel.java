package locadora;

public interface Alugavel {
    public String getDescricao();
    public String getAno();
    public double getValorDeUmaLocacao(Locacao locacao);
    public int getPontosDeAlugadorFrequente(int diasAlugada);
}
