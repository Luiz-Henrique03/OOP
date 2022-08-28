package OOP.ModificadorFinal;

public class mainCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setNome("Ferrari");
        c1.COMPRADOR.setNome("Gerson");
        System.out.println(c1.toString());
        Ferrari f1 = new Ferrari();
        f1.setNome("Ferrari Portofino");
        f1.imprime();

    }

}
