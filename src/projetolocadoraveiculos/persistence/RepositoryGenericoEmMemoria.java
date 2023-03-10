package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Entidade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositoryGenericoEmMemoria<T extends Entidade>  implements RepositoryGenerico <T> {
    protected Map<String, T> entidades;

    public RepositoryGenericoEmMemoria() {
        this.entidades = new HashMap<>();
    }

    @Override
    public void salvar(T entidade) {
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

    @Override
    public List<T> todos() {
        return new ArrayList<>(entidades.values());
    }
}
