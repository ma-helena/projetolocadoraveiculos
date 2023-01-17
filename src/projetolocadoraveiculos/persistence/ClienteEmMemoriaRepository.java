package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteEmMemoriaRepository extends RepositoryGenericoEmMemoria<Cliente> implements ClienteRepository {

    @Override
    public List<Cliente> buscarPeloNome(String parteNome) { // cria a lista verifica se tods os clientes possuem parte do nome e adiciona à cliente
        List<Cliente>clientesComParteDesseNome = new ArrayList<>();
        for( Cliente cliente: entidades.values()){

            if(cliente.getNome().contains(parteNome)){
                clientesComParteDesseNome.add(cliente);
            }

        }
        return clientesComParteDesseNome;
    }




}
