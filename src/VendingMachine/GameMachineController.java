package VendingMachine;
/*Działanie automatu jest następujące:

użytkownik wpisuje na ekranie nazwę gry, którą chce wypożyczyć
użytkownik wrzuca do do automatu pieniądze (zakładamy pełne złotówki, bez groszy)
Użytkownik powinien zobaczyć w odpowiedzi, że grę udało się kupić lub, że dana gra nie
została odnaleziona.
Dodatkowo jeśli użytkownik wrzucił zbyt mało pieniędzy powinien
zobaczyć komunikat o zbyt małej kwocie, a jeśli wpłacił zbyt dużo pieniędzy, to powinien
otrzymać resztę.


GameMachineController - klasa interakcji z użytkownikiem, jest to jedyne miejsce w programie, gdzie powinno być wyświetlanie oraz wczytywanie danych od użytkownika.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMachineController {

    private Game game;
    private String option;
    private String gameNameInput;
    private int moneyInput;
    Scanner input = new Scanner(System.in);
    private GameMachine gameMachine= new GameMachine();


    public void run(){
        welcomeMessage();
        do {
            printMenu();
            option = chooseOption();
            validateOption(option);
        }while (!option.equalsIgnoreCase("exit"));
    }

    public void welcomeMessage(){
        System.out.println("Hello, Welcome to our game purchase service, how we can help you today?");
    }


    private void printMenu() {
        System.out.println("If you would like to buy a game pls push the button 'Game' ");
        System.out.println("if you would like to see list of our games pls push the button 'List'");
        System.out.println("If you wish to finish, please push the button 'exit' ");
    }
    private String chooseOption() {
        try {
            String choice = input.nextLine();
            return choice;
        }catch (InputMismatchException e){
            System.out.println("You have push wrong button ");
        }
        return null;
    }

    private void validateOption(String option){
        if (option.equalsIgnoreCase("game")){
            try{
                getAGame();
                gameMachine.deleteGameFromList(game);
                successfulMessage(game);
                input.nextLine();
            }catch (GameMachineException e){
                System.err.println(e.getMessage());
                input.nextLine();
            }
        }else if (option.equals("List")){
            System.out.println(gameMachine.getGames());
        }else if (option.equals("exit")){
            System.out.println("We hope you are happy with our service, Have a good one!");
        }

    }

    private void getAGame() {
            try {
                System.out.println("Please enter game title:");
                gameNameInput = input.nextLine();
                System.out.println("Please pay correct amount");
                moneyInput = input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("You entered wrong data");
            }
            game = gameMachine.buyGame(gameNameInput, moneyInput);
    }


    public void successfulMessage(Game game){
        System.out.println("Thank you for purchase");
        System.out.println("You bought "+game.getName()+", have fun!" );
        if (changeToGive()) {
            calculateChangeToGIveBack();
        }else
            System.out.println("       ");
    }


    private boolean changeToGive(){
        return moneyInput>game.getPrize();
    }

    private void calculateChangeToGIveBack(){
        int change = moneyInput - game.getPrize();
        System.out.println("you paid " + change +" extra, take back your change");
        System.out.println("     ");
    }






}
