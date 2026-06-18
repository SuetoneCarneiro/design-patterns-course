package second_exam.facotory_method;

public class ServicoDeVistoria {
    public void confirmarAgendamento(NotificadorCreator criadorEscolhido, String nomeCliente){
        System.out.println("[ServicoDeVistoria] -> Finalizando agendamento...");
        String msgPadrao = "Olá " + nomeCliente + "! Sua vistoria na LC Vistoria foi confirmada. Obrigado por escolher nossos serviços!";
        criadorEscolhido.processarNotificacao(msgPadrao); 
    }
}
