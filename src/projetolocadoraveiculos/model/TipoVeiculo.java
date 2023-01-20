package projetolocadoraveiculos.model;

import java.math.BigDecimal;

public class TipoVeiculo implements Entidade {

    private String descricao;

    private BigDecimal tarifa;

    public TipoVeiculo(String descricao, BigDecimal tarifa) {
        this.descricao = descricao;
        this.tarifa = tarifa;
    }

    //@Override
    public String getId() {
        return descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getTarifa() {
        return tarifa;
    }

    public void setTarifa(BigDecimal tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "TipoVeiculo{" +
                "descricao='" + descricao + '\'' +
                ", tarifa=" + tarifa +
                '}';
    }
}
