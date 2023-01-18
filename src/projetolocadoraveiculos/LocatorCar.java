package projetolocadoraveiculos;

import projetolocadoraveiculos.persistence.AgenciaEmMemoriaRepository;
import projetolocadoraveiculos.persistence.AgenciaRepository;
import projetolocadoraveiculos.persistence.ClienteEmMemoriaRepository;
import projetolocadoraveiculos.view.Menu;
import projetolocadoraveiculos.view.MenuGeralFactory;
import projetolocadoraveiculos.view.agencia.MenuAgenciasFactory;

//incompleto - precisa ser trabalhado
public class LocatorCar {
    public static void main(String[] args) {
        AgenciaRepository agenciaRepository = new AgenciaEmMemoriaRepository();


    }
    ClienteEmMemoriaRepository clienteEmMemoriaRepository = new ClienteEmMemoriaRepository();

//    MenuAgenciasFactory menuAgenciasFactory = new MenuAgenciasFactory(gerenciadorDeAgencia);
//    Menu menuGeral = new MenuGeralFactory(menuAgenciasFactory).create();
//    //menuGeral.agir();
}
