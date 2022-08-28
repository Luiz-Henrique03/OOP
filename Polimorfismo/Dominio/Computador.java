package OOP.Polimorfismo.Dominio;

public class Computador extends Produto{

    public final double IMPOSTO = 0.21;

    public Computador(String Nome, double Valor) {
        super(Nome, Valor);
    }

    @Override
    public double CalcularImposto() {
        System.out.println("Calculando imposto do computador");
        return this.Valor * IMPOSTO;
        
    }
    
}
