package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Entidade;

import java.util.HashMap;
import java.util.Map;

public class RepositoryGenericoEmMemoria<T extends Entidade> implements RepositoryGenerico<T> {

    protected Map<String, T> entidades;

    public RepositoryGenericoEmMemoria() {
        this.entidades = new HashMap<>();
    }

    @Override
    public void salvar(T entidade) {
//        Cliente clienteEncontrado = this.buscarPeloId(cliente.getDocumento());
//        if (clienteEncontrado != null) {
//            remover(clienteEncontrado);
//        }
//        this.clientes.add(cliente);

        this.entidades.put(entidade.getId(), entidade);
    }

    @Override
    public void remover(T entidade) {
        this.entidades.remove(entidade);
    }

    @Override
    public T buscarPeloId(String identificador) {
        return entidades.get(identificador);
    }

<<<<<<< Updated upstream

=======
    @Override
    public List<T> todos() {
        return new ArrayList<>(entidades.values());
    }
>>>>>>> Stashed changes
}
