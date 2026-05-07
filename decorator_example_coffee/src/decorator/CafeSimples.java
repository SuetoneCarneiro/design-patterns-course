package decorator;

// Componente concreto
public class CafeSimples implements Cafe {
    @Override
    public String getDescricao() {
        return "Café simples";
    }

    @Override
    public double getCusto() {
        return 4.0;
    }

}
