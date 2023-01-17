package projetolocadoraveiculos.business;

import projetolocadoraveiculos.exception.RegistroDuplicadoException;
import projetolocadoraveiculos.model.Agencia;
import projetolocadoraveiculos.persistence.AgenciaEmMemoriaRepository;
import projetolocadoraveiculos.persistence.AgenciaRepository;

public class GerenciadorDeAgencia {

    AgenciaRepository agenciaRepository = new AgenciaEmMemoriaRepository();
    // manipulaçao da agência, cumprir as regras de negocio

    public Agencia criarAgencia(String nome, String logradouro){
        if (existeAgencia(nome)) {
            throw new RegistroDuplicadoException("Agencia",nome);
        }
        Agencia novaAgencia = new Agencia(nome, logradouro);
        agenciaRepository.salvar(novaAgencia);
        return novaAgencia;
    }
    public boolean existeAgencia(String nome){
        return agenciaRepository.buscarPeloId(nome) != null; // checar

    }

}
