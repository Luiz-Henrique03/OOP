package OOP.Herança;

public class Main {
    public static void main(String[] args) {
        Endereço end = new Endereço("81930150", "Rua Humberto Negrello");
        Pessoa p = new Pessoa("Luiz", "131-616-600", end);
        p.Imprime();

        Funcionário f = new Funcionário("José","131414",end);
          
   
        f.setSalario(500d);
        System.out.println("------------------------------------------------------");
        f.Imprime();
        f.RelatorioSalario();
    }
}
