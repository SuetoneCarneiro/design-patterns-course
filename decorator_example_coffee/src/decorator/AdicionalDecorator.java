package decorator;

//Decorador Base
public class AdicionalDecorator implements Cafe {
 
	protected Cafe cafeDecorado;

    public AdicionalDecorator(Cafe cafe) {
        this.cafeDecorado = cafe;
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao();
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto();
    }
}
