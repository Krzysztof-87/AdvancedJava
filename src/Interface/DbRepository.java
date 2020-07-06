package Interface;

public class DbRepository  implements  Repository{


    public void loadData(){
        System.out.println("wczytuje dane z bazy");
    }

    public void saveData(){
        System.out.println("zapisuje dane w bazie danych");
    }

}
