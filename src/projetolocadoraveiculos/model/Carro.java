package projetolocadoraveiculos.model;

import java.math.BigDecimal;

public class Carro extends TipoVeiculo{
    public Carro(){
        super("CARRO", BigDecimal.valueOf(100));
    }
}
