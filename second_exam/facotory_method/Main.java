package second_exam.facotory_method;

public class Main {
    public static void main(String[] args){
        ServicoDeVistoria servico = new ServicoDeVistoria();

        NotificadorCreator criadorEmail = new EmailCreator();
        System.out.println("");
        servico.confirmarAgendamento(criadorEmail, "João Grilo");
        System.out.println("");

        NotificadorCreator criadorWhatsapp = new WhatsappCreator();
        System.out.println("");
        servico.confirmarAgendamento(criadorWhatsapp, "Chicó");
        System.out.println("");
        
    }
}
