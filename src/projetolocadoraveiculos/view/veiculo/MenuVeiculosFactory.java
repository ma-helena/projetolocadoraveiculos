package projetolocadoraveiculos.view.veiculo;

import projetolocadoraveiculos.business.GerenciadorDeVeiculo;
import projetolocadoraveiculos.business.GerenciadorTipoVeiculo;
import projetolocadoraveiculos.view.MenuComSubmenus;
import projetolocadoraveiculos.view.MenuFactory;
import projetolocadoraveiculos.view.Menu;

public class MenuVeiculosFactory implements MenuFactory {
    
        private final GerenciadorDeVeiculo gerenciadorDeVeiculo;
        private final GerenciadorTipoVeiculo gerenciadorTipoVeiculo;

        public MenuVeiculosFactory(GerenciadorDeVeiculo gerenciadorDeVeiculo, GerenciadorTipoVeiculo gerenciadorTipoVeiculo) {
            this.gerenciadorDeVeiculo = gerenciadorDeVeiculo;
            this.gerenciadorTipoVeiculo = gerenciadorTipoVeiculo;
        }

        @Override
        public Menu create() {
            MenuComSubmenus menuVeiculos = new MenuComSubmenus("Menu Veiculos");

            Menu menuAdicionarVeiculo = new MenuAdicionarVeiculo(gerenciadorDeVeiculo, gerenciadorTipoVeiculo);
            menuVeiculos.adicionarSubmenu(menuAdicionarVeiculo);

            Menu menuBuscarVeiculoPeloNome = new MenuBuscarVeiculoPelaPlaca(gerenciadorDeVeiculo);
            menuVeiculos.adicionarSubmenu(menuBuscarVeiculoPeloNome);

            return menuVeiculos;
        }
}
