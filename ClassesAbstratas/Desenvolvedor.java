package OOP.ClassesAbstratas;

public class Desenvolvedor extends Funcionario{



    public Desenvolvedor(String Nome, double Salario) {
        super(Nome, Salario);
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Nomde do desenvolvedor: %s\nSalário: %f", Nome,Salario);
    }

    @Override
    public void CalculaBonus() {
        this.Salario= Salario + Salario *0.05;
    }

    @Override
    public void imprime() {
        // TODO Auto-generated method stub
        
    }
    
}
