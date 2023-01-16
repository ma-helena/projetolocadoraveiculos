package projetolocadoraveiculos.model;

public class Agencia implements Entidade {
    private String nome;
    private String logradouro;

    public Agencia(String nome, String logradouro) {
        this.nome = nome;
        this.logradouro = logradouro;
    }

    @Override
    public String getId() {
        return nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "nome='" + nome + '\'' +
                ", logradouro='" + logradouro + '\'' +
                '}';
    }

    public String getLogradouro() {
        return logradouro;


    }
}
