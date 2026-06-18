package second_exam.facotory_method;

public class EmailCreator extends NotificadorCreator {

    protected Notificador criarNotificador(){
        System.out.println("[EmailCreator] Criando notificador de email...");
        return new NotificadorEmail();
    }
}
