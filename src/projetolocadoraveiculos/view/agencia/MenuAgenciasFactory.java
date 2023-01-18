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
        MenuComSubmenus menuAgencias = new MenuComSubmenus("Menu aGÊNCIAS");
        Menu menuAdicionarAgencia = new MenuAdicionarAgencia (gerenciadorDeAgencia);
        menuAgencias.adicionarSubmenu(menuAdicionarAgencia);
        return menuAgencias;
    }
}
