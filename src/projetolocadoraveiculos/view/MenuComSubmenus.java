package projetolocadoraveiculos.view;

import java.util.*;

import static java.awt.SystemColor.menu;

public class MenuComSubmenus extends MenuAbstrato {
    private Map<String,Menu> submenus = new HashMap<>();

    public MenuComSubmenus(String descricao) {
        super(descricao);
    }

    protected void acao(){
        exibirSubmenus();;
        Menu menu  = selecionarSubmenu();
        menu.agir();
    }

    public void exibirSubmenus(){
        for (int i = 0; i < submenus.size() ; i++) {
            System.out.printf("%s. ", i);
            Menu menu = submenus.get(String.valueOf(i));
            menu.exibir();
            
        }
    }

    private Menu selecionarSubmenu(){
        String menuSelecionado = CapturadorDeEntrada.capturarString("menu");
        Menu menu = submenus.get(menuSelecionado);
        while ((menu == null)){
            System.out.println("Menu informado é inválido, selecione um outro menu".formatted(menuSelecionado));
            menuSelecionado = CapturadorDeEntrada.capturarString("menu");
            menu = submenus.get(menuSelecionado);

        }

        return menu;

    }

    public void adicionarSubmenu(Menu menu){

        submenus.put(String.valueOf(submenus.size()), menu);
    }

    private void exibirComSeparador(){
        exibirComSepador();
        exibir();
        exibirComSepador();
    }

    private void exibirComSepador(){

        System.out.printf("xxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
