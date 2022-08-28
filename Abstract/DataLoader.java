package OOP.Abstract;

public interface DataLoader {
    void Load();
    default void Check(){
       
    }

    static void Static_Met(){
        System.out.println("Hui interface");
    }
}
