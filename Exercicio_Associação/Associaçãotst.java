package OOP.Exercicio_Associação;

public class Associaçãotst {
public static void main(String[] args) {
    Aluno al = new Aluno("João",18);
    Aluno al2 = new Aluno("Luiz",18);
    Professor pf = new Professor("Arleide", "Matemática");
    Local lc = new Local("Rua Pedro Parigot");
    Seminário sem = new Seminário("Inteligência Artifical", lc);
    Seminário seminários[] = {sem};

    

    Aluno alunos [] = {al,al2};

    pf.setSemi(seminários);

    sem.setAlunos(alunos);

    pf.Imprime();
}

}
