package VendingMachine;

public class GameMachineLauncher {

    public static void main(String[] args) {


        GameMachineController gameMachineController= new GameMachineController();
        gameMachineController.mainLoop();
    }
}
