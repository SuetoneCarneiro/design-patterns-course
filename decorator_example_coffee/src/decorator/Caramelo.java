package decorator;

public class Caramelo extends AdicionalDecorator {
    
	public Caramelo(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + ", com caramelo";
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto() + 2.0;
    }
}