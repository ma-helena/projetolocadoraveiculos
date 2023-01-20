package projetolocadoraveiculos.view.cliente;

import projetolocadoraveiculos.business.GerenciadorDeCliente;
import projetolocadoraveiculos.model.Cliente;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

public class MenuBuscarClientePorNome extends MenuAbstrato {
    private final GerenciadorDeCliente gerenciadorDeCliente;
    public MenuBuscarClientePorNome(GerenciadorDeCliente gerenciadorDeCliente) {
        super("Buscar cliente por nome");

        this.gerenciadorDeCliente = gerenciadorDeCliente;
    }
    @Override
    public void acao() {
        String nome=  CapturadorDeEntrada.capturarString("nome do cliente buscado");
        if ((!gerenciadorDeCliente.existeCliente(nome))){
            System.out.println("Não existe cliente com o nome: "+ nome);
           return;
        }
        Cliente cliente = gerenciadorDeCliente.buscarClientePorNome(nome);
        System.out.println("Cliente encontrado " + cliente);
    }

}
