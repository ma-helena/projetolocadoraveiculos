package projetolocadoraveiculos.persistence;

import projetolocadoraveiculos.model.Agencia;

import java.util.ArrayList;
import java.util.List;

public class AgenciaEmMemoriaRepository  extends RepositoryGenericoEmMemoria<Agencia> implements AgenciaRepository {
    @Override
    public List<Agencia> buscarPeloLogradouro(String parteLogradouro) {
        List<Agencia> agenciasComParteDesseNome = new ArrayList<>();
        for (Agencia agencia: entidades.values()) {
            if (agencia.getLogradouro().contains(parteLogradouro)) {
                agenciasComParteDesseNome.add(agencia);
            }
        }
        return agenciasComParteDesseNome;
}}
