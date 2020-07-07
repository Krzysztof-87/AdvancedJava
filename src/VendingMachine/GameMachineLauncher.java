package VendingMachine;

public class GameMachineLauncher {

    public static void main(String[] args) {

        GameMachine gameMachine= new GameMachine();
        GameMachineController gameMachineController= new GameMachineController();
        gameMachineController.mainLoop(gameMachine);
    }
}
