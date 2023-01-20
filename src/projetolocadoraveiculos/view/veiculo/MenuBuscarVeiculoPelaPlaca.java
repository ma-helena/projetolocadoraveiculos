package projetolocadoraveiculos.view.veiculo;

import projetolocadoraveiculos.business.GerenciadorDeVeiculo;
import projetolocadoraveiculos.model.Veiculo;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

import java.util.List;

public class MenuBuscarVeiculoPelaPlaca extends MenuAbstrato {

    private final GerenciadorDeVeiculo gerenciadorDeVeiculo;

    public MenuBuscarVeiculoPelaPlaca(GerenciadorDeVeiculo gerenciadorDeVeiculo) {
        super("Buscar veiculo pela placa");
        this.gerenciadorDeVeiculo = gerenciadorDeVeiculo;
    }

    @Override
    public void acao() {
        String placa = CapturadorDeEntrada.capturarString("placa do veiculo buscado");

        if (!gerenciadorDeVeiculo.existeVeiculo(placa)) {
            System.out.println("Não existe veiculo com a placa " + placa);
            return;
        }
        System.out.println("Veiculo encontrado:");
    }
}
