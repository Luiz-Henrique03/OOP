package OOP.Exercicio_Associação;

public class Seminário {
    private String titulo;
    private Aluno alunos[];
    private Local loc;

    public Seminário(String titulo, Aluno alunos[], Local loc){
        this.titulo = titulo;
        this.alunos = alunos;
        this.loc = loc;
    }

    public Seminário(String titulo, Local loc){
        this.titulo = titulo;
        this.loc = loc;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setLoc(Local loc) {
        this.loc = loc;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }
    public Local getLoc() {
        return loc;
    }
    public String getTitulo() {
        return titulo;
    }
}
