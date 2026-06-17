package second_exam.observer;

public class PainelPlacar implements Observer {
    public void update(int pontuacaoJogador1, int pontuacaoJogador2) {
        System.out.println("[UI] Atualizando placar na tela: " + pontuacaoJogador1 + " x " + pontuacaoJogador2);
    }
    
}
