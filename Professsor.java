package OOP;

public class Professsor {
    public String Nome;
    public int Idade;
    public char Sexo;

    @Override
    public String toString() {
        
        return String.format("Nome:%s; Idade:%d; Sexo:%s", this.Nome, this.Idade, this.Sexo);
    }
}
