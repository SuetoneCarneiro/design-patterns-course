package second_exam.mediator;

public class CheckBoxAceitarTodos extends Componente {
    public boolean marcado = false;

    public void clicar(){
        marcado = !marcado;
        System.out.println("CheckBoxAceitarTodos: " + (marcado ? "Marcado" : "Desmarcado"));
        mediator.notificar(this, "clicar");
    }

    public void forcarEstado(boolean estado){
        this.marcado = estado;
    }
}
