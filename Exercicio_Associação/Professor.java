package OOP.Exercicio_Associação;

public class Professor {
    private String Nome;
    private String Especialidade;
    private Seminário Semi[];

    public Professor(String Nome,String Especialidade, Seminário semi[]){
            this.Nome = Nome;
            this.Especialidade = Especialidade;
            this.Semi = semi;
    }

    public Professor(String Nome,String Especialidade){
        this.Nome = Nome;
        this.Especialidade = Especialidade;
}

    public void setEspecialidade(String especialidade) {
        Especialidade = especialidade;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setSemi(Seminário[] semi) {
        Semi = semi;
    }

    public String getEspecialidade() {
        return Especialidade;
    }
    public String getNome() {
        return Nome;
    }
    public Seminário[] getSemi() {
        return Semi;
    }

    public void Imprime(){
        System.out.println("Professor: "+this.Nome);
        System.out.println("########## Seminários #########");
        for (Seminário seminário : Semi) {
            System.out.println(seminário.getTitulo());
            System.out.println(seminário.getLoc().getEndereço());
            System.out.println("######### Alunos ##########");
            for (Aluno aluno : seminário.getAlunos()) {
                    System.out.println(aluno.getNome());
            }
        }
    }


}
