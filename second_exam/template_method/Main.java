package second_exam.template_method;

public class Main {
    public static void main(String[] args){
        System.out.println("--- Importação de catálogo PDF ---");
        ImportadorDeCatalogos importadorPDF = new ImportadorPDF();
        importadorPDF.importarCatalogo("/caminho/para/arquivo.pdf");

        System.out.println("--- Importação de catálogo XML ---");
        ImportadorDeCatalogos importadorXML = new ImportadorXML();
        importadorXML.importarCatalogo("/caminho/para/arquivo.xml");

        System.out.println("--- Importação de catálogo CSV ---");
        ImportadorDeCatalogos importadorCSV = new ImportadorCSV();
        importadorCSV.importarCatalogo("/caminho/para/arquivo.csv");
    }
}
