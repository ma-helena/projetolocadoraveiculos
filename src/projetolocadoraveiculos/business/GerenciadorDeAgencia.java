package projetolocadoraveiculos.business;

import projetolocadoraveiculos.exception.RegistroDuplicadoException;
import projetolocadoraveiculos.model.Agencia;
import projetolocadoraveiculos.persistence.AgenciaRepository;

import java.util.List;
public class GerenciadorDeAgencia {

    private final AgenciaRepository agenciaRepository ;//uso de apenas um repositório da agência

    public GerenciadorDeAgencia(AgenciaRepository agenciaRepository) {

        this.agenciaRepository = agenciaRepository;
    }
    // manipulaçao da agência, cumprir as regras de negocio

    public Agencia criarAgencia(String nome, String logradouro){
        if (existeAgencia(nome)) {
            throw new RegistroDuplicadoException("Agencia",nome);
        }
        Agencia novaAgencia = new Agencia(nome, logradouro);
        agenciaRepository.salvar(novaAgencia);
        return novaAgencia;
    }
    public Agencia buscarAgenciaPorNome (String nome){

        return  agenciaRepository.buscarPeloId(nome);
    }
    public boolean existeAgencia(String nome){
        return agenciaRepository.buscarPeloId(nome) != null;

    }
    public  List<Agencia> listarAgencias(){
        return agenciaRepository.todos();
    }
    public void removerAgencia(Agencia agencia){
        agenciaRepository.remover(agencia);
    }


}
