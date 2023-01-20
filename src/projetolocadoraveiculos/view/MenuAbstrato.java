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
<<<<<<< Updated upstream


    }

    protected  void acao() {
    }
=======
    }

    protected abstract void acao();
>>>>>>> Stashed changes

    private void exibirComSeparador() {
        exibir();
        exibirComSeparador();
    }

<<<<<<< Updated upstream
   private void exibirSeparador(){
       System.out.println("xxxxxxxxxxxxxx");
   }
=======
    private void exibirSeparador() {
        System.out.println("------------------------------------------");
    }
>>>>>>> Stashed changes
}
