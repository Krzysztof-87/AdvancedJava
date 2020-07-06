package HousePakiet;

public class HouseDemo {

    public static void main(String[] args) {

        Room room1 = new Room(2);
        Room room2 = new Room(4);
        Room [] rooms = {room1, room2};


        House h1 = new House(rooms);
        System.out.println(h1);
        h1.clean();
        System.out.println(h1);
    }
}
