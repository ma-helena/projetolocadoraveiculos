package projetolocadoraveiculos.model;

public class Veiculo implements Entidade {
    private String placa;
    private String modelo;
    private String fabricante;
    private boolean disponivel;
    private TipoVeiculo tipoveiculo;

    public Veiculo(String placa, String modelo, String fabricante, boolean disponivel, TipoVeiculo tipoveiculo) {
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.disponivel = disponivel;
        this.tipoveiculo = tipoveiculo;
    }

    @Override
    public String getId() {
        return placa;
    }
}
