package second_exam.command;

public class ComandoDownloadCV implements Comando {
    private ServicoGeracaoPDF servicoGeracaoPDF;
    
    public ComandoDownloadCV(ServicoGeracaoPDF servicoGeracaoPDF){
        this.servicoGeracaoPDF = servicoGeracaoPDF;
    }   

    public void executar() {
        System.out.println("[Comando Download CV] Executando comando: download do CV");
        servicoGeracaoPDF.gerarPdfATS();
    }
}
