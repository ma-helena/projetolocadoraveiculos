package projetolocadoraveiculos.model;

public class Cliente implements Entidade {
    private String nome;
    private String documento;
    private TipoCliente tipoCliente;

    public Cliente(String nome, String documento, TipoCliente tipoCliente) {
        this.nome = nome;
        this.documento = documento;
        this.tipoCliente = tipoCliente;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNome() {
        return nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    @Override
    public String getId() {
        return documento;
    }

    @Override
    public String toString() {
        return "\nCliente " + nome + "\nDocumento: " + documento + "\nTipo de Cliente: " + tipoCliente.toString() + "\n";
    }
}
