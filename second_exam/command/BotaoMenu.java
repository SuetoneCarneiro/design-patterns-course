package second_exam.command;

public class BotaoMenu {
    private Comando comando;
    private String nomeBtn;

    public BotaoMenu(String nomeBtn){
        this.nomeBtn = nomeBtn;
    }

    public void setComando(Comando comando){
        this.comando = comando;
    }

    public void clicar(){
        System.out.println("\nBotão clicado: " + nomeBtn);
        if (comando != null) {
            comando.executar();
        } else {
            System.out.println("Nenhum comando associado a este botão.");
        }
    }
}
