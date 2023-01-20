package projetolocadoraveiculos.view;

import java.util.List;
import java.util.Scanner;

public class CapturadorDeEntrada  {

    private static final Scanner scanner = new Scanner(System.in);

    public static String capturarString(String nomeCampo) {
        System.out.print("Informar o %s: ".formatted(nomeCampo));
        String entrada = scanner.nextLine();
        return entrada;
    }

    public static String capturarStringDentreAsPossiveis(String nomeCampo, List<String> possibilidades) {
        String entrada = capturarString(nomeCampo + ", [%s]".formatted(possibilidades));
        while (!possibilidades.contains(entrada)) {
            System.out.println("Não é uma entrada válida, somente os valores [%s] são aceitos.".formatted(possibilidades));
            entrada = capturarString(nomeCampo + ", [%s]".formatted(possibilidades));
        }

        return entrada;
    }
}
