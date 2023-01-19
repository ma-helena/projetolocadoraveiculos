package projetolocadoraveiculos.view.agencia;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.view.Menu;
import projetolocadoraveiculos.view.MenuComSubmenus;
import projetolocadoraveiculos.view.MenuFactory;

public class MenuAgenciasFactory implements MenuFactory {
    private final GerenciadorDeAgencia gerenciadorDeAgencia;

    public MenuAgenciasFactory(GerenciadorDeAgencia gerenciadorDeAgencia) {
        this.gerenciadorDeAgencia = gerenciadorDeAgencia;
    }

    @Override
    public Menu create() {
        MenuComSubmenus menuAgencias = new MenuComSubmenus("Menu Agências");

        Menu menuAdicionarAgencia = new MenuAdicionarAgencia (gerenciadorDeAgencia);
        menuAgencias.adicionarSubmenu(menuAdicionarAgencia);

        Menu menuBuscarAgenciaPorNome = new MenuBuscarAgenciaPorNome (gerenciadorDeAgencia);
        menuAgencias.adicionarSubmenu(menuBuscarAgenciaPorNome);

        Menu menuListarAgencia = new MenuListarAgencia (gerenciadorDeAgencia);
        menuAgencias.adicionarSubmenu(menuListarAgencia);


        return menuAgencias;
    }
}
