package locadora;

public class Familia extends Classificacao {
    
    public int getCodigoDoPreco(){
        return 1;
    }

    public double getValorDaLocacao(int diasAlugado){
        return diasAlugado * 130.0;
    }
    
}
