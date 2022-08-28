package OOP.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        Gerente ger = new Gerente("Maycon",10000);
        Desenvolvedor des = new Desenvolvedor("James", 6000);
        System.out.println(ger);
        System.out.println(des);
        des.Imprime();                                             
        
    }
}
