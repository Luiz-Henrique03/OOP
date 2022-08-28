package OOP.Exercicio_Funcionario;

public class Funcionario {
    
    public String Nome;
    public int Idade;
    public double [] Salario;
    
    public void Imprime(){
        System.out.printf("Nome:%s; Idade:%d\n",this.Nome,this.Idade);
        for (double d : Salario) {
            System.out.println(d);
        }
    }

    public double Media(double... args){
        double soma = 0.0d;
         for (double i : args) {
             soma+=i;
         }
         return  soma/args.length;
    }
}
