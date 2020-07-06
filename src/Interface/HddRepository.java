package Interface;

public class HddRepository implements Repository {


    public void loadData(){
        System.out.println("wczytuje dane z dysku");
    }

    public void saveData(){
        System.out.println("zapisuje dane aplikacji na dysku");
    }

}
