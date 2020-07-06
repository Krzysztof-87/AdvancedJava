package Agent;

import java.util.ArrayList;

public class AgentDemo {

    public static void main(String[] args) {

        Case acase = new Case("Wiadomosc");
        Case acase1 = new Case("Jaka");
        Case acase2 = new Case("Znowu");
        Case acase3 = new Case("Tajna");
        ArrayList<Case>cases = new ArrayList<>();
        cases.add(acase);
        cases.add(acase1);
        cases.add(acase2);
        cases.add(acase3);

        Agent agent = new Agent("Polish", cases);
        System.out.println(agent.getSecretDocument("polish"));
    }
}
