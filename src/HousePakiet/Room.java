package HousePakiet;
/*
Przerwij na chwilę pracę nad aplikacją samochodową aby poćwiczyć budowanie kompozycji obiektów.
Zrób osobny pakiet, w którym stworzysz następującą strukturę. Obiekt House posiada jedne drzwi i
 tablicę pokojów (obiekty Door i Room). Pokój posiada łóżko (Bed) oraz tablicę okien (Window).  Łóżko może być
 pościelone lub nie, a okno otwarte lub zamknięte.
	Zadbaj aby program realizował następujące stwierdzenia:
Aby stworzyć dom należy wstawić tablicę pokojów, a drzwi frontowe powinny utworzyć się automatycznie. Aby stworzyć pokój
należy podać ile ma mieć okien (okna mają tworzyć się automatycznie jako zamknięte), natomiast łóżko ma stworzyć się samo jako niepościelone.
W programie stwórz dom z dwoma pokojami, jeden z 2 oknami, a drugi, większy z 4.
W klasie House przygotuj metodę sprzątającą, której zadaniem będzie pootwieranie wszystkich okien oraz pościelenie łóżek.
Wykorzystaj metodę toString domu aby upewnić się, że metoda działa poprawnie.

 */

import java.util.Arrays;

public class Room {

    private Bed bed;
    private Window[] windows;

    public Room(int windowsQuantity){
        bed= new Bed();
        windows= new Window[windowsQuantity];
        for (int i = 0; i < windows.length; i++) {
            windows[i]=new Window();
        }
        }

    public void cleanRoom(){
        bed.makeBed();
        for (Window window : windows) {
            window.openWindow();
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", windows=" + Arrays.toString(windows) +
                '}';
    }
}
