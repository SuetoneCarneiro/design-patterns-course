package second_exam.observer;

public class GerenciadorDeEfeitos implements Observer {
    public void update(int pontosJogador1, int pontosJogador2) {
        System.out.println("[Áudio] Tocando som de 'Bip' de pontuação.");
    }
    
}
