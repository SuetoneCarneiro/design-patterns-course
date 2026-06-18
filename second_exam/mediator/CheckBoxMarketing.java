package second_exam.mediator;

class CheckboxMarketing extends Componente {
    public boolean marcado = false;

    public void clicar() {
        marcado = !marcado;
        System.out.println("[UI] Usuário clicou em 'Marketing'. Novo estado: " + marcado);
        if(mediator != null) mediator.notificar(this, "clicar");
    }

    public void forcarEstado(boolean estado) {
        this.marcado = estado;
    }
}
