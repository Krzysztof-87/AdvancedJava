package Town;

public class Election {

    public static void main(String[] args) {

        Citizen citizen = new Peasant("Karol");
        Citizen citizen1 = new TownsMan("Przemo");
        Citizen citizen2 = new King("Kazimierz");
        Citizen citizen3 = new Soldier("Zygmunt");


        Town town = new Town();
        town.add(citizen);
        town.add(citizen1);
        town.add(citizen2);
        town.add(citizen3);

        System.out.println(town.howManyCanVote());
        town.whoCanVote();
        System.out.println(town);

    }

}
