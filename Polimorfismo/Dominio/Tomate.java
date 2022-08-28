package OOP.Polimorfismo.Dominio;

public class Tomate extends Produto{

    public final double IMPOSTO =  0.10;
    public Tomate(String Nome, double Valor) {
        super(Nome, Valor);
    }
    
    @Override
    public double CalcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.Valor * IMPOSTO;
        
    }
}
