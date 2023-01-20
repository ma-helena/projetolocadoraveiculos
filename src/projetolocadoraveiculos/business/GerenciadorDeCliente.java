package projetolocadoraveiculos.business;


import projetolocadoraveiculos.exception.RegistroDuplicadoException;
import projetolocadoraveiculos.model.Cliente;
import projetolocadoraveiculos.model.TipoCliente;
import projetolocadoraveiculos.persistence.ClienteRepository;

import java.util.List;

public class GerenciadorDeCliente {
    private final ClienteRepository clienteRepository ;
    public GerenciadorDeCliente (ClienteRepository clienteRepository) {

        this.clienteRepository = clienteRepository;
    }

    public Cliente criarCliente (String nome, String documento, TipoCliente tipoCliente){
        if (existeCliente(nome)) {
            throw new RegistroDuplicadoException("Cliente",nome);
        }
        Cliente novoCliente = new Cliente(nome, documento, tipoCliente);
        clienteRepository.salvar(novoCliente);
        return novoCliente;
    }
    public Cliente buscarClientePorId(String nome){

        return  clienteRepository.buscarPeloId(nome);
    }
    public boolean existeCliente(String nome){
        return clienteRepository.buscarPeloId(nome) != null;

    }
    public List<Cliente> listarClientes(){
        return clienteRepository.todos();
    }
    public void removerCliente(Cliente cliente){
        clienteRepository.remover(cliente);
    }
}
