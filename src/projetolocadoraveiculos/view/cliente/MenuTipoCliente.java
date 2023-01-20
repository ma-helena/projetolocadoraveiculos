package projetolocadoraveiculos.view.cliente;

import projetolocadoraveiculos.model.TipoCliente;
import projetolocadoraveiculos.model.TipoClienteEnum;
import projetolocadoraveiculos.view.CapturadorDeEntrada;

public class MenuTipoCliente {
    public static TipoCliente capturarTipoCliente() {
        System.out.println("Informe o tipo do cliente");
        System.out.println("1 - PESSOA FISICA");
        System.out.println("2 - PESSOA JURIDICA");

        String tipoClienteInput = CapturadorDeEntrada.capturarString("Informe o numero da opção");

        while (!(tipoClienteInput.equals("1") || tipoClienteInput.equals("2"))){
            System.out.println("Opção inválida");
            System.out.println("Informe o tipo do cliente");
            System.out.println("1 - PESSOA FISICA");
            System.out.println("2 - PESSOA JURIDICA");
            tipoClienteInput = CapturadorDeEntrada.capturarString("Informe o numero da opção");
        }

        TipoCliente tipoCliente;

        if (tipoClienteInput.equals("1")) tipoCliente = new TipoCliente(TipoClienteEnum.PF);
        else tipoCliente = new TipoCliente(TipoClienteEnum.PF);

        return tipoCliente;
    }
}
