package projetolocadoraveiculos.model;

import java.util.Collection;

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
        this.disponivel = true;
        this.tipoveiculo = tipoveiculo;
    }

    @Override
    public String getId() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public TipoVeiculo getTipoveiculo() {
        return tipoveiculo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", disponivel=" + disponivel +
                ", tipoveiculo=" + tipoveiculo +
                '}';
    }
}
