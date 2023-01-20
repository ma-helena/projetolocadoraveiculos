package projetolocadoraveiculos.business;

import projetolocadoraveiculos.model.Agencia;
import projetolocadoraveiculos.model.Aluguel;
import projetolocadoraveiculos.model.Cliente;
import projetolocadoraveiculos.model.Veiculo;
import projetolocadoraveiculos.persistence.AgenciaRepository;
import projetolocadoraveiculos.persistence.AluguelEmMemoriaRepository;
import projetolocadoraveiculos.persistence.AluguelRepository;

import java.math.BigDecimal;
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

    //private boolean veiculoDisponivel(Veiculo veiculo)
    //{
    //    return veiculoRepository.buscarPeloId(veiculo.getDisponivel());
    //}

    //BigDecimal calcularValorAluguel(Aluguel aluguel)
    //{
    //    cliente.getTipoCliente()
    //}

}
