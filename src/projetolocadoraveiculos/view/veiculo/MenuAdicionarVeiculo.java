package projetolocadoraveiculos.view.veiculo;

import projetolocadoraveiculos.business.GerenciadorDeVeiculo;
import projetolocadoraveiculos.business.GerenciadorTipoVeiculo;
import projetolocadoraveiculos.model.TipoVeiculo;
import projetolocadoraveiculos.model.Veiculo;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

import java.util.List;
import java.util.stream.Collectors;

public class MenuAdicionarVeiculo extends MenuAbstrato {

    GerenciadorDeVeiculo gerenciadorDeVeiculo;
    GerenciadorTipoVeiculo gerenciadorTipoVeiculo;

    MenuAdicionarVeiculo(GerenciadorDeVeiculo gerenciadorDeVeiculo, GerenciadorTipoVeiculo gerenciadorTipoVeiculo) {
        super("Adicionar Veiculo");
        this.gerenciadorDeVeiculo = gerenciadorDeVeiculo;
        this.gerenciadorTipoVeiculo = gerenciadorTipoVeiculo;
    }

    @Override
    protected void acao() {
        String placa = CapturadorDeEntrada.capturarString("placa do veiculo");
        while (gerenciadorDeVeiculo.existeVeiculo(placa)) {
            System.out.println("Já existe um veiculo com a placa " + placa);
            placa = CapturadorDeEntrada.capturarString("placa do novo");
        }

        String modelo = CapturadorDeEntrada.capturarString("modelo do veiculo");
        String fabricante = CapturadorDeEntrada.capturarString("fabricante do veiculo");

        List<TipoVeiculo> todosTiposVeiculos = gerenciadorTipoVeiculo.listarTodosOsTiposDeVeiculos();
        List<String> listaDescricaoDeTodosOsTiposDeVeiculos =
                todosTiposVeiculos.stream()
                        .map(TipoVeiculo::getId)
                        .collect(Collectors.toList());

        String descricaoTipoDeCliente = CapturadorDeEntrada.capturarStringDentreAsPossiveis("tipo de veiculo", listaDescricaoDeTodosOsTiposDeVeiculos);
        TipoVeiculo tipoVeiculo = gerenciadorTipoVeiculo.buscarTipoVeiculos(descricaoTipoDeCliente);

        Veiculo novoVeiculo = gerenciadorDeVeiculo.adicionarVeiculo(placa, modelo, fabricante, tipoVeiculo);
        System.out.println("Novo veiculo adicionado:");
        System.out.println(novoVeiculo);
    }

}
