package OOP.Polimorfismo.Teste;

import OOP.Polimorfismo.Dominio.Computador;
import OOP.Polimorfismo.Dominio.Tomate;
import OOP.Polimorfismo.Serviço.CalcularImposto;

public class Main {
    public static void main(String[] args) {
        Computador comp = new Computador("Desktop 1010-i7",1110);
        Tomate tomate = new Tomate("Tomate siciliano", 5);

        CalcularImposto.CalcularImpostoCompuador(comp);
        CalcularImposto.CalcularImpostotomate(tomate);
    }
}
