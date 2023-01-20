package projetolocadoraveiculos.view.veiculo;

import projetolocadoraveiculos.business.GerenciadorDeVeiculo;
import projetolocadoraveiculos.model.TipoVeiculo;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

public class MenuAlterarVeiculo extends MenuAbstrato {

    GerenciadorDeVeiculo gerenciadorDeVeiculo;

    MenuAlterarVeiculo(GerenciadorDeVeiculo gerenciadorDeVeiculo) {
        super("Alterar Veiculo");
        this.gerenciadorDeVeiculo = gerenciadorDeVeiculo;
    }

    @Override
    protected void acao() {
        String placa = CapturadorDeEntrada.capturarString("placa do veiculo");
        while (!gerenciadorDeVeiculo.existeVeiculo(placa)) {
            System.out.println("Não existe um veiculo com a placa " + placa);
            placa = CapturadorDeEntrada.capturarString("placa do novo");
        }

        String modelo = CapturadorDeEntrada.capturarString("modelo do veiculo");
        String fabricante = CapturadorDeEntrada.capturarString("fabricante do veiculo");

        TipoVeiculo tipoVeiculo = MenuTipoVeiculo.capturarTipoVeiculo();
               
        gerenciadorDeVeiculo.alterarVeiculo(placa, modelo, fabricante, tipoVeiculo);
        System.out.println("Novo veiculo adicionado:");
    }
}
