package projetolocadoraveiculos.business;

import projetolocadoraveiculos.exception.RegistroDuplicadoException;
import projetolocadoraveiculos.model.TipoCliente;
import projetolocadoraveiculos.persistence.TipoClienteRepository;

import java.math.BigDecimal;
import java.util.List;

public class GerenciadorTipoCliente {

    private final TipoClienteRepository tipoClienteRepository;

    public GerenciadorTipoCliente(TipoClienteRepository tipoClienteRepository) {
        this.tipoClienteRepository = tipoClienteRepository;
    }

    public List<TipoCliente> listarTodosOsTiposDeCliente() {
        return tipoClienteRepository.todos();
    }

    public TipoCliente buscarTipoCliente(String descricao) {
        return tipoClienteRepository.buscarPeloId(descricao);
    }

    public TipoCliente adicionarTipoCliente(String descricao, BigDecimal desconto, int diasParaDesconto) {

        if (existeTipoCliente(descricao)) {
            throw new RegistroDuplicadoException("Tipo de cliente", descricao);
        }

        TipoCliente novoTipoCliente = new TipoCliente(descricao, desconto, diasParaDesconto);
        tipoClienteRepository.salvar(novoTipoCliente);
        return novoTipoCliente;
    }

    private boolean existeTipoCliente(String descricao) {
        return tipoClienteRepository.buscarPeloId(descricao) != null;
    }
}
