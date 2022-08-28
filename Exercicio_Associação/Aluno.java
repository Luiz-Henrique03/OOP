package OOP.Exercicio_Associação;

public class Aluno {
    private String Nome;
    private int idade;
    private Seminário semi;

    public Aluno(String Nome, int idade,Seminário semi){
        this.Nome = Nome;
        this.idade = idade;
        this.semi = semi;
    }

    public Aluno(String Nome, int idade){
        this.Nome = Nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSemi(Seminário semi) {
        this.semi = semi;
    }

    public Seminário getSemi() {
        return semi;
    }

    public String getNome() {
        return Nome;
    }

    
}
