package projetolocadoraveiculos.view;

public class MenuSaida extends MenuAbstrato {
    public MenuSaida() {
        super("Sair");
    }

    @Override
    protected void acao() {
        System.out.println("Encerrando o programa...");
        System.exit(0);
    }
}