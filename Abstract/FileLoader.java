package OOP.Abstract;

public class FileLoader implements DataLoader,DataRemove {

    @Override
    public void Load() {
        System.out.println("Dados do arquivo.......");
        
    }

    @Override
    public void Remove() {
        System.out.println("Removendo do arquivo...........");
        
    }

    @Override
    public void Check() {
        System.out.println("checando do arquivo...........");
    }
    
}
