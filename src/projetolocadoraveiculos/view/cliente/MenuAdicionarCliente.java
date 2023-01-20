package projetolocadoraveiculos.view.cliente;

import projetolocadoraveiculos.business.GerenciadorDeCliente;
import projetolocadoraveiculos.business.GerenciadorTipoCliente;
import projetolocadoraveiculos.model.Cliente;
import projetolocadoraveiculos.model.TipoCliente;
import projetolocadoraveiculos.view.CapturadorDeEntrada;
import projetolocadoraveiculos.view.MenuAbstrato;

import java.util.List;
import java.util.stream.Collectors;

public class MenuAdicionarCliente extends MenuAbstrato {


    private final GerenciadorDeCliente gerenciadorDeCliente;
    private final GerenciadorTipoCliente gerenciadorTipoCliente;

    public MenuAdicionarCliente(GerenciadorDeCliente gerenciadorDeCliente, GerenciadorTipoCliente gerenciadorTipoCliente) {
        super("Adicionar Cliente");
        this.gerenciadorDeCliente = gerenciadorDeCliente;
        this.gerenciadorTipoCliente = gerenciadorTipoCliente;
    }

    @Override
    protected void acao() {
        String documento = CapturadorDeEntrada.capturarString("documento do novo cliente");

        if (gerenciadorDeCliente.existeCliente(documento)) {
            System.out.println("Já existe cliente com o documento " + documento);
            return;
        }

        String nome = CapturadorDeEntrada.capturarString("nome do novo cliente");
        List<TipoCliente> todosTiposClientes = gerenciadorTipoCliente.listarTodosOsTiposDeCliente();

        List<String> listaDescricaoDeTodosOsTiposDeClientes =
                todosTiposClientes.stream()
                        .map(TipoCliente::getId)
                        .collect(Collectors.toList());

        String descricaoTipoDeCliente = CapturadorDeEntrada.capturarStringDentreAsPossiveis("tipo de cliente", listaDescricaoDeTodosOsTiposDeClientes);
        TipoCliente tipoCliente = gerenciadorTipoCliente.buscarTipoCliente(descricaoTipoDeCliente);

        if (tipoCliente == null) {
            System.out.println("Tipo de cliente %s inválido, tente novamente mais tarde.".formatted(descricaoTipoDeCliente));
            return;
        }

        Cliente novoCliente = gerenciadorDeCliente.adicionarCliente(documento, nome, tipoCliente);
        System.out.println("Novo cliente adicionado:");
        System.out.println(novoCliente);
    }
}
