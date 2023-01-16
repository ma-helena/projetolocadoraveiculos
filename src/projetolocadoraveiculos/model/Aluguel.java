package projetolocadoraveiculos.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Aluguel implements Entidade{
    private UUID id;
    private Cliente cliente;
    private Veiculo veiculo;
    private Agencia agenciRetirada;
    private Agencia agenciaDevolucao;
    private LocalDateTime dataRetirada;
    private LocalDateTime dataDevolucao;

    public Aluguel( Cliente cliente, Veiculo veiculo, Agencia agenciRetirada, Agencia agenciaDevolucao, LocalDateTime dataRetirada, LocalDateTime dataDevolucao) {
        this.id = UUID.randomUUID(); // geração de ids unicos
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.agenciRetirada = agenciRetirada;
        this.agenciaDevolucao = agenciaDevolucao;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public String getId() {
        return id.toString();
    }
}
