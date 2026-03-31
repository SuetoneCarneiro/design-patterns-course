package locadora;

public class Luxo extends Classificacao {
    
    public int getCodigoDoPreco(){
        return 2;
    }

    public double getValorDaLocacao(int diasAlugado){
        double valor = diasAlugado * 200.0;
        if(diasAlugado > 4) {
			valor *= 0.9;
		}
        return valor;
    }

}
