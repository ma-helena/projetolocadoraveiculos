package projetolocadoraveiculos.view.veiculo;

import projetolocadoraveiculos.business.GerenciadorDeVeiculo;
import projetolocadoraveiculos.model.Veiculo;
import projetolocadoraveiculos.view.MenuAbstrato;

import java.util.List;


public class MenuListarTodosVeiculos extends MenuAbstrato {
    private final GerenciadorDeVeiculo gerenciadorDeVeiculo;
    public MenuListarTodosVeiculos(GerenciadorDeVeiculo gerenciadorDeVeiculo) {
        super("Listar os veículos do catálogo: ");

        this.gerenciadorDeVeiculo = gerenciadorDeVeiculo;
    }
    @Override
    public void acao() {
        List<Veiculo> veiculos = gerenciadorDeVeiculo.listarVeiculos();

        if (veiculos.isEmpty()){
            System.out.println("Não há veículo cadastrada. ");
            return;
        }
        System.out.println("Veículos encontradas: ");

        for (Veiculo veiculo: veiculos){
            System.out.println(veiculos);
        }
    }

}
