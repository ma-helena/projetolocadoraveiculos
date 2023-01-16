package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Cliente;

import java.util.List;

public interface ClienteRepository {
    List<Cliente> buscarPeloNome(String parteNome); // retorna uma lista de clientes


}
