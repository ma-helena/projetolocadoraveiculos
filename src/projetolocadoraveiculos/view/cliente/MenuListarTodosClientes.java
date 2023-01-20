package projetolocadoraveiculos.view.cliente;

import projetolocadoraveiculos.business.GerenciadorDeCliente;
import projetolocadoraveiculos.model.Cliente;
import projetolocadoraveiculos.view.MenuAbstrato;
import java.util.List;

public class MenuListarTodosClientes extends MenuAbstrato {
    private final GerenciadorDeCliente gerenciadorDeCliente;
    public MenuListarTodosClientes(GerenciadorDeCliente gerenciadorDeCliente) {
        super("Lista de clientes");

        this.gerenciadorDeCliente = gerenciadorDeCliente;
    }
    @Override
    public void acao() {
        List<Cliente> clientes = gerenciadorDeCliente.listarClientes();

        if (clientes.isEmpty()){
            System.out.println("Não há agência cadastrada. ");
            return;
        }
        System.out.println("Clientes cadastrados: ");

        for (Cliente cliente : clientes){
            System.out.println(cliente.toString());
        }
    }
}
