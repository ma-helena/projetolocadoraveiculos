package projetolocadoraveiculos.view.cliente;

import projetolocadoraveiculos.business.GerenciadorDeCliente;
import projetolocadoraveiculos.model.Cliente;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

public class MenuBuscarClientePorDocumento extends MenuAbstrato {
    private final GerenciadorDeCliente gerenciadorDeCliente;
    public MenuBuscarClientePorDocumento(GerenciadorDeCliente gerenciadorDeCliente) {
        super("Buscar cliente por documento");

        this.gerenciadorDeCliente = gerenciadorDeCliente;
    }
    @Override
    public void acao() {
        String documento=  CapturadorDeEntrada.capturarString("Documento do cliente buscado");
        if ((!gerenciadorDeCliente.existeCliente(documento))){
            System.out.println("Não existe cliente com o documento: "+ documento);
           return;
        }
        Cliente cliente = gerenciadorDeCliente.buscarClientePorId(documento);
        System.out.println("Cliente encontrado " + cliente);
    }

}
