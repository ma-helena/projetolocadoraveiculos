package projetolocadoraveiculos.business;


import projetolocadoraveiculos.exception.RegistroDuplicadoException;
import projetolocadoraveiculos.model.Cliente;
import projetolocadoraveiculos.model.TipoCliente;
import projetolocadoraveiculos.persistence.ClienteRepository;

public class GerenciadorDeCliente {

    private final ClienteRepository clienteRepository;

    public GerenciadorDeCliente(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public boolean existeCliente(String documento) {
        return clienteRepository.buscarPeloId(documento) != null;
    }

    public Cliente adicionarCliente(String documento, String nome, TipoCliente tipoCliente) {

        if (existeCliente(documento)) {
            throw new RegistroDuplicadoException("cliente", documento);
        }

        Cliente novoCliente = new Cliente(nome, documento, tipoCliente);
        clienteRepository.salvar(novoCliente);

        return novoCliente;
    }
}
