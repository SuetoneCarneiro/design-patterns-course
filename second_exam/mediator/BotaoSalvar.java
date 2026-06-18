package second_exam.mediator;

class BotaoSalvar extends Componente {
    public boolean habilitado = false;

    public void habilitar() {
        this.habilitado = true;
        System.out.println("-> Botão Salvar foi HABILITADO.");
    }
    
    public void clicar() {
        if (habilitado) {
            System.out.println("-> Preferências de LGPD salvas com sucesso no banco!");
        } else {
            System.out.println("-> [Erro] O botão salvar está desabilitado.");
        }
    }
}
