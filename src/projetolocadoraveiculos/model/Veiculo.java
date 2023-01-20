package projetolocadoraveiculos.model;

import java.util.Collection;

public class Veiculo implements Entidade {
    private String placa;
    private String modelo;
    private String fabricante;

    private boolean disponível;
    private TipoVeiculo tipo;

    public Veiculo(String placa, String modelo, String fabricante, TipoVeiculo tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.disponível = true;
    }

    @Override
    public String getId() {
        return placa;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public boolean isDisponível() {
        return disponível;
    }

    public void setDisponível(boolean disponível) {
        this.disponível = disponível;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }



    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", disponível=" + disponível +
                ", tipo=" + tipo +
                '}';
    }
}
