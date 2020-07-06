package CarService;
/*Zadanie 1.
W programie zrealizuj następujący scenariusz: Samochód ma koła, a ich opony mają ustalone ciśnienie i mogą być przebite.
  Warsztat może przyjmować samochód żeby go naprawić. W klasie WarsztatDemo stwórz samochód z czterema kołami oraz  warsztat.
   Następnie tworząc i wywołując odpowiednie metody zasymuluj następujące zdarzenia:
samochód łapie gumę w losowym kole,
warsztat przyjmuje samochód do naprawy,
warsztat sprawdza stan kół i wymienia przebite opony,
warsztat po wykonaniu usługi drukuje ile kół wymienił i ile będzie to kosztowało.

 */

public class Wheel {
    private static final double CORRECT_PRESSURE=2.2;

    private boolean flat = false;
    private double pressure =CORRECT_PRESSURE;


    public boolean isFlat() {
        return flat;
    }

    public void puncture() {
        flat=true;
        pressure*=0.1;
    }

    public void repair(){
        flat=false;
        pressure=CORRECT_PRESSURE;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "flat=" + flat +
                ", pressure=" + pressure +
                '}';
    }
}
