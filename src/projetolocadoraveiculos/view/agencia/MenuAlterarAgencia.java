package projetolocadoraveiculos.view.agencia;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.model.Agencia;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

public class MenuAlterarAgencia extends MenuAbstrato {

    private final GerenciadorDeAgencia gerenciadorDeAgencia;

    public MenuAlterarAgencia(GerenciadorDeAgencia gerenciadorDeAgencia) {
        super("Alterar agência");
        this.gerenciadorDeAgencia = gerenciadorDeAgencia;
    }



    @Override
    public void acao() {
        String nome=  CapturadorDeEntrada.capturarString("nome da agência a ser alterado");
        while ((!gerenciadorDeAgencia.existeAgencia(nome))){
            System.out.println("Agência com o "+ nome+ " não existe");
            nome=  CapturadorDeEntrada.capturarString("nome da agência para alteração");
        }
        Agencia agencia = gerenciadorDeAgencia.buscarAgenciaPorNome(nome);


        String logradouro = CapturadorDeEntrada.capturarString("Informe o logradouro da agância a ser alterado");

        gerenciadorDeAgencia.removerAgencia(agencia);
        agencia = gerenciadorDeAgencia.criarAgencia(nome, logradouro);


        System.out.println("Agência alterada com sucesso");
        System.out.println("Agência: " + agencia);

    }
}
