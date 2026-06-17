package second_exam.observer;

public class Main {
    public static void main(String[] args) {
        Partida partida = new Partida();
        PainelPlacar painel = new PainelPlacar();
        GerenciadorDeEfeitos gerenciador = new GerenciadorDeEfeitos();

        System.out.println("--- Iniciando a partida ---");
        System.out.println("Adicionando PainelPlacar e GerenciadorDeEfeitos como observadores...");
        partida.adicionarObserver(painel);
        partida.adicionarObserver(gerenciador);


        partida.registrarPontoP1();
        partida.registrarPontoP2();

        System.out.println("--- Removendo o efeito sonoro ---");
        partida.removerObserver(gerenciador);

        partida.registrarPontoP2();
        partida.registrarPontoP2();
    }
}
