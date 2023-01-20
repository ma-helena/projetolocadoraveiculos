package projetolocadoraveiculos.view.veiculo;

import projetolocadoraveiculos.business.GerenciadorDeVeiculo;
import projetolocadoraveiculos.view.veiculo.MenuListarTodosVeiculos;
import projetolocadoraveiculos.view.MenuComSubmenus;
import projetolocadoraveiculos.view.MenuFactory;
import projetolocadoraveiculos.view.Menu;

public class MenuVeiculosFactory implements MenuFactory {
    
    private final GerenciadorDeVeiculo gerenciadorDeVeiculo;
    
    public MenuVeiculosFactory(GerenciadorDeVeiculo gerenciadorDeVeiculo) {
        this.gerenciadorDeVeiculo = gerenciadorDeVeiculo;
    }

    @Override
    public Menu create() {
        MenuComSubmenus menuVeiculos = new MenuComSubmenus("Menu Veiculos");

        Menu menuAdicionarVeiculo = new MenuAdicionarVeiculo(gerenciadorDeVeiculo);
        menuVeiculos.adicionarSubmenu(menuAdicionarVeiculo);

        Menu menuBuscarVeiculoPelaPlaca = new MenuBuscarVeiculoPelaPlaca(gerenciadorDeVeiculo);
        menuVeiculos.adicionarSubmenu(menuBuscarVeiculoPelaPlaca);

        Menu menuListarTodosVeiculos = new MenuListarTodosVeiculos(gerenciadorDeVeiculo);
        menuVeiculos.adicionarSubmenu(menuListarTodosVeiculos);
            
        Menu menuBuscarVeiculoPorNome = new MenuBuscarVeiculoPorNome(gerenciadorDeVeiculo);
        menuVeiculos.adicionarSubmenu(menuBuscarVeiculoPorNome);

        Menu menuAlterarVeiculo = new MenuAlterarVeiculo(gerenciadorDeVeiculo);
        menuVeiculos.adicionarSubmenu(menuAlterarVeiculo);

        return menuVeiculos;
    }
}
