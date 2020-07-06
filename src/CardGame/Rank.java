package CardGame;
/*Stwórz obiekt typu Karta (Card). Kartę będą opisywać dwa pola klas enumowych Rank(Ranga np. dziewiątka, as) oraz Suit (Kolor - np. pik).
Stwórz dwie dowolne karty w mainie, różniące się rangą i kolorem, zaprezentuj je wykorzystując nadpisaną metodę toString.
W mainie wyświetl wszystkie możliwe rangi wykorzystując statyczną metodę enumów - values().
Każda z rang ma mieć przypisaną siłę, dla dwójki 2, trójki 3 itd.
Obiekty kart mają mieć metodę pozwalającą na pobranie siły karty. Stwórz dodatkowy serwis pozwalający porównać dwie karty, drukujący tą która jest większa i zwracający ją.
Stwórz listę wszystkich możliwych rang w kolorze pik. (wykorzystaj pętle dla automatyzacji zadania)
Stwórz całą talię, czyli listę wszystkich możliwych rang dla wszystkich możliwych kolorów.

 */

public enum Rank {

    Two(2),
    Three(3),
    Four(4),
    Five(5),
    Six(6),
    Seven(7),
    Eight(8),
    Nine(9),
    Ten(10),
    Jack(10),
    Queen(10),
    King(5),  // zmienilem wartosc na 5, bo w przypadku krola pik albo dzwonek poprzedni lub kolejny gracz bierze 5 kart.
    Ace(10);

    private int power;

    Rank(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
