package projetolocadoraveiculos.view.agencia;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.model.Agencia;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;


public class MenuListarAgencia extends MenuAbstrato {
    private final GerenciadorDeAgencia gerenciadorDeAgencia;
    public MenuListarAgencia(GerenciadorDeAgencia gerenciadorDeAgencia) {
        super("Listar as agências do catálogo");

        this.gerenciadorDeAgencia = gerenciadorDeAgencia;
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
