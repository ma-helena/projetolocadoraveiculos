package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoEmMemoriaRepository extends RepositoryGenericoEmMemoria<Veiculo> implements VeiculoRepository {
    @Override
    public List<Veiculo> buscarPeloModelo(String parteDoModelo) {
        List <Veiculo> veiculoComParteDoModelo = new ArrayList<>();
        for(Veiculo veiculo: entidades.values()){
            if(veiculo.getModelo().contains(parteDoModelo)){
                veiculoComParteDoModelo.add(veiculo);
            }
        }
        return veiculoComParteDoModelo;
    }
}
