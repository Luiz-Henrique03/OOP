package OOP.Herança;

public class Funcionário extends Pessoa {
    
    private Double Salario;

    public void setSalario(Double salario) {
        Salario = salario;
    }
    public Double getSalario() {
        return Salario;
    }

    public Funcionário(String Nome, String cpf, Endereço end){
        super(Nome, cpf,end);
    }

    @Override
    public void Imprime() {
        // TODO Auto-generated method stub
        super.Imprime();
        System.out.println(this.Salario);
    }

    public void RelatorioSalario(){
        System.out.println("Eu "+this.Nome+" recebi: "+this.Salario);
    }
}
