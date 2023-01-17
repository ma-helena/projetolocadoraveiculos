package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Agencia;
import java.util.List;

public interface AgenciaRepository  {

        List<Agencia> buscarPeloLogradouro (String parteLogradouro);

    void salvar(Agencia novaAgencia);

    boolean buscarPeloId(String nome);
}

