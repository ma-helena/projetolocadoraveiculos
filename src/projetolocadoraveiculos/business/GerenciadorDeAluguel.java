package projetolocadoraveiculos.business;

import projetolocadoraveiculos.model.*;
import projetolocadoraveiculos.persistence.AgenciaRepository;
import projetolocadoraveiculos.persistence.AluguelEmMemoriaRepository;
import projetolocadoraveiculos.persistence.AluguelRepository;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class GerenciadorDeAluguel {

    private final AluguelRepository aluguelRepository;

    private final AgenciaRepository agenciaRepository;


    public GerenciadorDeAluguel(AluguelRepository aluguelRepository, AgenciaRepository agenciaRepository) {
        this.aluguelRepository = aluguelRepository;
        this.agenciaRepository = agenciaRepository;
    }

    public Aluguel criarAluguel(Cliente cliente, Veiculo veiculo, Agencia agenciaRetirada, Agencia agenciaDevolucao, LocalDateTime dataRetirada, LocalDateTime dataDevolucao){
        Aluguel novoAluguel = new Aluguel(cliente, veiculo, agenciaRetirada, agenciaDevolucao, dataRetirada, dataDevolucao);
        aluguelRepository.salvar(novoAluguel);
        return novoAluguel;
    }

    public List<Aluguel> listarTodos(){
        return aluguelRepository.todos();
    }

    public BigDecimal calculaTotalAluguel(LocalDateTime dataRetirada, LocalDateTime dataDevolucao, TipoCliente tipoCliente, TipoVeiculo tipoVeiculo)
    {
        BigDecimal totalAluguel = BigDecimal.valueOf(0);
        Duration duration = Duration.between(dataRetirada, dataDevolucao);
        double periodo = Math.ceil((double)duration.getSeconds()/86400);
        BigDecimal tarifa = new BigDecimal(150);
        totalAluguel = BigDecimal.valueOf(periodo).multiply(tarifa);
        BigDecimal desconto = new BigDecimal(10);
        int diasDesconto = 10;
        if (periodo > diasDesconto)
            totalAluguel = totalAluguel.multiply (BigDecimal.valueOf(1).subtract(desconto));
        return (totalAluguel);
    }

    public void imprimirComprovante(Aluguel aluguel){
        BigDecimal totalAluguel = BigDecimal.valueOf(0);
        Duration duration = Duration.between(aluguel.getDataRetirada(), aluguel.getDataDevolucao());
        System.out.println("\t----------------------------------\t");
        System.out.println("\t\tComprovante de aluguel\t\t");
        System.out.println("\t----------------------------------\t");
        System.out.println("ID:" + aluguel.getId());
        System.out.println("Nome do Cliente: " + aluguel.getCliente().getNome());
        System.out.println("Data Retirada: " + aluguel.getDataRetirada());
        System.out.println("Data Devolução: " + aluguel.getDataDevolucao());
        System.out.println("Número de Diárias: " + Math.ceil((double)duration.getSeconds()/86400));
        System.out.println("Tarifa: R$150");
        System.out.println("\t___________________________________\t");
        System.out.println("Valor Total R$: " + aluguel.getValorTotal());
        System.out.println("\n\n");
    }

    //private boolean checarDisponibilidade(Veiculo veiculo)
    //{
    //    return veiculoRepository.buscarPeloId(veiculo.getDisponivel());
    //}

    //BigDecimal calcularValorAluguel(Aluguel aluguel)
    //{
    //    cliente.getTipoCliente()
    //}

}
