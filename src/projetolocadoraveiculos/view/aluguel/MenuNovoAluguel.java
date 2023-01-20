package projetolocadoraveiculos.view.aluguel;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.business.GerenciadorDeAluguel;
import projetolocadoraveiculos.model.*;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MenuNovoAluguel extends MenuAbstrato{


    private final GerenciadorDeAluguel gerenciadorDeAluguel;
    private final GerenciadorDeAgencia gerenciadorDeAgencia;

    public MenuNovoAluguel(String descricao, GerenciadorDeAluguel gerenciadorDeAluguel, GerenciadorDeAgencia gerenciadorDeAgencia) {
        super(descricao);
        this.gerenciadorDeAluguel = gerenciadorDeAluguel;
        this.gerenciadorDeAgencia = gerenciadorDeAgencia;
    }

    @Override
    public void acao() {
       String idCliente =  CapturadorDeEntrada.capturarString("Documento do cliente");
       //Cliente cliente = gerenciadorDeCliente.buscarPeloId(idCliente);
        TipoCliente tipoCliente = new TipoCliente("PF", BigDecimal.valueOf(5), 7);
        Cliente cliente = new Cliente("teste", "123", tipoCliente);
       String placa =  CapturadorDeEntrada.capturarString("Placa do veículo");
       // veiculo = gerenciadorDeVeiculo.buscarPeloId(placa);
       TipoVeiculo tipoVeiculo = new TipoVeiculo("Carro", BigDecimal.valueOf(150));
        Veiculo veiculo = new Veiculo("placa", "modelo", "fabricante", true, tipoVeiculo);
       String agenciaRetiradaId =  CapturadorDeEntrada.capturarString("Agência de Retirada");
       Agencia agenciaRetirada = gerenciadorDeAgencia.buscarAgenciaPorNome(agenciaRetiradaId);
       String agenciaDevolucaoId =  CapturadorDeEntrada.capturarString("Agência de Retirada");
       Agencia agenciaDevolucao = gerenciadorDeAgencia.buscarAgenciaPorNome(agenciaDevolucaoId);
       Integer dia =  Integer.parseInt(CapturadorDeEntrada.capturarString("Dia da Retirada"));
       Integer mes =  Integer.parseInt(CapturadorDeEntrada.capturarString("Mes da Retirada"));
       Integer ano =  Integer.parseInt(CapturadorDeEntrada.capturarString("Ano da Retirada"));
       Integer hora =  Integer.parseInt(CapturadorDeEntrada.capturarString("Hora da Retirada"));
       Integer minuto =  Integer.parseInt(CapturadorDeEntrada.capturarString("Minuto da Retirada"));
       LocalDateTime dataRetirada = LocalDateTime.of(ano, mes, dia, hora, minuto);
       dia =  Integer.parseInt(CapturadorDeEntrada.capturarString("Dia da Devolução"));
       mes =  Integer.parseInt(CapturadorDeEntrada.capturarString("Mes da Devolução"));
       ano =  Integer.parseInt(CapturadorDeEntrada.capturarString("Ano da Devolução"));
       hora =  Integer.parseInt(CapturadorDeEntrada.capturarString("Hora da Devolução"));
       minuto =  Integer.parseInt(CapturadorDeEntrada.capturarString("Minuto da Devolução"));
       LocalDateTime dataDevolucao = LocalDateTime.of(ano, mes, dia, hora, minuto);
       Aluguel aluguel = gerenciadorDeAluguel.criarAluguel(cliente, veiculo, agenciaRetirada, agenciaDevolucao, dataRetirada, dataDevolucao);

        System.out.println("Aluguel iniciado com sucesso.");
        System.out.println(aluguel);

    }
}



