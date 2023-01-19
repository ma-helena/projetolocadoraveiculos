package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Agencia;

import java.util.List;

public interface RepositoryGenerico <T> {
    void salvar (T entidade);
    void remover (T entidade);
    T buscarPeloId(String identificador);
    List<T> todos();

}
