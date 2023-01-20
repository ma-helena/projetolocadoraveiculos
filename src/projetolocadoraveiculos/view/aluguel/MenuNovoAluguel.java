package projetolocadoraveiculos.view.aluguel;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.business.GerenciadorDeAluguel;
import projetolocadoraveiculos.model.*;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

import java.math.BigDecimal;
import java.time.DateTimeException;
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
        Cliente cliente = new Cliente("teste", idCliente, tipoCliente);
       String placa =  CapturadorDeEntrada.capturarString("Placa do veículo");
       // veiculo = gerenciadorDeVeiculo.buscarPeloId(placa);
       TipoVeiculo tipoVeiculo = new TipoVeiculo("Carro", BigDecimal.valueOf(150));
       //Veiculo veiculo = new Veiculo(placa, "modelo", "fabricante", true, tipoVeiculo);
       String agenciaRetiradaId = "";
        boolean existeAgencia = false;
        while (!existeAgencia) {
           agenciaRetiradaId = CapturadorDeEntrada.capturarString("Agência de Retirada");
           existeAgencia = gerenciadorDeAgencia.existeAgencia(agenciaRetiradaId);
           if(!existeAgencia)
               System.out.println("Agência informada não existe. Tente novamente.");
       }

       Agencia agenciaRetirada = gerenciadorDeAgencia.buscarAgenciaPorNome(agenciaRetiradaId);
       existeAgencia = false;
        String agenciaDevolucaoId = "";
       while (!existeAgencia) {
           agenciaDevolucaoId =  CapturadorDeEntrada.capturarString("Agência de Devolucao");
           existeAgencia = gerenciadorDeAgencia.existeAgencia(agenciaDevolucaoId);
           if(!existeAgencia)
               System.out.println("Agência informada não existe. Tente novamente.");
       }

       Agencia agenciaDevolucao = gerenciadorDeAgencia.buscarAgenciaPorNome(agenciaDevolucaoId);
       boolean ok = false;
       Integer dia;
       Integer mes;
       Integer ano;
       Integer hora;
       Integer minuto;
       LocalDateTime dataRetirada = LocalDateTime.now();
       do {
           try {
               dia = Integer.parseInt(CapturadorDeEntrada.capturarString("Dia da Retirada"));
               mes = Integer.parseInt(CapturadorDeEntrada.capturarString("Mes da Retirada"));
               ano = Integer.parseInt(CapturadorDeEntrada.capturarString("Ano da Retirada"));
               hora = Integer.parseInt(CapturadorDeEntrada.capturarString("Hora da Retirada"));
               minuto = Integer.parseInt(CapturadorDeEntrada.capturarString("Minuto da Retirada"));
               dataRetirada = LocalDateTime.of(ano, mes, dia, hora, minuto);
               ok = true;
           } catch (DateTimeException e) {
               System.out.println("Data/Horário informado não é valido. Digite novamente");
               ok = false;
           }
       } while (!ok);
       ok = false;
       LocalDateTime dataDevolucao = LocalDateTime.now();
       do {
           try {
               dia = Integer.parseInt(CapturadorDeEntrada.capturarString("Dia da Devolução"));
               mes = Integer.parseInt(CapturadorDeEntrada.capturarString("Mes da Devolução"));
               ano = Integer.parseInt(CapturadorDeEntrada.capturarString("Ano da Devolução"));
               hora = Integer.parseInt(CapturadorDeEntrada.capturarString("Hora da Devolução"));
               minuto = Integer.parseInt(CapturadorDeEntrada.capturarString("Minuto da Devolução"));
               dataDevolucao = LocalDateTime.of(ano, mes, dia, hora, minuto);
               ok = true;
           } catch (DateTimeException e) {
               System.out.println("Data/Horário informado não é valido. Digite novamente");
               ok = false; }
       } while (!ok);
       //Aluguel aluguel = gerenciadorDeAluguel.criarAluguel(cliente, veiculo, agenciaRetirada, agenciaDevolucao, dataRetirada, dataDevolucao);

       System.out.println("Aluguel iniciado com sucesso.");
       //System.out.println(aluguel);

    }
}



