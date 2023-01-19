package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Agencia;

import java.util.ArrayList;
import java.util.List;

public class AgenciaEmMemoriaRepository  extends RepositoryGenericoEmMemoria<Agencia> implements AgenciaRepository {
    @Override
    public List<Agencia> buscarPeloLogradouro(String parteLogradouro) {
        List<Agencia> agenciasComParteDesseLogradouro = new ArrayList<>();
        for (Agencia agencia: entidades.values()) {
            if (agencia.getLogradouro().contains(parteLogradouro)) {
                agenciasComParteDesseLogradouro.add(agencia);
            }
        }
        return agenciasComParteDesseLogradouro;
}

    @Override
    public List<Agencia> buscarPeloNome(String parteNome) {
     List<Agencia> agenciaComParteDesseNome = new ArrayList<>();
     for(Agencia agencia: entidades.values()){
         if (agencia.getNome().contains(parteNome)){
             agenciaComParteDesseNome.add(agencia);
         }
     }
     return agenciaComParteDesseNome;
    }


//    @Override
//    public List<Agencia> todos() {
//        return null;
//    }
}
