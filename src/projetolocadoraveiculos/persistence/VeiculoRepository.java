package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Veiculo;

import java.util.List;

public interface VeiculoRepository extends RepositoryGenerico<Veiculo>{
    List<Veiculo> buscarPeloModelo(String modelo);
    List<Veiculo> buscaPeloFabricante(String nome);
}

