package second_exam.facotory_method;

public class NotificadorWhatsapp implements Notificador {
    
    public void notificar(String msg){
        System.out.println("[NotificadorWhatsapp] Notificando por WhatsApp: " + msg);
    }
}
