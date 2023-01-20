package projetolocadoraveiculos.model;

import java.util.Objects;

public class Endereco {
    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, String cep, String numero, String cidade, String estado) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(logradouro, endereco.logradouro) && Objects.equals(cep, endereco.cep) && Objects.equals(numero, endereco.numero) && Objects.equals(cidade, endereco.cidade) && Objects.equals(estado, endereco.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logradouro, cep, numero, cidade, estado);
    }

    @Override
    public String toString() {
        return "Endereco" +
                "\nLogradouro='" + logradouro +
                "\nCep=" + cep +
                "\nnumero='" + numero +
                "\ncidade='" + cidade +
                "\nestado='" + estado + '\n';
    }
}
