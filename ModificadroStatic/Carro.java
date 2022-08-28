package OOP.ModificadroStatic;

import javax.print.attribute.PrintServiceAttribute;

public class Carro {
    private String Nome;
    private int Velocidade;
    private static int VelMax;

    public Carro(String Nome, int Velocidade){
       this.Nome = Nome;
       this.Velocidade = Velocidade;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
    public void setVelociadade(int velocidade) {
        Velocidade = velocidade;
    }
    public String getNome() {
        return Nome;
    }
    public int getVelocidade() {
        return Velocidade;
    }

    public void Imprime(){
        System.out.println("--------");
        System.out.println("Nome: "+this.Nome);
        System.out.println("Velocidade: "+this.Velocidade);
        System.out.println("VelMáx: "+Carro.VelMax);
    }

    public static void setVelMax(int velMax) {
        Carro.VelMax = velMax;
    }

    public static int getVelMax() {
        return Carro.VelMax;
    }
}
