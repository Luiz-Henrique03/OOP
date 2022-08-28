package OOP.Exercicio_Associação;

public class Local {
    private String Endereço;
    private Seminário semi;

    public Local(String Endereço, Seminário semi){
        this.Endereço = Endereço;
        this.semi = semi;
    }

    public Local(String Endereço){
        this.Endereço = Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public void setSemi(Seminário semi) {
        this.semi = semi;
    }

    public String getEndereço() {
        return Endereço;
    }

    public Seminário getSemi() {
        return semi;
    }
}
