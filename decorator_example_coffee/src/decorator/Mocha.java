package decorator;

// Componente concreto
public class Mocha implements Cafe {
    @Override
    public String getDescricao() {
        return "Mocha";
    }

    @Override
    public double getCusto() {
        return 20.0;
    }

}
