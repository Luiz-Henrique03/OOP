package OOP.Exercicio_Funcionario;

public class FuncTEst {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.Nome = "José";
        func.Idade = 20;
        func.Salario = new double[] {1000,2500,3000};


        func.Imprime();
        System.out.println(func.Media(func.Salario));

    }
}
