package projetolocadoraveiculos.view;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuAbstrato  implements Menu{

    private final String descricao;

    public MenuAbstrato(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public final void exibir() {
        System.out.println(descricao);
    }

    @Override
    public final void agir() {
        exibirComSeparador();
        acao();
    }

    protected abstract void acao();

    private void exibirComSeparador() {
        exibirSeparador();
        exibir();
        exibirSeparador();
    }

    private void exibirSeparador() {
        System.out.println("------------------------------------------");
    }
}
