package OOP;
import java.util.*;

public class MainCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1,num2;
        Calculadora calc = new Calculadora();
        System.out.println("Digite 2 numeros: ");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();

        System.out.println("Soma: "+calc.Soma(num1, num2));
        System.out.println("Subtração: "+calc.Subtracao(num1, num2));
        System.out.println("Mulplicação: "+calc.Multiplicacao(num1, num2));
        System.out.println("Divisao: "+calc.Divisao(num1, num2));
        
        
       
    }
}
