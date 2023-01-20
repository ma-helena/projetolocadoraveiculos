package projetolocadoraveiculos.business;

import projetolocadoraveiculos.exception.RegistroDuplicadoException;
import projetolocadoraveiculos.model.TipoVeiculo;
import projetolocadoraveiculos.model.Veiculo;
import projetolocadoraveiculos.persistence.VeiculoRepository;

import java.util.List;

public class GerenciadorDeVeiculo {

    private final VeiculoRepository veiculoRepository;

    public GerenciadorDeVeiculo(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public boolean existeVeiculo(String placa) {
        return veiculoRepository.buscarPeloId(placa) != null;
    }

    public Veiculo adicionarVeiculo(String placa, String modelo, String fabricante, TipoVeiculo tipoVeiculo) {

        if (existeVeiculo(placa)) {
            throw new RegistroDuplicadoException("veiculo", placa);
        }

        Veiculo novoVeiculo = new Veiculo(placa, modelo, fabricante, tipoVeiculo);
        veiculoRepository.salvar(novoVeiculo);

        return novoVeiculo;
    }

    public List<Veiculo> buscarVeiculoPeloNome(String nome) {
        return veiculoRepository.buscarPeloModelo(nome);
    }

    public List<Veiculo> buscarVeiculoPelaPlaca(String placa) {
        return veiculoRepository.buscarVeiculoPelaPlaca(placa);
    }

}
