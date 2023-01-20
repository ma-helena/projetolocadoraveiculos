package projetolocadoraveiculos.view.cliente;

import projetolocadoraveiculos.business.GerenciadorDeCliente;
import projetolocadoraveiculos.view.Menu;
import projetolocadoraveiculos.view.MenuComSubmenus;
import projetolocadoraveiculos.view.MenuFactory;

public class MenuClientesFactory implements MenuFactory {
    private final GerenciadorDeCliente gerenciadorDeCliente;

    public MenuClientesFactory(GerenciadorDeCliente gerenciadorDeCliente) {
        this.gerenciadorDeCliente = gerenciadorDeCliente;
    }

    @Override
    public Menu create() {
        MenuComSubmenus menuClientes = new MenuComSubmenus("Menu Clientes");

        Menu menuAdicionarCliente = new MenuAdicionarCliente(gerenciadorDeCliente);
        menuClientes.adicionarSubmenu(menuAdicionarCliente);

        Menu menuBuscarClientePorNome = new MenuBuscarClientePorNome(gerenciadorDeCliente);
        menuClientes.adicionarSubmenu(menuBuscarClientePorNome);

        Menu menuListarClientes = new MenuListarTodosClientes(gerenciadorDeCliente);
        menuClientes.adicionarSubmenu(menuListarClientes);

        Menu menuAlterarCliente = new MenuAlterarCliente(gerenciadorDeCliente);
        menuClientes.adicionarSubmenu(menuAlterarCliente);

        return menuClientes;
    }
}
