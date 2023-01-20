package projetolocadoraveiculos.view.veiculo;

import projetolocadoraveiculos.business.GerenciadorDeVeiculo;
import projetolocadoraveiculos.model.Veiculo;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

public class MenuBuscarVeiculoPorNome extends MenuAbstrato {
    private final GerenciadorDeVeiculo gerenciadorDeVeiculo;
    public MenuBuscarVeiculoPorNome(GerenciadorDeVeiculo gerenciadorDeVeiculo) {
        super("Buscar veículo por nome");

        this.gerenciadorDeVeiculo = gerenciadorDeVeiculo;
    }
    @Override
    public void acao() {
        String nome =  CapturadorDeEntrada.capturarString("nome da veículo a ser buscado");
        if ((!gerenciadorDeVeiculo.existeVeiculo(nome))){
            System.out.println("Não existe veículo com o nome: "+ nome);
           return;
        }
        Veiculo veiculo = gerenciadorDeVeiculo.buscarVeiculoPorNome(nome);
        System.out.println("Veículo encontrada " + veiculo);
    }

}
