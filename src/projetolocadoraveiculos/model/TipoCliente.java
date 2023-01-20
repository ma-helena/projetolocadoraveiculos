package projetolocadoraveiculos.model;

public class TipoCliente {
    private String descricao;
<<<<<<< Updated upstream
    private String desconto;
=======

    private BigDecimal desconto;

>>>>>>> Stashed changes
    private int quantidadeDiasParaDesconto;

    public TipoCliente(String descricao, String desconto, int quantidadeDiasParaDesconto) {
        this.descricao = descricao;
        this.desconto = desconto;
        this.quantidadeDiasParaDesconto = quantidadeDiasParaDesconto;
    }

<<<<<<< Updated upstream
=======
    @Override
    public String getId() {
        return descricao;
    }

>>>>>>> Stashed changes
    @Override
    public String toString() {
        return "TipoCliente{" +
                "descricao='" + descricao + '\'' +
                ", desconto=" + desconto +
                ", quantidadeDiasParaDesconto=" + quantidadeDiasParaDesconto +
                '}';
    }
}
