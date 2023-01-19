package projetolocadoraveiculos.view.agencia;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.model.Agencia;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

public class MenuBuscarAgenciaPorNome extends MenuAbstrato {
    private final GerenciadorDeAgencia gerenciadorDeAgencia;
    public MenuBuscarAgenciaPorNome(GerenciadorDeAgencia gerenciadorDeAgencia) {
        super("Buscar agência por nome");

        this.gerenciadorDeAgencia = gerenciadorDeAgencia1;
    }
    @Override
    public void acao() {
        String nome=  CapturadorDeEntrada.capturarString("nome da agência buscada");
        if ((!gerenciadorDeAgencia.existeAgencia(nome))){
            System.out.println("Não existe agência com o nome: "+ nome);
           return;
        }
        Agencia agencia = gerenciadorDeAgencia.buscarAgenciaPorNome(nome);
        System.out.println("Agência encontrada " + agencia);
    }

}
