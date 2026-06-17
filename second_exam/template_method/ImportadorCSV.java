package second_exam.template_method;

public class ImportadorCSV extends ImportadorDeCatalogos{
    protected void extrair() {
        System.out.println("#2 - [Importador CSV] Extraindo dados do arquivo CSV...");
    }
}
