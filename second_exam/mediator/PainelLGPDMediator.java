package second_exam.mediator;

public class PainelLGPDMediator implements Mediator {
    private CheckBoxAceitarTodos checkBoxAceitarTodos;
    private CheckboxMarketing checkMarketing;
    private BotaoSalvar btnSalvar;

    public void registrarComponentes(CheckBoxAceitarTodos checkBoxAceitarTodos, BotaoSalvar btnSalvar, CheckboxMarketing checkMarketing) {
        this.checkMarketing = checkMarketing;
        this.checkBoxAceitarTodos = checkBoxAceitarTodos;
        this.btnSalvar = btnSalvar;
        this.checkBoxAceitarTodos.setMediator(this);
        this.checkMarketing.setMediator(this);
}

    @Override
    public void notificar(Componente remetente, String evento) {
        if (remetente == checkBoxAceitarTodos && evento.equals("clicar")) {
            System.out.println("Mediator: CheckBoxAceitarTodos foi clicado.");
            btnSalvar.habilitar();
        }

        if (remetente == checkMarketing && evento.equals("toggle")) {
            // Se desmarcou marketing, obviamente "Aceitar Todos" tem que desmarcar também
            if (!checkMarketing.marcado) {
                checkBoxAceitarTodos.forcarEstado(false);
                System.out.println("   [Mediator] Desmarcando 'Aceitar Todos' porque um item individual foi desmarcado.");
            }
            btnSalvar.habilitar();
        }
    }
}
