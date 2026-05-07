package decorator;

public class CafeExpresso implements Cafe {
    @Override
    public String getDescricao() {
        return "Café expresso";
    }

    @Override
    public double getCusto() {
        return 5.5;
    }
}