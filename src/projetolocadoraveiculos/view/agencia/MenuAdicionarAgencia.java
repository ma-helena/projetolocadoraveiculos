package projetolocadoraveiculos.view.agencia;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.model.Agencia;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

public class MenuAdicionarAgencia extends MenuAbstrato{
   private final GerenciadorDeAgencia gerenciadorDeAgencia;

    public MenuAdicionarAgencia(GerenciadorDeAgencia gerenciadorDeAgencia) {
        super("Adicionar agência");
        this.gerenciadorDeAgencia = gerenciadorDeAgencia;
    }

    @Override
    public void acao() {
       String nome=  CapturadorDeEntrada.capturarString("nome da nova agência");
       while ((gerenciadorDeAgencia.existeAgencia(nome))){
           System.out.println("Agência com o "+ nome+ " existente");
           nome=  CapturadorDeEntrada.capturarString("nome da nova agência");
       }
       String logradouro = CapturadorDeEntrada.capturarString("logradouro da nova agencia");
        Agencia agencia = gerenciadorDeAgencia.criarAgencia(nome, logradouro);

        System.out.println("Agência adicionada com sucesso");
        System.out.println("Nova agência: " + agencia);

    }
}



