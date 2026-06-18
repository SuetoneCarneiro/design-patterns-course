package second_exam.facotory_method;

public class NotificadorEmail implements Notificador {
    public void notificar(String msg){
        System.out.println("[NotificadorEmail] Notificando por email: " + msg);
    }
}
