package projetolocadoraveiculos;

import projetolocadoraveiculos.persistence.AgenciaEmMemoriaRepository;
import projetolocadoraveiculos.persistence.AgenciaRepository;
import projetolocadoraveiculos.persistence.ClienteEmMemoriaRepository;
//incompleto - precisa ser trabalhado
public class LocatorCar {
    public static void main(String[] args) {
        AgenciaRepository agenciaRepository = new AgenciaEmMemoriaRepository();


    }
    ClienteEmMemoriaRepository clienteEmMemoriaRepository = new ClienteEmMemoriaRepository();

}
