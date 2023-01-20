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
        String nome= CapturadorDeEntrada.capturarString("nome do cliente a ser alterado");
        while ((!gerenciadorDeCliente.existeCliente(nome))){
            System.out.println("Cliente "+ nome+ " não existe");
            nome = CapturadorDeEntrada.capturarString("nome do cliente a ser alterado");
        }

        Cliente cliente = gerenciadorDeCliente.buscarClientePorNome(nome);

        gerenciadorDeCliente.removerCliente(cliente);

        String documento = CapturadorDeEntrada.capturarString("Informe numero do documento");
        while ((gerenciadorDeCliente.existeCliente(documento))){
            System.out.println("Cliente com numero de documento "+ documento+ " ja existe");
            documento = CapturadorDeEntrada.capturarString("Informe numero do documento");
        }

        nome = CapturadorDeEntrada.capturarString("Informe o nome do cliente");

        TipoCliente tipoCliente = MenuTipoCliente.capturarTipoCliente();

        cliente = gerenciadorDeCliente.criarCliente(nome, documento, tipoCliente);

        System.out.println("Cliente alterado com sucesso");
        System.out.println("Cliente: " + cliente);
    }
}
