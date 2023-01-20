package projetolocadoraveiculos.view.cliente;

import projetolocadoraveiculos.business.GerenciadorDeCliente;
import projetolocadoraveiculos.model.Cliente;
import projetolocadoraveiculos.model.TipoCliente;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

import java.util.Objects;

public class MenuAdicionarCliente extends MenuAbstrato{
   private final GerenciadorDeCliente gerenciadorDeCliente;

    public MenuAdicionarCliente(GerenciadorDeCliente gerenciadorDeCliente) {
        super("Adicionar cliente");
        this.gerenciadorDeCliente = gerenciadorDeCliente;
    }

    @Override
    public void acao() {
        String documento = CapturadorDeEntrada.capturarString("Informe numero do documento");
        while ((gerenciadorDeCliente.existeCliente(documento))){
            System.out.println("Cliente com numero de documento "+ documento+ " ja existe");
            documento = CapturadorDeEntrada.capturarString("Informe numero do documento");
        }

        String nome = CapturadorDeEntrada.capturarString("Informe o nome do cliente");

        TipoCliente tipoCliente = MenuTipoCliente.capturarTipoCliente();

        Cliente cliente = gerenciadorDeCliente.criarCliente(nome, documento, tipoCliente);

        System.out.println("Cliente adicionado com sucesso");
        System.out.println("Novo cliente: " + cliente.toString());
    }
}



