package OOP.ClassesAbstratas;

public class Gerente extends Funcionario{


    public Gerente(String Nome,double Salario){
        super(Nome,Salario);
    }
    public String getNome() {
        return Nome;
    }

    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Nomde do gerente: %s\nSalário: %f", this.Nome,this.Salario);
    }
    @Override
    public void CalculaBonus() {
        this.Salario= Salario + Salario *0.2;        
    }
    @Override
    public void imprime() {
        // TODO Auto-generated method stub
        
    }
  
}
