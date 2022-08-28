package OOP.Herança;

public class Pessoa {
    protected String Nome;
    protected String cpf;
    protected Endereço end;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setEnd(Endereço end) {
        this.end = end;
    }

    public Pessoa(String Nome, String cpf, Endereço end){
         this.Nome = Nome;
         this.cpf = cpf;
         this.end = end;
    }


    public void Imprime(){
        System.out.println(this.Nome);
        System.out.println(this.cpf);
        System.out.println(this.end.getCep());
        System.out.println(this.end.getRua());
    }
}
