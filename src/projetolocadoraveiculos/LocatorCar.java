package projetolocadoraveiculos;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.business.GerenciadorDeAluguel;
import projetolocadoraveiculos.persistence.AgenciaEmMemoriaRepository;
import projetolocadoraveiculos.persistence.AgenciaRepository;
import projetolocadoraveiculos.persistence.*;
import projetolocadoraveiculos.view.Menu;
import projetolocadoraveiculos.view.MenuGeralFactory;
import projetolocadoraveiculos.view.agencia.MenuAgenciasFactory;
import projetolocadoraveiculos.view.aluguel.MenuAluguelFactory;

//incompleto - precisa ser trabalhado
public class LocatorCar {
    public static void main(String[] args) {
        AgenciaRepository agenciaRepository = new AgenciaEmMemoriaRepository();
        AluguelRepository aluguelRepository = new AluguelEmMemoriaRepository();
        GerenciadorDeAgencia gerenciadorDeAgencia = new GerenciadorDeAgencia(agenciaRepository);
        GerenciadorDeAluguel gerenciadorDeAluguel = new GerenciadorDeAluguel(aluguelRepository, agenciaRepository);

//        Agencia agencia = gerenciadorDeAgencia.criarAgencia("Ag1", "Jp");

        MenuAgenciasFactory menuAgenciasFactory = new MenuAgenciasFactory(gerenciadorDeAgencia);
        MenuAluguelFactory menuAluguelFactory = new MenuAluguelFactory(gerenciadorDeAluguel, gerenciadorDeAgencia);
        Menu menuGeral = new MenuGeralFactory(menuAgenciasFactory, menuAluguelFactory).create();
        menuGeral.agir();


    }
}
