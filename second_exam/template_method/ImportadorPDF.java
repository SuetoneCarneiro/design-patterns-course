package second_exam.template_method;

public class ImportadorPDF extends ImportadorDeCatalogos {
    protected void extrair() {
        System.out.println("#2 - [Importador PDF] Extraindo dados do arquivo PDF...");
    }
}
