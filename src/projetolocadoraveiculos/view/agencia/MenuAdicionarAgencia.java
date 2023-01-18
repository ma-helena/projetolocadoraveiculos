package projetolocadoraveiculos.view.agencia;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

public class MenuAdicionarAgencia extends MenuAbstrato{
   private final GerenciadorDeAgencia gerenciadorDeAgencia;

    public MenuAdicionarAgencia(GerenciadorDeAgencia gerenciadorDeAgencia) {
        super("Adicionar agência");
        this.gerenciadorDeAgencia = gerenciadorDeAgencia;
    }

    @Override
    public void agir() {
       String nome=  CapturadorDeEntrada.capturarString("nome da nova agência");
       String logradouro = CapturadorDeEntrada.capturarString("logradouro da nova agencia");
       gerenciadorDeAgencia.criarAgencia(nome,logradouro);
    }
}



