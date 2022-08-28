package OOP.Enum;

public class Cliente {
    private String nome;
    private TipoCliente tipocliente;



    private tipo_Pagamento tipo_pagamento;

    public Cliente(String Nome, TipoCliente tpcliente, tipo_Pagamento tpPag){
        this.nome = Nome;
        this.tipocliente = tpcliente;
        this.tipo_pagamento = tpPag;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipocliente(TipoCliente tipocliente) {
        this.tipocliente = tipocliente;
    }

    public String getNome() {
        return nome;
    }
    public TipoCliente getTipocliente() {
        return tipocliente;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\n Tipo de cliente: %s\n Tipo de pagamento: %s\nTipo de pagamentoINT: %d\n\n", this.nome, this.tipocliente,this.tipo_pagamento,this.tipocliente.VALOR);
    }
    
}
