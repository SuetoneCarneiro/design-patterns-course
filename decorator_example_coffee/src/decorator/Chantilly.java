package decorator;

public class Chantilly extends AdicionalDecorator {
    
	public Chantilly(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + ", com chantilly";
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto() + 3.0;
    }
}
