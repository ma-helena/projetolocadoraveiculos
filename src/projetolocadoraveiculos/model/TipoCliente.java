package projetolocadoraveiculos.model;

public class TipoCliente {
    private String descricao;
    private String desconto;
    private int quantidadeDiasParaDesconto;

    public TipoCliente(String descricao, String desconto, int quantidadeDiasParaDesconto) {
        this.descricao = descricao;
        this.desconto = desconto;
        this.quantidadeDiasParaDesconto = quantidadeDiasParaDesconto;
    }

    @Override
    public String toString() {
        return "TipoCliente{" +
                "descricao='" + descricao + '\'' +
                ", desconto='" + desconto + '\'' +
                ", quantidadeDiasParaDesconto=" + quantidadeDiasParaDesconto +
                '}';
    }
}
