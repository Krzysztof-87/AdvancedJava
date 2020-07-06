package Interface;

/*
Stwórz nową klasę CloudRepository, która będzie zapisywać dane w wirtualnej chmurze.
 Przestaw działanie aplikacji tak, żeby korzystała z tej nowej implementacji
 */

public class CloudRepository  implements Repository{


    @Override
    public void loadData() {
        System.out.println("wczytuje dane z chmury");

    }

    @Override
    public void saveData() {
        System.out.println("Zapisuje dane na chmurze");

    }
}
