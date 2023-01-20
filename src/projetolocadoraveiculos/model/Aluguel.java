package projetolocadoraveiculos.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

public class Aluguel implements Entidade{
    private UUID id;
    private Cliente cliente;
    private Veiculo veiculo;
    private Agencia agenciaRetirada;
    private Agencia agenciaDevolucao;
    private LocalDateTime dataRetirada;
    private LocalDateTime dataDevolucao;

    private BigDecimal valorTotal;

    public Aluguel( Cliente cliente, Veiculo veiculo, Agencia agenciaRetirada, Agencia agenciaDevolucao, LocalDateTime dataRetirada, LocalDateTime dataDevolucao) {
        this.id = UUID.randomUUID(); // geração de ids unicos
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.agenciaRetirada = agenciaRetirada;
        this.agenciaDevolucao = agenciaDevolucao;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
    }

    public String getId() {
        return id.toString();
    }

    public BigDecimal calculaTotalAluguel(LocalDateTime dataRetirada, LocalDateTime dataDevolucao,  TipoCliente tipoCliente, TipoVeiculo tipoVeiculo)
    {
        BigDecimal totalAluguel = BigDecimal.valueOf(0);
        Duration duration = Duration.between(dataRetirada, dataDevolucao);
        return (totalAluguel);
    }


    @Override
    public String toString() {
        return "Aluguel" +
                "\nid: " + id +
                ", \ncliente: " + cliente +
                ", \nveiculo: " + veiculo +
                ", \nagenciaRetirada: " + agenciaRetirada +
                ", \nagenciaDevolucao: " + agenciaDevolucao +
                ", \ndataRetirada: " + dataRetirada +
                ", \ndataDevolucao: " + dataDevolucao +
                '}';
    }
}
