package JavaZaawansowana;

/*
Klasa Student
Zaimplementuj klasę Student . Klasa ta powinna rozszerzać klasę Person .
Dodatkowo powinna zawierać:
trzy pola: typ studiów, rok studiów, koszt studiów
konstruktor z trzema parametrami: typ studiów, rok studiów, koszt studiów
metody typu getter dla zdeklarowanych pól
metody typu setter dla zdeklarowanych pól
metoda toString wyświetlająca szczegółowe informacje o studencie
 */


public class Student extends Person {

    private String studyType;
    private int year;
    private double price;

    public Student(String name, String address, String studyType, int year, double price) {
        super(name, address);
        this.studyType = studyType;
        this.year = year;
        this.price = price;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(byte year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getName() + "->" + getAddress()+'\'' +
                "studyType='" + studyType + '\'' +
                ", year=" + year +
                ", price=" + price;
    }
}