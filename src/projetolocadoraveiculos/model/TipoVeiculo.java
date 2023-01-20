package projetolocadoraveiculos.model;

import java.math.BigDecimal;

<<<<<<< Updated upstream
public class TipoVeiculo implements Entidade {

=======
public class TipoVeiculo {
    
>>>>>>> Stashed changes
    private String descricao;

    private BigDecimal tarifa;

    public TipoVeiculo(String descricao, BigDecimal tarifa) {
        this.descricao = descricao;
        this.tarifa = tarifa;
    }

<<<<<<< Updated upstream
    //@Override
=======
    @Override
>>>>>>> Stashed changes
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
