package projetolocadoraveiculos.model;

import java.math.BigDecimal;

public class TipoCliente implements Entidade{
    private TipoClienteEnum tipo;
    private BigDecimal desconto;

    private int quantidadeDiasParaDesconto;

    public TipoCliente(TipoClienteEnum tipo) {
        this.tipo = tipo;

        if (tipo == TipoClienteEnum.PF) {
            this.desconto = BigDecimal.valueOf(0.05);
            this.quantidadeDiasParaDesconto = 5;
        }
        if (tipo == TipoClienteEnum.PJ) {
            this.desconto = BigDecimal.valueOf(0.10);
            this.quantidadeDiasParaDesconto = 3;
        }
    }

    @Override
    public String toString() {
        return "TipoCliente " + tipo.toString();
    }

    @Override
    public String getId() {
        return tipo.toString();
    }
}
