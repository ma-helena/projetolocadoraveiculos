package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Veiculo;

import java.util.List;

public interface VeiculoRepository extends RepositoryGenerico<Veiculo>{
    List<Veiculo> buscarPeloModelo(String modelo);
    //Veiculo buscarVeiculoPelaPlaca(String placa);
    List<Veiculo> buscaPeloFabricante(String nome);
}

