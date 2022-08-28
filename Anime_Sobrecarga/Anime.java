package OOP.Anime_Sobrecarga;

public class Anime {
    
    private String Nome;
    private int Tamanho;
    private String Tipo;
    private int Edicao;
    
    
    public Anime(String Nome, int Tamanho, String Tipo){
        this.Nome = Nome;
        this.Tamanho = Tamanho;
        this.Tipo = Tipo;
    }

    public Anime(String Nome, int Tamanho, String Tipo,int Edicao){
        this(Nome, Tamanho, Tipo);
        this.Edicao = Edicao;
    }

    public void Imprime(){
        System.out.printf("%s %s %d %d",this.Nome,this.Tipo,this.Tamanho,this.Edicao);
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    public void setTamanho(int tamanho) {
        Tamanho = tamanho;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
