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

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Agencia getAgenciaRetirada() {
        return agenciaRetirada;
    }

    public Agencia getAgenciaDevolucao() {
        return agenciaDevolucao;
    }

    public LocalDateTime getDataRetirada() {
        return dataRetirada;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Aluguel" +
                "\nID: " + id +
                ", \nCliente: " + cliente +
                ", \nVeículo: " + veiculo +
                ", \nAgência Retirada: " + agenciaRetirada +
                ", \nAgência Devolução: " + agenciaDevolucao +
                ", \nData Retirada: " + dataRetirada +
                ", \nData Devolucao: " + dataDevolucao +
                ", \nValor Total: " + valorTotal +
                '}';
    }
}
