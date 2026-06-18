package second_exam.facotory_method;

public class WhatsappCreator extends NotificadorCreator {

    protected Notificador criarNotificador(){
        System.out.println("[WhatsappCreator] Criando notificador de WhatsApp...");
        return new NotificadorWhatsapp();
    }
}
