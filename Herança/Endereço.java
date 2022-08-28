package OOP.Herança;

public class Endereço {
    private String rua;
    private String cep;

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public Endereço(String cep, String rua){
        this.cep = cep;
        this.rua = rua;
    }
}
