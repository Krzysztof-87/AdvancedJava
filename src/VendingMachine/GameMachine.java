package VendingMachine;
/*
GameMachine - przechowuje kilka gier i pozwala je kupić.
W sytuacji, gdy użytkownik próbuje zakupić grę, której nie ma w automacie lub wpłacił zbyt mało pieniędzy rzuć
  w metodzie obsługującej zakup odpowiednie wyjątki zdefiniowane przez siebie
 */

import java.util.LinkedList;
import java.util.List;

public class GameMachine {
    private List<Game> games = new LinkedList<>();

    public GameMachine() {
        games.add(new Game("The Witcher 3: Wild Hunt",350));
        games.add(new Game("Dark Souls 3", 290));
        games.add(new Game("Monster Hunter World",330));
        games.add(new Game("Red Dead Redemption 2", 280));
    }


    public List<Game> getGames() {
        return games;
    }

    public Game buyGame(String gameName, int gamePrize) throws GameMachineException {
        for (int i=0; i<games.size();i++) {
            if (games.get(i).getName().equalsIgnoreCase(gameName)) {
                if (games.get(i).getPrize() <= gamePrize) {
                    return games.get(i);
                } //else
                   // throw new GameMachineException("You didn't input enough money, take all your money back. Please try again");

            }
        }
        throw new GameMachineException("Unfortunately We don't have this game, please choose other game from our wide selection");

    }

    public void deleteGameFromList(Game game){
        games.remove(game);
    }
}
