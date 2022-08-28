package OOP.Abstract;

public class DatabaseLoader implements DataLoader, DataRemove{

    @Override
    public void Load() {
        System.out.println("Dados do banco de dados.........");
        
    }

    @Override
    public void Remove() {
        System.out.println("Removendo do bacno de dados.............");
        
    }
    
    @Override
    public void Check() {
        System.out.println("Checandoarquivo..............");
    }

    static void Static_Met(){
        System.out.println("Hui Database loader");
    }
}
