package OOP.ModificadroStatic;

public class Main {
  public static void main(String[] args) {
    Carro C1 = new Carro("Monza", 180);
    Carro C2 = new Carro("Ferrari Roma", 300);
    Carro C3 = new Carro("Mercedes", 220);

    Carro.setVelMax(190);
    C1.Imprime();
    C2.Imprime();
    C3.Imprime();
    
  }
    

}
