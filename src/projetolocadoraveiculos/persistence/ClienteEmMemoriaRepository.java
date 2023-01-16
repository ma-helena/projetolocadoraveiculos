package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Cliente;
import projetolocadoraveiculos.model.Entidade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteEmMemoriaRepository extends RepositorioGenericoAbstract <Cliente> implements ClienteRepository {

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
