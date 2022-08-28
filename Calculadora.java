package OOP;

public class Calculadora {
    
    public double Soma(float Num1,float Num2){
        return Num1 + Num2;
    }

    public double Subtracao(float Num1,float Num2){
        return Num1 - Num2;
    }

    public double Multiplicacao(float Num1,float Num2){
        return Num1 * Num2;
    }

    public double Divisao(float Num1,float Num2){
        if(Num2 == 0){
            return 0;
        }
        return Num1 / Num2;
    }
}
