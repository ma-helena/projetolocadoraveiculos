package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoEmMemoriaRepository extends RepositoryGenericoEmMemoria<Veiculo> implements VeiculoRepository {
    @Override
    public List<Veiculo> buscarPeloModelo(String parteNome) {
        List<Veiculo> veiculos = new ArrayList<>();
        for (Veiculo veiculo : entidades.values()) {
            if (veiculo.getModelo().contains(parteNome)) {
                veiculos.add(veiculo);
            }
        }
        return veiculos;
    }
/*
    @Override
    public Veiculo buscarVeiculoPelaPlaca(String placa) {
        Veiculo veiculos = new Veiculo;
        for (Veiculo veiculo : entidades.values()) {
            if (veiculo.getPlaca().contains(placa)) {
                veiculos.add(veiculo);
            }
        }
        return veiculos;
    }*/

    @Override
    public List<Veiculo> buscaPeloFabricante(String nome) {
        List<Veiculo> veiculos = new ArrayList<>();
        for (Veiculo veiculo : entidades.values()) {
            if (veiculo.getFabricante().contains(nome)) {
                veiculos.add(veiculo);
            }
        } return veiculos;
    }
}
