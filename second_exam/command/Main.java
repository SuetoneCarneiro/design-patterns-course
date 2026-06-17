package second_exam.command;

public class Main {
    public static void main(String[] args) {
        // instanciado receivers
        GerenciadorDeTema receiverTema = new GerenciadorDeTema();
        ServicoGeracaoPDF receiverPDF = new ServicoGeracaoPDF();

        // instanciado comandos
        Comando comandoDarkMode = new ComandoDarkMode(receiverTema);
        Comando comandoDownloadCV = new ComandoDownloadCV(receiverPDF);

        // instanciando botaoMenu que é o invoker
        BotaoMenu darkMode = new BotaoMenu("Dark Mode");
        BotaoMenu downloadCV = new BotaoMenu("Download CV");

        // associando os comandos aos botões
        darkMode.setComando(comandoDarkMode);
        downloadCV.setComando(comandoDownloadCV);   

        // simulação dos clicks
        darkMode.clicar();
        downloadCV.clicar();
        System.out.println("");
    }
}
