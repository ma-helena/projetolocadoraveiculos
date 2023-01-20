package projetolocadoraveiculos.view.cliente;

import projetolocadoraveiculos.business.GerenciadorDeCliente;
import projetolocadoraveiculos.business.GerenciadorTipoCliente;
import projetolocadoraveiculos.view.MenuComSubmenus;
import projetolocadoraveiculos.view.MenuFactory;
import projetolocadoraveiculos.view.Menu;

import java.awt.*;

public class MenuClientesFactory implements MenuFactory {

    private final GerenciadorDeCliente gerenciadorDeCliente;
    private final GerenciadorTipoCliente gerenciadorTipoCliente;

    public MenuClientesFactory(GerenciadorDeCliente gerenciadorDeCliente, GerenciadorTipoCliente gerenciadorTipoCliente) {
        this.gerenciadorDeCliente = gerenciadorDeCliente;
        this.gerenciadorTipoCliente = gerenciadorTipoCliente;
    }

    @Override
    public Menu create() {
        MenuComSubmenus menuClientes = new MenuComSubmenus("Menu Clientes");

        Menu menuAdicionarCliente = new MenuAdicionarCliente(gerenciadorDeCliente, gerenciadorTipoCliente);
        menuClientes.adicionarSubmenu(menuAdicionarCliente);

        return menuClientes;
    }
}
