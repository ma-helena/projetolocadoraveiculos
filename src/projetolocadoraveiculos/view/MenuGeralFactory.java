package projetolocadoraveiculos.view;

import projetolocadoraveiculos.view.agencia.MenuAgenciasFactory;
import projetolocadoraveiculos.view.cliente.MenuClientesFactory;
import projetolocadoraveiculos.view.veiculo.MenuVeiculosFactory;

public class MenuGeralFactory implements MenuFactory {
    private final MenuAgenciasFactory menuAgenciasFactory;
    private final MenuClientesFactory menuClientesFactory;
    private final MenuVeiculosFactory menuVeiculosFactory;

    public MenuGeralFactory(MenuAgenciasFactory menuAgenciasFactory, MenuClientesFactory menuClientesFactory, MenuVeiculosFactory menuVeiculosFactory) {
        this.menuAgenciasFactory = menuAgenciasFactory;
        this.menuClientesFactory = menuClientesFactory;
        this.menuVeiculosFactory = menuVeiculosFactory;
    }

    @Override
    public Menu create() {
        MenuComSubmenus menuGeral = new MenuGeral("LocateCar - Locadora de veiculos");

        Menu menuAgencias = menuAgenciasFactory.create();
        menuGeral.adicionarSubmenu(menuAgencias);

        Menu menuClientes = menuClientesFactory.create();
        menuGeral.adicionarSubmenu(menuClientes);
<<<<<<< Updated upstream
        return menuGeral ;
=======

        Menu menuVeiculos = menuVeiculosFactory.create();
        menuGeral.adicionarSubmenu(menuVeiculos);

        Menu menuSair = new MenuSaida();
        menuGeral.adicionarSubmenu(menuSair);

        return menuGeral;
>>>>>>> Stashed changes
    }
}
