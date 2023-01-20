package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Cliente;

import java.util.List;

public interface ClienteRepository extends RepositoryGenerico<Cliente>{
    List<Cliente> buscarPeloNome(String parteNome);
}
