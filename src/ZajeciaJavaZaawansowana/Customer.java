package ZajeciaJavaZaawansowana;
/*
Zadanie 1.
Stwórz nowy pakiet, a w nim klasę Klient. Klienci w tym programie mogą mieć różne imiona, wiek oraz mogą być
 Klientem premium lub nie. Stwórz dla nich pola odpowiedniego typu. W klasie KlientDemo (zawierającej metodę main)
 stwórz trzy obiekty typu Klient. Ustaw tym obiektom różne imiona, oraz wiek. Zaimplementuj dla Klientów odpowiednie
 zachowania (niestatyczne metody) i przetestuj je w klasie KlientDemo:

String podajDane( ) - metoda zwraca dane obiektu w formie tekstu np: “Osoba: Imię: Jan, wiek: 27, premium: true” ,
void wyprawUrodziny( ) - metoda wyświetla, że dana osoba obchodzi urodziny oraz zwiększa jej wiek o 1,
void zmienImie(String) - metoda pozwala zmienić imię osoby,
boolean czyJestKlientemPremium( ) - metoda zwraca odpowiednią wartość boolean,
void awansujDoKlientaPremium( ) - metoda zmienia stan obiektu na odpowiedni,

 */


public class Customer {

    private String name;
    private int age;
    private boolean premium;

    public Customer() {
    }

    public Customer(String name, int age, boolean premium) {
        this.name = name;
        this.age = age;
        this.premium = premium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public void podajDane(){
        System.out.println("Osoba: Imie: "+name+" wiek "+age+" premium "+premium);
    }

    public void wyprawUrodziny(){
        System.out.println(name+" obchodzi swoje urodziny");
        age++;
    }

    public void zmienImie(String n){
        name=n;
    }

    public boolean czyJestKlientemPremium(){
        return premium;
    }

    public void awansujDoKlientaPremium(){
        if (!premium){
            premium=true;
        }
    }

}
