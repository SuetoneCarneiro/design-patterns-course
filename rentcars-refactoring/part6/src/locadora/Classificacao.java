package locadora;

public abstract class Classificacao {

    private static final int PONTO_SIMPLES = 1;
    private static final int PONTO_LUXO = 2;

    public abstract int getCodigoDoPreco();

    public abstract double getValorDaLocacao(int diasAlugado);

    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        if(this.getCodigoDoPreco() == Automovel.LUXO && diasAlugado > 2) {
            return PONTO_SIMPLES + PONTO_LUXO;
        }
        return PONTO_SIMPLES;
    }

}
