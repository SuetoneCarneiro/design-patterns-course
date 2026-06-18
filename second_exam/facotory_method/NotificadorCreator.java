package second_exam.facotory_method;

public abstract class NotificadorCreator {
    // esse é o factory method
    protected abstract Notificador criarNotificador();

    public void processarNotificacao(String msg){
        Notificador notificador = criarNotificador();
        notificador.notificar(msg);
    }
}
