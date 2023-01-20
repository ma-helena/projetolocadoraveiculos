package projetolocadoraveiculos.view.aluguel;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.business.GerenciadorDeAluguel;
import projetolocadoraveiculos.business.GerenciadorDeCliente;
import projetolocadoraveiculos.business.GerenciadorDeVeiculo;
import projetolocadoraveiculos.view.Menu;
import projetolocadoraveiculos.view.MenuComSubmenus;
import projetolocadoraveiculos.view.MenuFactory;

public class MenuAluguelFactory implements MenuFactory {

    private final GerenciadorDeAluguel gerenciadorDeAluguel;

    private final GerenciadorDeAgencia gerenciadorDeAgencia;

    private final GerenciadorDeCliente gerenciadorDeCliente;

    private final GerenciadorDeVeiculo gerenciadorDeVeiculo;

    public MenuAluguelFactory(GerenciadorDeAluguel gerenciadorDeAluguel, GerenciadorDeAgencia gerenciadorDeAgencia, GerenciadorDeCliente gerenciadorDeCliente, GerenciadorDeVeiculo gerenciadorDeVeiculo) {
        this.gerenciadorDeAluguel = gerenciadorDeAluguel;
        this.gerenciadorDeAgencia = gerenciadorDeAgencia;
        this.gerenciadorDeCliente = gerenciadorDeCliente;
        this.gerenciadorDeVeiculo = gerenciadorDeVeiculo;
    }

    @Override
    public Menu create() {
        MenuComSubmenus menuAluguel = new MenuComSubmenus("Menu Aluguel");

        Menu menuNovoAluguel = new MenuNovoAluguel("Novo aluguel" ,gerenciadorDeAluguel, gerenciadorDeAgencia, gerenciadorDeCliente, gerenciadorDeVeiculo);
        menuAluguel.adicionarSubmenu(menuNovoAluguel);

        Menu menuListarAlugueis = new MenuListarAlugueis("Lista de Alugueis", gerenciadorDeAluguel);
        menuAluguel.adicionarSubmenu(menuListarAlugueis);

        Menu menuDevolverVeiculo = new MenuDevolverVeiculo("Devolução de Veículo", gerenciadorDeAluguel, gerenciadorDeVeiculo);
        menuAluguel.adicionarSubmenu(menuDevolverVeiculo);

        return menuAluguel;
    }
}
