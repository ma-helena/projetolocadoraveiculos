package projetolocadoraveiculos.view;

import projetolocadoraveiculos.view.agencia.MenuAgenciasFactory;
import projetolocadoraveiculos.view.aluguel.MenuAluguelFactory;
import projetolocadoraveiculos.view.cliente.MenuClientesFactory;

public class MenuGeralFactory implements MenuFactory {
    private final MenuAgenciasFactory  menuAgenciasFactory;
    private final MenuAluguelFactory menuAluguelFactory;
    private final MenuClientesFactory menuClientesFactory;
    public MenuGeralFactory(
            MenuAgenciasFactory menuAgenciasFactory,
            MenuAluguelFactory menuAluguelFactory,
            MenuClientesFactory menuClientesFactory
    ) {
        this.menuAgenciasFactory = menuAgenciasFactory;
        this.menuAluguelFactory = menuAluguelFactory;
        this.menuClientesFactory = menuClientesFactory;
    }

    @Override
    public Menu create() {
        MenuComSubmenus menuGeral = new MenuGeral("LocatorCar - Locadora de veiculos");

        Menu menuAgencias = menuAgenciasFactory.create();
        menuGeral.adicionarSubmenu(menuAgencias);

        Menu menuClientes = menuClientesFactory.create();
        menuGeral.adicionarSubmenu(menuClientes);

        Menu menuAluguel = menuAluguelFactory.create();
        menuGeral.adicionarSubmenu(menuAluguel);

        Menu menuSair = new MenuSaida();
        menuGeral.adicionarSubmenu(menuSair);

        return menuGeral ;
    }
}
