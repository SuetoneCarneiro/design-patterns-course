package adapter;

public class CorollaCross implements AutomovelBrasileiro {
    @Override
    public double getVelocidadeKmh(boolean turbo) {
        return 140 * (turbo ? 1.6 : 1);
    }
    
}
