package projetolocadoraveiculos.view.agencia;

import projetolocadoraveiculos.business.GerenciadorDeAgencia;
import projetolocadoraveiculos.model.Agencia;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

import java.util.List;


public class MenuListarAgencia extends MenuAbstrato {
    private final GerenciadorDeAgencia gerenciadorDeAgencia;
    public MenuListarAgencia(GerenciadorDeAgencia gerenciadorDeAgencia) {
        super("Listar as agências do catálogo");

        this.gerenciadorDeAgencia = gerenciadorDeAgencia;
    }
    @Override
    public void acao() {
        List<Agencia> agencias = gerenciadorDeAgencia.listarAgencias();

        if (agencias.isEmpty()){
            System.out.println("Não há agência cadastrada. ");
            return;
        }
        System.out.println("Agências encontradas: ");

        for (Agencia agencia: agencias){
            System.out.println(agencia);
        }
    }

}
