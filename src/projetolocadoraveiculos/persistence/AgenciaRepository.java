package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Agencia;
import java.util.List;

public interface AgenciaRepository extends RepositoryGenerico<Agencia>  {

        List<Agencia> buscarPeloLogradouro (String parteLogradouro);
        List<Agencia> buscarPeloNome (String parteNome);
}

