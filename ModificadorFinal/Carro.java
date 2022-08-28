package OOP.ModificadorFinal;

public class Carro {
    private String Nome;
    private final int VELMAX = 350;
    public final Comprador COMPRADOR = new Comprador();

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Nome: %s, VelMax: %d, Comprador: %s", this.Nome,this.VELMAX,this.COMPRADOR.getNome());
    }

    public final void imprime(){
        System.out.println(this.Nome);
    }
}
