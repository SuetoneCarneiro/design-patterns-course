package second_exam.template_method;

public abstract class ImportadorDeCatalogos {
    public final void importarCatalogo(String caminho){
        System.out.println("\n[Importador abstrato] Iniciando importação de: " + caminho);
        abrirArquivo(caminho);
        extrair();
        validarArquivo();
        salvarArquivo();
        System.out.println("[Importador abstrato] Importação finalizada com sucesso!\n");
    }
    protected void abrirArquivo(String caminho){
        System.out.println("#1 - Abrindo arquivo em: " + caminho);
    }

    protected abstract void extrair();

    protected void validarArquivo(){
        System.out.println("#3 - Validando dados extraídos...");
    }

    protected void salvarArquivo(){
        System.out.println("#4 - Salvando dados no banco de dados...");
    }
}
