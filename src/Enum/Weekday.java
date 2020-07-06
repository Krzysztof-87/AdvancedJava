package Enum;
/*
Stwórz klasę enum Weekday ze stałymi MONDAY , TUESDAY , ... SUNDAY . Enum
powinien zawierać metody boolean isWeekDay oraz boolean isHoliday .
Metoda isHoliday powinna zwracać rezultat przeciwny od rezultuatu
wywołania metody isWeekDay . Dodatkowo w ramach klasy enum powinna być
zadeklarowana i zaimplementowana metoda whichIsGreater . Metoda ta
powinna przyjmować obiekt typu Weekday . Metoda ta powinna wyświetlać
informacje o tym, że wskazany dzień tygodnia jest poprzednikiem bądź
następnikiem dnia tygodnia przekazanego w argumencie. W tym celu skorzystaj
z metody compareTo .
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.
 */

public enum Weekday {

    Monday("1"),
    Tuesday("2"),
    Wednesday("3"),
    Thursday("4"),
    Friday("5"),
    Saturday("6"),
    Sunday("7");

    private String description;

    Weekday(String description) {
        this.description = description;
    }

    public boolean isWeekDay() {
     return this !=Saturday && this!=Sunday;
    }

    public boolean isHoliday(Weekday weekday){
        return this ==Sunday ||this==Saturday;
    }

    public void whichIsGreater(Weekday weekday){
        if (this.ordinal()<weekday.ordinal()){

        }
    }

}
