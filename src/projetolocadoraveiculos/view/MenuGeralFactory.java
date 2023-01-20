package projetolocadoraveiculos.view;

import projetolocadoraveiculos.view.agencia.MenuAgenciasFactory;
import projetolocadoraveiculos.view.aluguel.MenuAluguelFactory;

public class MenuGeralFactory implements MenuFactory {
    private final MenuAgenciasFactory  menuAgenciasFactory;
    private final MenuAluguelFactory menuAluguelFactory;
    public MenuGeralFactory(MenuAgenciasFactory menuAgenciasFactory, MenuAluguelFactory menuAluguelFactory) {
        this.menuAgenciasFactory = menuAgenciasFactory;
        this.menuAluguelFactory = menuAluguelFactory;
    }

    @Override
    public Menu create() {
        MenuComSubmenus menuGeral = new MenuGeral("LocatorCar - Locadora de veiculos");

        Menu menuAgencias = menuAgenciasFactory.create();
        menuGeral.adicionarSubmenu(menuAgencias);

        Menu menuClientes = new MenuComSubmenus("Menu Clientes");
        menuGeral.adicionarSubmenu(menuClientes);

        Menu menuAluguel = menuAluguelFactory.create();
        menuGeral.adicionarSubmenu(menuAluguel);

        Menu menuSair = new MenuSaida();
        menuGeral.adicionarSubmenu(menuSair);
        return menuGeral ;
    }
}
