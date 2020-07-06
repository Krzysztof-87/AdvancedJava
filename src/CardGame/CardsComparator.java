package CardGame;



public class CardsComparator {

    private boolean flag;  // ustawiana jest na true jesli karta jest funkcyjna i pozniej w zaleznosci od jej wartosci
    // algorytm przechodzi albo do czesci w ktorej gracz bierze karty z talii jesli karta jest funkcyjna lub do czesci w ktorej zrzuca karty z reki jesli karta nie jest funkcyjna.
    private boolean isCardFunctionActive = true;   // jesli na stosie lezy karta funkcyjna ale jeden z graczy pociagnal juz odpowiednia dla niej liczbe kart to wartosc zmienia sie na false.
    private int howManyCardToBeTakenCounter = 0;  // do zliczania ile kart musi zostac zabranych przez uzytkownika z tali


    public void cardComparator(GameCreator gameCreator) throws InterruptedException {   // glowna metoda
        do {                                         // petla kreci sie do poki ktorys z graczy ma mniej niz 1 karte
            System.out.println("---");
            System.out.println(gameCreator.getFirstPlayer());
            System.out.println(gameCreator.getSecondPlayer());
            System.out.println(gameCreator.getStack());

            firstPlayer(gameCreator);
           // Thread.sleep(3000);

            System.out.println("---");
            System.out.println(gameCreator.getFirstPlayer());
            System.out.println(gameCreator.getSecondPlayer());
            System.out.println(gameCreator.getStack());


            secondPlayer(gameCreator);
            //Thread.sleep(3000);

        } while (gameCreator.getFirstPlayer().size() >= 1 || gameCreator.getSecondPlayer().size() >= 1);

        if (gameCreator.getFirstPlayer().size()<1){
            System.out.println("Wygral pierwszy gracz");
        }else if (gameCreator.getSecondPlayer().size()<1) {
            System.out.println("Wygrał drugi gracz");
        }

    }

    private void firstPlayer(GameCreator gameCreator) {
        for (int i = 0; i < gameCreator.getFirstPlayer().size(); i++) {

            if (isCardFunctionActive) {   // wchodzi tylko jesli karta lezaca na stosie ma dalej moc bycia funkcyjna
                howManyCardToBeTakenCounter = gameCreator.getStack().get(0).cardStrength(); // pobierana moc karty lezacej na stosie
                if (gameCreator.getStack().get(0).getRank() == Rank.Two) {    //przypadki gdy karta lezaca na stosie jest dwojka
                    flag = true;
                    if (gameCreator.getFirstPlayer().get(i).getRank() == Rank.Two    // jesli gracz ma karte, ktora moze przebic lezaca na stosie to:
                            || gameCreator.getFirstPlayer().get(i).getRank() == Rank.King && gameCreator.getFirstPlayer().get(i).getSuit() == Suit.Spade
                            || gameCreator.getFirstPlayer().get(i).getRank() == Rank.King && gameCreator.getFirstPlayer().get(i).getSuit() == Suit.Diamond) {
                        howManyCardToBeTakenCounter += gameCreator.getStack().get(0).cardStrength();// ta moc jest inkrementowana jesli gracz przebija funkcyjna karte.
                        gameCreator.getDeck().add(gameCreator.getStack().get(0)); //karta ze stosu przechodzi do tali
                        gameCreator.getStack().remove(gameCreator.getStack().get(0));// usuwamy karte bedaca na stosie
                        gameCreator.getStack().add(gameCreator.getFirstPlayer().get(i));// dodaje do stosu karte, ktora zrzuca gracz
                        gameCreator.getFirstPlayer().remove(gameCreator.getFirstPlayer().get(i));// usuwamy ta karte z kart gracza
                        return;
                    }
                } else if (gameCreator.getStack().get(0).getRank() == Rank.Three) {//przypadki gdy karta lezaca na stosie jest trojka
                    flag = true;
                    if (gameCreator.getFirstPlayer().get(i).getRank() == gameCreator.getStack().get(0).getRank() // jesli gracz ma karte, ktora moze przebic lezaca na stosie to:
                            || gameCreator.getFirstPlayer().get(i).getRank() == Rank.King && gameCreator.getFirstPlayer().get(i).getSuit() == Suit.Spade
                            || gameCreator.getFirstPlayer().get(i).getRank() == Rank.King && gameCreator.getFirstPlayer().get(i).getSuit() == Suit.Diamond) {
                        howManyCardToBeTakenCounter += gameCreator.getStack().get(0).cardStrength();
                        gameCreator.getDeck().add(gameCreator.getStack().get(0));
                        gameCreator.getStack().remove(gameCreator.getStack().get(0));
                        gameCreator.getStack().add(gameCreator.getFirstPlayer().get(i));
                        gameCreator.getFirstPlayer().remove(gameCreator.getFirstPlayer().get(i));
                        return;

                    }

                } else if (gameCreator.getStack().get(0).getRank() == Rank.King && gameCreator.getStack().get(0).getSuit() == Suit.Spade) {//przypadki gdy karta lezaca na stosie jest krolem pik
                    flag = true;
                    if (gameCreator.getFirstPlayer().get(i).getRank() == gameCreator.getStack().get(0).getRank()// jesli gracz ma karte, ktora moze przebic lezaca na stosie to:
                            && gameCreator.getFirstPlayer().get(i).getSuit() == Suit.Diamond) {
                        howManyCardToBeTakenCounter += gameCreator.getStack().get(0).cardStrength();
                        gameCreator.getDeck().add(gameCreator.getStack().get(0));
                        gameCreator.getStack().remove(gameCreator.getStack().get(0));
                        gameCreator.getStack().add(gameCreator.getFirstPlayer().get(i));
                        gameCreator.getFirstPlayer().remove(gameCreator.getFirstPlayer().get(i));
                        return;

                    }

                } else if (gameCreator.getStack().get(0).getRank() == Rank.King && gameCreator.getStack().get(0).getSuit() == Suit.Diamond) {//przypadki gdy karta lezaca na stosie jest krolem dzwonek
                    flag = true;
                    if (gameCreator.getFirstPlayer().get(i).getRank() == gameCreator.getStack().get(0).getRank()
                            && gameCreator.getFirstPlayer().get(i).getSuit() == Suit.Spade) {// jesli gracz ma karte, ktora moze przebic lezaca na stosie to:
                        howManyCardToBeTakenCounter += gameCreator.getStack().get(0).cardStrength();
                        gameCreator.getDeck().add(gameCreator.getStack().get(0));
                        gameCreator.getStack().remove(gameCreator.getStack().get(0));
                        gameCreator.getStack().add(gameCreator.getFirstPlayer().get(i));
                        gameCreator.getFirstPlayer().remove(gameCreator.getFirstPlayer().get(i));
                        return;
                    }

                }
            }
            if (!flag) {  // karta lezaca na stosie nie byla funkcyjna wiec:
                if (gameCreator.getFirstPlayer().get(i).getRank() == gameCreator.getStack().get(0).getRank()  // jesli mamy karte odpowiadajaca kolorowi lub figurze to ja zrzucamy
                        || gameCreator.getFirstPlayer().get(i).getSuit() == gameCreator.getStack().get(0).getSuit()) {
                    gameCreator.getDeck().add(gameCreator.getStack().get(0));
                    gameCreator.getStack().remove(gameCreator.getStack().get(0));
                    gameCreator.getStack().add(gameCreator.getFirstPlayer().get(i));
                    gameCreator.getFirstPlayer().remove(gameCreator.getFirstPlayer().get(i));
                    isCardFunctionActive = true;// zmiana tej flagi w metodzie howManyCardsTakeFromDeckSecondPlayer(gameCreator)
                    // z liniji 223 spowodowala, ze karta lezaca na stosie nie jest juz funkcyjna ale musimy znowu wlaczyc funkcjonalnosc kart lezaych na stosie
                    return;

                } else if (gameCreator.getFirstPlayer().get(i).getRank() == Rank.Queen && gameCreator.getFirstPlayer().get(i).getSuit() == Suit.Spade) { // w mysla zaday damaa pik na wszystko
                    //o ile karta lezaca na stosie nie jest funkcyjna
                    if (gameCreator.getStack().get(0).getRank() != Rank.Two || gameCreator.getStack().get(0).getRank() != Rank.Three
                            || gameCreator.getStack().get(0).getRank() != Rank.Four ||
                            (gameCreator.getStack().get(0).getRank() != Rank.King && gameCreator.getStack().get(0).getSuit() != Suit.Diamond) ||
                            (gameCreator.getStack().get(0).getRank() != Rank.King && gameCreator.getStack().get(0).getSuit() != Suit.Spade)) {
                        gameCreator.getDeck().add(gameCreator.getStack().get(0));
                        gameCreator.getStack().remove(gameCreator.getStack().get(0));
                        gameCreator.getStack().add(gameCreator.getFirstPlayer().get(i));
                        gameCreator.getFirstPlayer().remove(gameCreator.getFirstPlayer().get(i));
                        isCardFunctionActive = true;
                        return;
                    }
                }
            }
        }


        if (flag) { // jezeli karta lezaca na stosie byla funkcyjna i gracz nie mial karty zeby ja przebic:
            howManyCardsTakeFromDeckFirstPlayer(gameCreator);
            return;
        }

        gameCreator.getFirstPlayer().add(gameCreator.getOnecardFromDeck());
        isCardFunctionActive = true;

    }


    private void secondPlayer(GameCreator gameCreator) {
        for (int i = 0; i < gameCreator.getSecondPlayer().size(); i++) {
            if (isCardFunctionActive) {
                howManyCardToBeTakenCounter = gameCreator.getStack().get(0).cardStrength();
                if (gameCreator.getStack().get(0).getRank() == Rank.Two) {
                    flag = true;
                    if (gameCreator.getSecondPlayer().get(i).getRank() == Rank.Two
                            || gameCreator.getSecondPlayer().get(i).getRank() == Rank.King && gameCreator.getSecondPlayer().get(i).getSuit() == Suit.Spade
                            || gameCreator.getSecondPlayer().get(i).getRank() == Rank.King && gameCreator.getSecondPlayer().get(i).getSuit() == Suit.Diamond) {
                        howManyCardToBeTakenCounter += gameCreator.getStack().get(0).cardStrength();
                        gameCreator.getDeck().add(gameCreator.getStack().get(0));
                        gameCreator.getStack().remove(gameCreator.getStack().get(0));
                        gameCreator.getStack().add(gameCreator.getSecondPlayer().get(i));
                        gameCreator.getSecondPlayer().remove(gameCreator.getSecondPlayer().get(i));
                        return;
                    }
                } else if (gameCreator.getStack().get(0).getRank() == Rank.Three) {
                    flag = true;
                    if (gameCreator.getSecondPlayer().get(i).getRank() == gameCreator.getStack().get(0).getRank()
                            || gameCreator.getSecondPlayer().get(i).getRank() == Rank.King && gameCreator.getSecondPlayer().get(i).getSuit() == Suit.Spade
                            || gameCreator.getSecondPlayer().get(i).getRank() == Rank.King && gameCreator.getSecondPlayer().get(i).getSuit() == Suit.Diamond) {
                        howManyCardToBeTakenCounter += gameCreator.getStack().get(0).cardStrength();
                        gameCreator.getDeck().add(gameCreator.getStack().get(0));
                        gameCreator.getStack().remove(gameCreator.getStack().get(0));
                        gameCreator.getStack().add(gameCreator.getSecondPlayer().get(i));
                        gameCreator.getSecondPlayer().remove(gameCreator.getSecondPlayer().get(i));
                        return;

                    }

                } else if (gameCreator.getStack().get(0).getRank() == Rank.King && gameCreator.getStack().get(0).getSuit() == Suit.Spade) {
                    flag = true;
                    if (gameCreator.getSecondPlayer().get(i).getRank() == gameCreator.getStack().get(0).getRank()
                            && gameCreator.getSecondPlayer().get(i).getSuit() == Suit.Diamond) {
                        howManyCardToBeTakenCounter += gameCreator.getStack().get(0).cardStrength();
                        gameCreator.getDeck().add(gameCreator.getStack().get(0));
                        gameCreator.getStack().remove(gameCreator.getStack().get(0));
                        gameCreator.getStack().add(gameCreator.getSecondPlayer().get(i));
                        gameCreator.getSecondPlayer().remove(gameCreator.getSecondPlayer().get(i));
                        return;
                    }

                } else if (gameCreator.getStack().get(0).getRank() == Rank.King && gameCreator.getStack().get(0).getSuit() == Suit.Diamond) {
                    flag = true;
                    if (gameCreator.getSecondPlayer().get(i).getRank() == gameCreator.getStack().get(0).getRank()
                            && gameCreator.getSecondPlayer().get(i).getSuit() == Suit.Spade) {
                        howManyCardToBeTakenCounter += gameCreator.getStack().get(0).cardStrength();
                        gameCreator.getDeck().add(gameCreator.getStack().get(0));
                        gameCreator.getStack().remove(gameCreator.getStack().get(0));
                        gameCreator.getStack().add(gameCreator.getSecondPlayer().get(i));
                        gameCreator.getSecondPlayer().remove(gameCreator.getSecondPlayer().get(i));
                        return;
                    }

                }


            }
            if (!flag) {
                if (gameCreator.getSecondPlayer().get(i).getRank() == gameCreator.getStack().get(0).getRank()
                        || gameCreator.getSecondPlayer().get(i).getSuit() == gameCreator.getStack().get(0).getSuit()) {
                    gameCreator.getDeck().add(gameCreator.getStack().get(0));
                    gameCreator.getStack().remove(gameCreator.getStack().get(0));
                    gameCreator.getStack().add(gameCreator.getSecondPlayer().get(i));
                    gameCreator.getSecondPlayer().remove(gameCreator.getSecondPlayer().get(i));
                    isCardFunctionActive = true;   // zmiana tej flagi w metodzie howManyCardsTakeFromDeckSecondPlayer(gameCreator)
                    // z liniji 223 spowodowala, ze karta lezaca na stosie nie jest juz funkcyjna ale musimy znowu wlaczyc funkcjonalnosc kart lezaych na stosie
                    return;

                } else if (gameCreator.getSecondPlayer().get(i).getRank() == Rank.Queen && gameCreator.getSecondPlayer().get(i).getSuit() == Suit.Spade) {
                    if (gameCreator.getStack().get(0).getRank() != Rank.Two || gameCreator.getStack().get(0).getRank() != Rank.Three
                            || gameCreator.getStack().get(0).getRank() != Rank.Four ||
                            (gameCreator.getStack().get(0).getRank() != Rank.King && gameCreator.getStack().get(0).getSuit() != Suit.Diamond) ||
                            (gameCreator.getStack().get(0).getRank() != Rank.King && gameCreator.getStack().get(0).getSuit() != Suit.Spade)) {
                        gameCreator.getDeck().add(gameCreator.getStack().get(0));
                        gameCreator.getStack().remove(gameCreator.getStack().get(0));
                        gameCreator.getStack().add(gameCreator.getSecondPlayer().get(i));
                        gameCreator.getSecondPlayer().remove(gameCreator.getSecondPlayer().get(i));
                        isCardFunctionActive = true;
                        return;

                    }
                }
            }
        }

        if (flag) {
            howManyCardsTakeFromDeckSecondPlayer(gameCreator);
            return;

        }
        gameCreator.getSecondPlayer().add(gameCreator.getOnecardFromDeck());
        isCardFunctionActive = true;


    }


    private void howManyCardsTakeFromDeckFirstPlayer(GameCreator gameCreator) {  // w zaleznosci od nazbieranej ilosci kart do zabrania z tali:
            for (int z = 0; z < howManyCardToBeTakenCounter; z++) {
                Card card1 = gameCreator.getOnecardFromDeck();
                gameCreator.getFirstPlayer().add(card1);

            }
        isCardFunctionActive=false;   // nawet jesli karta funkcyjna zostaje na stosie to traci moc funkcyjnej gdyz jeden z graczy wlasnie zabral odpowiednia ilosc kart z talli do swoich
        howManyCardToBeTakenCounter = 0;  // wyzerowywane
        flag = false;  //zmiana na false. zmieni sie ponownie na true jesli karta bedzie funkcyjna
    }


    private void howManyCardsTakeFromDeckSecondPlayer(GameCreator gameCreator) {
            for (int z = 0; z < howManyCardToBeTakenCounter; z++) {
                Card card1 = gameCreator.getOnecardFromDeck();
                gameCreator.getSecondPlayer().add(card1);

            }
        isCardFunctionActive = false;
        howManyCardToBeTakenCounter = 0;
        flag = false;
    }




    // metoda z tresci zadania z zajec:

//    public Card cardCompare(Card card, Card card1) {
//        if (card.cardStrength() > card1.cardStrength()) {
//            System.out.println(card + "jest silniejsza");
//            return card;
//        } else {
//            System.out.println(card1 + "jest silniejsza");
//            return card1;
//
//        }
  //  }







    }

