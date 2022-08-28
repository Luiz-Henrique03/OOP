package OOP.Abstract;

public class Main {
    public static void main(String[] args) {
        DatabaseLoader dtbLoader = new DatabaseLoader();
        FileLoader fLoader = new FileLoader();
        dtbLoader.Load();
        fLoader.Load();

        dtbLoader.Remove();
        fLoader.Remove();

        dtbLoader.Check();
        fLoader.Check();

        dtbLoader.Static_Met();
    }
}
