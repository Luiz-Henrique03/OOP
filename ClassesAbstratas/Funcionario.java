package OOP.ClassesAbstratas;

public abstract class Funcionario extends Pessoa{
    protected String Nome;
    protected double Salario;

    public Funcionario(String Nome,double Salario){
        this.Nome = Nome;
        this.Salario = Salario;
        CalculaBonus();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Nomde do gerente: %s\nSalário: %f", this.Nome,this.Salario);
    }

    public void Imprime(){
        System.out.println("Imprimindo");
    }

    public abstract void CalculaBonus();
}
