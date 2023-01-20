package projetolocadoraveiculos.view.aluguel;

import projetolocadoraveiculos.business.GerenciadorDeAluguel;
import projetolocadoraveiculos.business.GerenciadorDeVeiculo;
import projetolocadoraveiculos.model.Veiculo;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

public class MenuDevolverVeiculo extends MenuAbstrato {

    private final GerenciadorDeAluguel gerenciadorDeAluguel;

    private final GerenciadorDeVeiculo gerenciadorDeVeiculo;

    public MenuDevolverVeiculo(String descricao, GerenciadorDeAluguel gerenciadorDeAluguel, GerenciadorDeVeiculo gerenciadorDeVeiculo) {
        super(descricao);
        this.gerenciadorDeAluguel = gerenciadorDeAluguel;
        this.gerenciadorDeVeiculo = gerenciadorDeVeiculo;
    }

    @Override
    public void acao() {
        String placa = CapturadorDeEntrada.capturarString("Informe a placa do veículo a ser devolvido");
        Veiculo veiculo = gerenciadorDeVeiculo.buscarVeiculoPelaPlaca(placa);
        veiculo.setDisponível(true);
        gerenciadorDeAluguel.imprimirComprovanteDevolucao(veiculo);
        System.out.println("Veículo devolvido");
    }
}
