package projetolocadoraveiculos.view.aluguel;

import projetolocadoraveiculos.business.GerenciadorDeAluguel;
import projetolocadoraveiculos.model.Agencia;
import projetolocadoraveiculos.model.Aluguel;
import projetolocadoraveiculos.view.MenuAbstrato;

import java.util.List;

public class MenuListarAlugueis extends MenuAbstrato {

    private final GerenciadorDeAluguel gerenciadorDeAluguel;

    public MenuListarAlugueis(String descricao, GerenciadorDeAluguel gerenciadorDeAluguel) {
        super(descricao);
        this.gerenciadorDeAluguel = gerenciadorDeAluguel;
    }

    @Override
    public void acao() {
        List<Aluguel> alugueis = gerenciadorDeAluguel.listarTodos();

        if (alugueis.isEmpty()){
            System.out.println("Não há alugueis registrados. ");
            return;
        }
        System.out.println("Alugueis encontrados: ");

        for (Aluguel aluguel: alugueis){
            System.out.println(aluguel);
        }
    }


}
