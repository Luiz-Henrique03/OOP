package OOP.Polimorfismo.Dominio;

public abstract class Produto implements Taxavel {
    protected String Nome;
    protected double Valor;

    public Produto(String Nome, double Valor){
        this.Nome = Nome;
        this.Valor = Valor;
    }

    public String getNome() {
        return Nome;
    }

    public double getValor() {
        return Valor;
    }

}
