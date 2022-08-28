package OOP.Enum;

public enum tipo_Pagamento{
    CREDITO{
        @Override
        public double Calcula(double valor) {
            return valor * 0.1;
        }
    },
    DEBITO{
        @Override
        public double Calcula(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double Calcula(double valor);
}