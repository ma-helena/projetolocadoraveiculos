package projetolocadoraveiculos.view;

import projetolocadoraveiculos.view.agencia.MenuAgenciasFactory;
import projetolocadoraveiculos.view.aluguel.MenuAluguelFactory;
import projetolocadoraveiculos.view.veiculo.MenuVeiculosFactory;

public class MenuGeralFactory implements MenuFactory {
    private final MenuAgenciasFactory  menuAgenciasFactory;
    private final MenuAluguelFactory menuAluguelFactory;
    private final MenuVeiculosFactory menuVeiculosFactory;
    public MenuGeralFactory(MenuAgenciasFactory menuAgenciasFactory, MenuAluguelFactory menuAluguelFactory, MenuVeiculosFactory menuVeiculosFactory) {
        this.menuAgenciasFactory = menuAgenciasFactory;
        this.menuAluguelFactory = menuAluguelFactory;
        this.menuVeiculosFactory = menuVeiculosFactory;
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

        Menu menuVeiculos = menuVeiculosFactory.create();
        menuGeral.adicionarSubmenu(menuVeiculos);

        Menu menuSair = new MenuSaida();
        menuGeral.adicionarSubmenu(menuSair);
        return menuGeral ;
    }
}
