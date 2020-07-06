package CardGame;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class GameCreator {

    private ArrayList<Card>deck;   // talia kard   - metoda create deck tworzy talie kart
    private ArrayList<ArrayList<Card>>playersCards;  // lista list do przechowywania kart wszystkich graczy w momencie rozdania
    private ArrayList<Card>firstPlayer;  // karty pierwszego gracza
    private ArrayList<Card>secondPlayer;  // karty drugiego gracza
    private ArrayList<Card>stack;    // stos kart na ktory zrzucamy karty z reki


    public ArrayList<Card> getFirstPlayer() {
        return firstPlayer;
    }

    public ArrayList<Card> getStack() {
        return stack;
    }

    public ArrayList<Card> getSecondPlayer() {
        return secondPlayer;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }


    public void Distribution(){    // glowna metoda
        firstPlayer= new ArrayList<>();
        secondPlayer= new ArrayList<>();
        stack= new ArrayList<>();
        createGame();
        createFirstStackCard();
        firstPlayer=playersCards.get(0);
        secondPlayer=playersCards.get(1);

    }

    private void createGame(){  //  a nastepnie w zaleznosci od tego ilu graczy gra to tyle razy przejdzie po petli i wywolujac
        createDeck();  //wywoluje metode to stworzenia tali kart
        Scanner input = new Scanner(System.in);
        System.out.println("Indicate number of player:");
        int numbersOfPlayers=input.nextInt();
        playersCards = new ArrayList<>();     // inicjuje liste list
        for (int i=1; i<=numbersOfPlayers;i++) {
            ArrayList<Card>cards=createCardsForPlayer(5);  // za pomoca metody createCardsForPlayer, tworzy w petli liste kart dla gracza i zapisuje je w liscie list
            playersCards.add(cards);

        }

    }

    private void createDeck() {
        deck= new ArrayList<>();
            for (Rank rank : Rank.values()) {
                for (Suit suit : Suit.values()) {
                    Card card = new Card(suit, rank);
                    deck.add(card);
                }
            }
        }

    private ArrayList<Card> createCardsForPlayer(int numbersOFCards) {   // karty losowane z talli kart po kazdym wylosowaniu karty, zostaje ona usunieta z tali.
        ArrayList<Card> temp = new ArrayList<>();
        for (int i=0; i<numbersOFCards;i++) {
            Random random = new Random();
            int cardFromDeck = random.nextInt(deck.size() - i);
            Card card = deck.get(cardFromDeck);
            temp.add(card);
            deck.remove(card);

        }

        return temp;

    }

    public Card getOnecardFromDeck(){         // meotda losuje jedna karte z tali jest kart nie ma na rece zadnej karty, ktorej moglby sie pozbyc
        Random random = new Random();
        int cardFromDeck=random.nextInt(deck.size());
        Card card= deck.get(cardFromDeck);

        return card;
    }

    public void createFirstStackCard() {     // metoda losuje z talii pierwsza karte, ktora znajdzie sie na stosie do zrzucania kart
        Random random = new Random();
        Card card;
        do {
            int cardFromDeck = random.nextInt(deck.size());
            card = deck.get(cardFromDeck);
        }while(card.getRank()== Rank.Two||card.getRank()== Rank.Three||card.getRank()==Rank.Four||  // karta nie moze byc funkcyjna
                (card.getRank()==Rank.King&&card.getSuit()==Suit.Diamond)||
               (card.getRank()==Rank.King&&card.getSuit()==Suit.Spade ));
        stack.add(card);
        deck.remove(card);

    }




}
