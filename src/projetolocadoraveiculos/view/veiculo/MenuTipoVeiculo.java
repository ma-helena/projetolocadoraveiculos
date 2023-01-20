package projetolocadoraveiculos.view.veiculo;

import projetolocadoraveiculos.model.TipoVeiculo;
import projetolocadoraveiculos.model.TipoVeiculoEnum;
import projetolocadoraveiculos.view.CapturadorDeEntrada;

public class MenuTipoVeiculo {

    public static TipoVeiculo capturarTipoVeiculo() {
        System.out.println("Informe o tipo do veículo: ");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Caminhão");

        String tipoVeiculoInput = CapturadorDeEntrada.capturarString("Informe o número da opção: ");

        while(!(tipoVeiculoInput.equals("1") || tipoVeiculoInput.equals("2") || tipoVeiculoInput.equals("3"))) {
            
            System.out.println("Oopção inválida!");

            System.out.println("Informe o tipo do veículo: ");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Caminhão");

            tipoVeiculoInput = CapturadorDeEntrada.capturarString("Informe o número da opção: ");
        }
        TipoVeiculo tipoVeiculo;

        if(tipoVeiculoInput.equals("1")) {
           tipoVeiculo = new TipoVeiculo(TipoVeiculoEnum.CARRO);
        }
        else if(tipoVeiculoInput.equals("2")) {
            tipoVeiculo = new TipoVeiculo(TipoVeiculoEnum.MOTO);
        }
        else{
        tipoVeiculo = new TipoVeiculo(TipoVeiculoEnum.CAMINHAO);
        }
        return tipoVeiculo;
    }
}
