package second_exam.command;

public class ComandoDarkMode implements Comando{
    private GerenciadorDeTema gerenciadorDeTema;

    public ComandoDarkMode(GerenciadorDeTema gerenciadorDeTema){
        this.gerenciadorDeTema = gerenciadorDeTema;
    }

    public void executar(){
        System.out.println("[Comando Dark Mode] Executando comando: ativar Dark Mode");
        gerenciadorDeTema.ativarDarkMode();
    }
}
