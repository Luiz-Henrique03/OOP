package OOP;

public class Estudante {
    public String Nome;
    public int Idade;
    public char Sexo;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Nome: %s; Idade:%d; Sexo:%s; ", this.Nome,this.Idade,this.Sexo);
    }
}
