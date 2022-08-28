package OOP.Enum;

import OOP.Enum.tipo_Pagamento;

public class main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Marcio",TipoCliente.PESSOA_FISICA,tipo_Pagamento.CREDITO);
        Cliente c2 = new Cliente("Lucas",TipoCliente.PESSOA_JURIDICA,tipo_Pagamento.DEBITO);
        System.out.println(c1);
        System.out.println(tipo_Pagamento.DEBITO.Calcula(500));

        
    }
}
