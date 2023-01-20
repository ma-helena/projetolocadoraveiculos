package projetolocadoraveiculos.model;

import java.math.BigDecimal;

public class TipoVeiculo implements Entidade{
    
    private TipoVeiculoEnum descricao;

    private BigDecimal tarifa;

    public TipoVeiculo(TipoVeiculoEnum descricao) {
        this.descricao = descricao;

        if(descricao == TipoVeiculoEnum.CAMINHAO) {
            this.tarifa = BigDecimal.valueOf(200);
        }
        if(descricao == TipoVeiculoEnum.CARRO) {
            this.tarifa = BigDecimal.valueOf(150);
        }
        if(descricao == TipoVeiculoEnum.MOTO) {
            this.tarifa = BigDecimal.valueOf(100);
        }
    }

    @Override
    public String getId() {
        return descricao.toString();
    }

    public TipoVeiculoEnum getDescricao() {
        return descricao;
    }

    public void setDescricao(TipoVeiculoEnum descricao) {
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
