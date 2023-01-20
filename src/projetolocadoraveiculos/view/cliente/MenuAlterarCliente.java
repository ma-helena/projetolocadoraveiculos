package projetolocadoraveiculos.view.cliente;

import projetolocadoraveiculos.business.GerenciadorDeCliente;
import projetolocadoraveiculos.model.Cliente;
import projetolocadoraveiculos.model.TipoCliente;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

public class MenuAlterarCliente extends MenuAbstrato {

    private final GerenciadorDeCliente gerenciadorDeCliente;

    public MenuAlterarCliente(GerenciadorDeCliente gerenciadorDeCliente) {
        super("Alterar cliente");
        this.gerenciadorDeCliente = gerenciadorDeCliente;
    }

    @Override
    public void acao() {
        String documento= CapturadorDeEntrada.capturarString("Documento do cliente a ser alterado");
        while ((!gerenciadorDeCliente.existeCliente(documento))){
            System.out.println("Cliente "+ documento+ " não existe");
            documento = CapturadorDeEntrada.capturarString("Documento do cliente a ser alterado");
        }

        Cliente cliente = gerenciadorDeCliente.buscarClientePorId(documento);

        gerenciadorDeCliente.removerCliente(cliente);

        String nome = CapturadorDeEntrada.capturarString("Informe o nome do cliente");

        TipoCliente tipoCliente = MenuTipoCliente.capturarTipoCliente();

        cliente = gerenciadorDeCliente.criarCliente(nome, documento, tipoCliente);

        System.out.println("Cliente alterado com sucesso");
        System.out.println("Cliente: " + cliente);
    }
}
