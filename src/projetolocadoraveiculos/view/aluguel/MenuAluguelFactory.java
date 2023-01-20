package projetolocadoraveiculos.view.aluguel;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.business.GerenciadorDeAluguel;
import projetolocadoraveiculos.view.Menu;
import projetolocadoraveiculos.view.MenuComSubmenus;
import projetolocadoraveiculos.view.MenuFactory;
import projetolocadoraveiculos.view.agencia.MenuAdicionarAgencia;
import projetolocadoraveiculos.view.agencia.MenuAlterarAgencia;
import projetolocadoraveiculos.view.agencia.MenuBuscarAgenciaPorNome;
import projetolocadoraveiculos.view.agencia.MenuListarTodasAgencias;

public class MenuAluguelFactory implements MenuFactory {

    private final GerenciadorDeAluguel gerenciadorDeAluguel;

    private final GerenciadorDeAgencia gerenciadorDeAgencia;

    public MenuAluguelFactory(GerenciadorDeAluguel gerenciadorDeAluguel, GerenciadorDeAgencia gerenciadorDeAgencia) {
        this.gerenciadorDeAluguel = gerenciadorDeAluguel;
        this.gerenciadorDeAgencia = gerenciadorDeAgencia;
    }

    @Override
    public Menu create() {
        MenuComSubmenus menuAluguel = new MenuComSubmenus("Menu Aluguel");

        Menu menuNovoAluguel = new MenuNovoAluguel("Novo aluguel" ,gerenciadorDeAluguel, gerenciadorDeAgencia);
        menuAluguel.adicionarSubmenu(menuNovoAluguel);

        Menu menuListarAlugueis = new MenuListarAlugueis("Lista de Alugueis", gerenciadorDeAluguel);
        menuAluguel.adicionarSubmenu(menuListarAlugueis);

        //Menu menuBuscarAluguel = new MenuBuscarAgenciaPorNome(gerenciadorDeAluguel);
        //menuAluguel.adicionarSubmenu(menuBuscarAluguel);

        //Menu menuAlterarAluguel = new MenuAlterarAgencia(gerenciadorDeAluguel);
        //menuAluguel.adicionarSubmenu(menuAlterarAluguel);

        return menuAluguel;
    }
}
