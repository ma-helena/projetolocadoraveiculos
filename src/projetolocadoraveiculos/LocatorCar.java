package projetolocadoraveiculos;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.business.GerenciadorDeAluguel;
import projetolocadoraveiculos.business.GerenciadorDeCliente;
import projetolocadoraveiculos.persistence.AgenciaEmMemoriaRepository;
import projetolocadoraveiculos.persistence.AgenciaRepository;
import projetolocadoraveiculos.persistence.*;
import projetolocadoraveiculos.view.Menu;
import projetolocadoraveiculos.view.MenuGeralFactory;
import projetolocadoraveiculos.view.agencia.MenuAgenciasFactory;
import projetolocadoraveiculos.view.aluguel.MenuAluguelFactory;
import projetolocadoraveiculos.view.cliente.MenuClientesFactory;

public class LocatorCar {
    public static void main(String[] args) {
        AgenciaRepository agenciaRepository = new AgenciaEmMemoriaRepository();
        AluguelRepository aluguelRepository = new AluguelEmMemoriaRepository();
        ClienteRepository clienteRepository = new ClienteEmMemoriaRepository();

        GerenciadorDeAgencia gerenciadorDeAgencia = new GerenciadorDeAgencia(agenciaRepository);
        GerenciadorDeAluguel gerenciadorDeAluguel = new GerenciadorDeAluguel(aluguelRepository, agenciaRepository);
        GerenciadorDeCliente gerenciadorDeCliente = new GerenciadorDeCliente(clienteRepository);

        MenuAgenciasFactory menuAgenciasFactory = new MenuAgenciasFactory(gerenciadorDeAgencia);
        MenuAluguelFactory menuAluguelFactory = new MenuAluguelFactory(gerenciadorDeAluguel, gerenciadorDeAgencia);
        MenuClientesFactory menuClientesFactory = new MenuClientesFactory(gerenciadorDeCliente);

        Menu menuGeral = new MenuGeralFactory(menuAgenciasFactory, menuAluguelFactory, menuClientesFactory).create();

        menuGeral.agir();
    }
}
