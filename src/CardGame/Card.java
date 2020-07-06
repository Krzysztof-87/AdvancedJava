package CardGame;
/*Stwórz obiekt typu Karta (Card). Kartę będą opisywać dwa pola klas enumowych Rank(Ranga np. dziewiątka, as) oraz Suit (Kolor - np. pik).
Stwórz dwie dowolne karty w mainie, różniące się rangą i kolorem, zaprezentuj je wykorzystując nadpisaną metodę toString.
W mainie wyświetl wszystkie możliwe rangi wykorzystując statyczną metodę enumów - values().
Każda z rang ma mieć przypisaną siłę, dla dwójki 2, trójki 3 itd.
Obiekty kart mają mieć metodę pozwalającą na pobranie siły karty. Stwórz dodatkowy serwis pozwalający porównać dwie karty, drukujący tą która jest większa i zwracający ją.
Stwórz listę wszystkich możliwych rang w kolorze pik. (wykorzystaj pętle dla automatyzacji zadania)
Stwórz całą talię, czyli listę wszystkich możliwych rang dla wszystkich możliwych kolorów.

 */


public class Card {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card() {
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    public int cardStrength(){
        return rank.getPower();
    }


}
