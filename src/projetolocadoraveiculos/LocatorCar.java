package projetolocadoraveiculos;

<<<<<<< Updated upstream
import projetolocadoraveiculos.business.*;
import projetolocadoraveiculos.model.Agencia;
=======
import java.math.BigDecimal;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.business.GerenciadorDeAluguel;
import projetolocadoraveiculos.business.GerenciadorDeCliente;
import projetolocadoraveiculos.business.GerenciadorDeVeiculo;
import projetolocadoraveiculos.business.GerenciadorTipoCliente;
import projetolocadoraveiculos.business.GerenciadorTipoVeiculo;
import projetolocadoraveiculos.persistence.AgenciaEmMemoriaRepository;
import projetolocadoraveiculos.persistence.AgenciaRepository;
>>>>>>> Stashed changes
import projetolocadoraveiculos.persistence.*;
import projetolocadoraveiculos.view.Menu;
import projetolocadoraveiculos.view.MenuGeralFactory;
import projetolocadoraveiculos.view.agencia.MenuAgenciasFactory;
<<<<<<< Updated upstream
import projetolocadoraveiculos.view.cliente.MenuClientesFactory;
import projetolocadoraveiculos.view.veiculo.MenuVeiculosFactory;

import java.math.BigDecimal;
=======
import projetolocadoraveiculos.view.aluguel.MenuAluguelFactory;
import projetolocadoraveiculos.view.cliente.MenuClientesFactory;
import projetolocadoraveiculos.view.veiculo.MenuVeiculosFactory;
>>>>>>> Stashed changes

//incompleto - precisa ser trabalhado
public class LocatorCar {

    public static void main(String[] args) {

        AgenciaRepository agenciaRepository = new AgenciaEmMemoriaRepository();
<<<<<<< Updated upstream
=======
        AluguelRepository aluguelRepository = new AluguelEmMemoriaRepository();
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream

        MenuAgenciasFactory menuAgenciasFactory = new MenuAgenciasFactory(gerenciadorDeAgencia);
        MenuClientesFactory menuClientesFactory = new MenuClientesFactory(gerenciadorDeCliente, gerenciadorTipoCliente);
        MenuVeiculosFactory menuVeiculosFactory = new MenuVeiculosFactory(gerenciadorDeVeiculo, gerenciadorTipoVeiculo);

        Menu menuGeral = new MenuGeralFactory(menuAgenciasFactory, menuClientesFactory, menuVeiculosFactory).create();
=======


//        Agencia agencia = gerenciadorDeAgencia.criarAgencia("Ag1", "Jp");

        MenuAgenciasFactory menuAgenciasFactory = new MenuAgenciasFactory(gerenciadorDeAgencia);
        MenuAluguelFactory menuAluguelFactory = new MenuAluguelFactory(gerenciadorDeAluguel, gerenciadorDeAgencia);
        MenuClientesFactory menuClientesFactory = new MenuClientesFactory(gerenciadorDeCliente, gerenciadorTipoCliente);
        MenuVeiculosFactory menuVeiculosFactory = new MenuVeiculosFactory(gerenciadorDeVeiculo, gerenciadorTipoVeiculo);

        Menu menuGeral = new MenuGeralFactory(menuAgenciasFactory, menuAluguelFactory).create();
>>>>>>> Stashed changes
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
