package adapter;

public class AutomovelAdapter {
    private AutomovelBrasileiro automovelBrasileiro;

    public AutomovelAdapter(AutomovelBrasileiro automovelBrasileiro) {
        this.automovelBrasileiro = automovelBrasileiro;
    }

    public double getSpeed() {
        return automovelBrasileiro.getVelocidadeKmh(false) * 0.621371;
    }
}
