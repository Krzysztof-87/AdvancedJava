package JavaZaawansowana;

/*
Klasa Staff
Zaimplementuj klasę Lecturer . Klasa ta powinna rozszerzać klasę Person .
Dodatkowo powinna zawierać:
dwa pola: specjalizacja oraz wynagrodzenie
konstruktor z dwoma parametrami: specjalizacja, wynagrodzenie
metody typu getter dla zdeklarowanych pól
metody typu setter dla zdeklarowanych pól
metodę toString wyświetlającą szczegółowe informacje o wykładowcy
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.
 */

import JavaZaawansowana.Person;

public class Staff extends Person {

    private String specialization;
    private double salary;

    public Staff(String name, String address, String specialization, double salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getName() + "->" + getAddress()+'\'' +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary;
    }
}
