package projetolocadoraveiculos.business;

import projetolocadoraveiculos.exception.RegistroDuplicadoException;
import projetolocadoraveiculos.model.TipoVeiculo;
import projetolocadoraveiculos.persistence.TipoVeiculoRepository;

import java.math.BigDecimal;
import java.util.List;
public class GerenciadorTipoVeiculo {
    private final TipoVeiculoRepository tipoVeiculoRepository;

    public GerenciadorTipoVeiculo(TipoVeiculoRepository tipoClienteRepository) {
        this.tipoVeiculoRepository = tipoClienteRepository;
    }

    public List<TipoVeiculo> listarTodosOsTiposDeVeiculos() {
        return tipoVeiculoRepository.todos();
    }

    public TipoVeiculo buscarTipoVeiculos(String descricao) {
        return tipoVeiculoRepository.buscarPeloId(descricao);
    }

    public TipoVeiculo adicionarTipoVeiculo(String descricao, BigDecimal tarifa) {

        if (existeTipoVeiculo(descricao)) {
            throw new RegistroDuplicadoException("Tipo de veiculo", descricao);
        }

        TipoVeiculo novoTipoVeiculo = new TipoVeiculo(descricao, tarifa);
        tipoVeiculoRepository.salvar(novoTipoVeiculo);
        return novoTipoVeiculo;
    }

    private boolean existeTipoVeiculo(String descricao) {
        return tipoVeiculoRepository.buscarPeloId(descricao) != null;
    }

}
