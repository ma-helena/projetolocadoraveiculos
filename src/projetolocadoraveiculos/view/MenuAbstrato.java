package projetolocadoraveiculos.view;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuAbstrato  implements Menu{
    private final String descricao;




    public MenuAbstrato(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibir() {
        System.out.println(descricao);

    }

    @Override
    public  void agir() {


    }
}
