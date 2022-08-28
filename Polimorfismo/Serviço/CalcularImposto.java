package OOP.Polimorfismo.Serviço;

import OOP.Polimorfismo.Dominio.Computador;
import OOP.Polimorfismo.Dominio.Tomate;

public class CalcularImposto {
    
    public static void CalcularImpostoCompuador(Computador comp){
        double imposto = comp.CalcularImposto();
        System.out.println("Nome computador: "+comp.getNome());
        System.out.println("valor computador: "+comp.getValor());
        System.out.println("Imposto: "+imposto);
    }
    public static void CalcularImpostotomate(Tomate tom){
        double imposto = tom.CalcularImposto();
        System.out.println("Nome computador: "+tom.getNome());
        System.out.println("valor computador: "+tom.getValor());
        System.out.println("Imposto: "+imposto);
    }
}
