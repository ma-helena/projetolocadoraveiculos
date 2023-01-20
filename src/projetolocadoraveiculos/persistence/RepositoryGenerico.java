package projetolocadoraveiculos.persistence;

public interface RepositoryGenerico <T> {

    void salvar(T entidade);

    void remover(T entidade);

    T buscarPeloId(String identificador);
<<<<<<< Updated upstream
=======

    List<T> todos();
>>>>>>> Stashed changes

}
