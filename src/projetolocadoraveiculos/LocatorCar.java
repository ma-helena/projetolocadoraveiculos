package projetolocadoraveiculos;

import java.math.BigDecimal;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.business.GerenciadorDeAluguel;
import projetolocadoraveiculos.business.GerenciadorDeCliente;
import projetolocadoraveiculos.business.GerenciadorDeVeiculo;
import projetolocadoraveiculos.persistence.AgenciaEmMemoriaRepository;
import projetolocadoraveiculos.persistence.AgenciaRepository;
import projetolocadoraveiculos.persistence.*;
import projetolocadoraveiculos.view.Menu;
import projetolocadoraveiculos.view.MenuGeralFactory;
import projetolocadoraveiculos.view.agencia.MenuAgenciasFactory;
import projetolocadoraveiculos.view.aluguel.MenuAluguelFactory;
import projetolocadoraveiculos.view.cliente.MenuClientesFactory;
import projetolocadoraveiculos.view.veiculo.MenuVeiculosFactory;

public class LocatorCar {
    public static void main(String[] args) {

        AgenciaRepository agenciaRepository = new AgenciaEmMemoriaRepository();
        AluguelRepository aluguelRepository = new AluguelEmMemoriaRepository();
        ClienteRepository clienteRepository = new ClienteEmMemoriaRepository();
        VeiculoRepository veiculoRepository = new VeiculoEmMemoriaRepository();

        GerenciadorDeVeiculo gerenciadorDeVeiculo = new GerenciadorDeVeiculo(veiculoRepository); 
        GerenciadorDeAgencia gerenciadorDeAgencia = new GerenciadorDeAgencia(agenciaRepository);
        GerenciadorDeAluguel gerenciadorDeAluguel = new GerenciadorDeAluguel(aluguelRepository, agenciaRepository);
        GerenciadorDeCliente gerenciadorDeCliente = new GerenciadorDeCliente(clienteRepository);

        MenuVeiculosFactory menuVeiculosFactory = new MenuVeiculosFactory(gerenciadorDeVeiculo);
        MenuAgenciasFactory menuAgenciasFactory = new MenuAgenciasFactory(gerenciadorDeAgencia);
        MenuAluguelFactory menuAluguelFactory = new MenuAluguelFactory(gerenciadorDeAluguel, gerenciadorDeAgencia);
        MenuClientesFactory menuClientesFactory = new MenuClientesFactory(gerenciadorDeCliente);

        Menu menuGeral = new MenuGeralFactory(
             menuAgenciasFactory, 
             menuAluguelFactory, 
             menuClientesFactory, 
             menuVeiculosFactory
        ).create();

        menuGeral.agir();
    }
}