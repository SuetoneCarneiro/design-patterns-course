package second_exam.mediator;

public class Main {
    public static void main(String[] args) {
        PainelLGPDMediator mediator = new PainelLGPDMediator();

        CheckBoxAceitarTodos checkBoxAceitarTodos = new CheckBoxAceitarTodos();
        BotaoSalvar btnSalvar = new BotaoSalvar();
        CheckboxMarketing checkMarketing = new CheckboxMarketing();

        mediator.registrarComponentes(checkBoxAceitarTodos, btnSalvar, checkMarketing);

        // Simulando o clique no checkbox
        System.out.println("Simulando clique no CheckBoxAceitarTodos...");
        checkBoxAceitarTodos.clicar();

    }
}
