package locadora;

public class Basico extends Classificacao {

    public int getCodigoDoPreco(){
        return 0;
    }

    public double getValorDaLocacao(int diasAlugado){
        return diasAlugado * 90.0;
    }

}
