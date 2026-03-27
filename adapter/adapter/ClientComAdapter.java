package adapter;

// https://medium.com/@aashna.chourasia.2/adapter-design-pattern-34b6da192489

public class ClientComAdapter {
    public static void main(String[] args) {
    	
        AutomovelBrasileiro corollaCross = new CorollaCross();
        AutomovelAdapter automovelAdapter = new AutomovelAdapter(corollaCross);
        System.out.println("Corolla Cross top speed is " + automovelAdapter.getSpeed() + " Mph.");
        
    }
}