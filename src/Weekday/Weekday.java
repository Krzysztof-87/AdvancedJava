package Weekday;
/*
Zadanie 1
Stwórz klasę enum Weekday ze stałymi MONDAY , TUESDAY , ... SUNDAY . Enum
powinien zawierać metody boolean isWeekDay oraz boolean isHoliday .
Metoda isHoliday powinna zwracać rezultat przeciwny od rezultuatu
wywołania metody isWeekDay . Dodatkowo w ramach klasy enum powinna być
zadeklarowana i zaimplementowana metoda whichIsGreater . Metoda ta
powinna przyjmować obiekt typu Weekday . Metoda ta powinna wyświetlać
informacje o tym, że wskazany dzień tygodnia jest poprzednikiem bądź
następnikiem dnia tygodnia przekazanego w argumencie. W tym celu skorzystaj
z metody compareTo .
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie
 */

public enum Weekday {

    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    public boolean isWeekday(){
        return this !=Saturday&& this!=Sunday;
    }

    public boolean isHoliday() {
        return !isWeekday();
    }


    public void whichIsGreater(Weekday weekday){
        if (this.ordinal()>weekday.ordinal()){
            System.out.println("AFTER "+weekday);
        }else
            System.out.println("BEFORE "+weekday);
    }

}
