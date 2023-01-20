package projetolocadoraveiculos;

import projetolocadoraveiculos.business.*;
import projetolocadoraveiculos.model.Agencia;
import projetolocadoraveiculos.persistence.*;
import projetolocadoraveiculos.view.Menu;
import projetolocadoraveiculos.view.MenuGeralFactory;
import projetolocadoraveiculos.view.agencia.MenuAgenciasFactory;
import projetolocadoraveiculos.view.cliente.MenuClientesFactory;
import projetolocadoraveiculos.view.veiculo.MenuVeiculosFactory;

import java.math.BigDecimal;

//incompleto - precisa ser trabalhado
public class LocatorCar {

    public static void main(String[] args) {

        AgenciaRepository agenciaRepository = new AgenciaEmMemoriaRepository();
        ClienteRepository clienteRepository = new ClienteEmMemoriaRepository();
        VeiculoRepository veiculoRepository = new VeiculoEmMemoriaRepository();

        GerenciadorDeAgencia gerenciadorDeAgencia = new GerenciadorDeAgencia(agenciaRepository);
        Agencia agencia = gerenciadorDeAgencia.criarAgencia("AG1", "Maringá");
//        System.out.println("Nova agência criada");
//        System.out.println(agencia);

        GerenciadorDeCliente gerenciadorDeCliente = new GerenciadorDeCliente(clienteRepository);
        GerenciadorDeVeiculo gerenciadorDeVeiculo = new GerenciadorDeVeiculo(veiculoRepository);

        GerenciadorTipoCliente gerenciadorTipoCliente = inicializarGerenciadorTipoCliente();
        GerenciadorTipoVeiculo gerenciadorTipoVeiculo = inicializarGerenciadorTipoVeiculo();

        MenuAgenciasFactory menuAgenciasFactory = new MenuAgenciasFactory(gerenciadorDeAgencia);
        MenuClientesFactory menuClientesFactory = new MenuClientesFactory(gerenciadorDeCliente, gerenciadorTipoCliente);
        MenuVeiculosFactory menuVeiculosFactory = new MenuVeiculosFactory(gerenciadorDeVeiculo, gerenciadorTipoVeiculo);

        Menu menuGeral = new MenuGeralFactory(menuAgenciasFactory, menuClientesFactory, menuVeiculosFactory).create();
        menuGeral.agir();

    }

    private static GerenciadorTipoCliente inicializarGerenciadorTipoCliente() {
        TipoClienteRepository tipoClienteRepository = new TipoClienteEmMemoriaRepository();
        GerenciadorTipoCliente gerenciadorTipoCliente = new GerenciadorTipoCliente(tipoClienteRepository);
        gerenciadorTipoCliente.adicionarTipoCliente("PF", BigDecimal.valueOf(5), 5);
        gerenciadorTipoCliente.adicionarTipoCliente("PJ", BigDecimal.valueOf(10), 3);
        return gerenciadorTipoCliente;
    }
    private static GerenciadorTipoVeiculo inicializarGerenciadorTipoVeiculo() {
        TipoVeiculoRepository tipoVeiculoRepository = new TipoVeiculoEmMemoriaRepository();
        GerenciadorTipoVeiculo gerenciadorTipoVeiculo = new GerenciadorTipoVeiculo(tipoVeiculoRepository);
        gerenciadorTipoVeiculo.adicionarTipoVeiculo("Tipo 1 - Moto 200,00", BigDecimal.valueOf(200));
        gerenciadorTipoVeiculo.adicionarTipoVeiculo("Tipo 2 - Carro 150,00", BigDecimal.valueOf(200));
        //gerenciadorTipoVeiculo.adicionarTipoVeiculo("Tipo 3 - Caminhão - 200,00", BigDecimal.valueOf(200));
        return gerenciadorTipoVeiculo;
    }
}
