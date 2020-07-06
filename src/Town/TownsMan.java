package Town;

public class TownsMan extends Citizen {



    public TownsMan(String name) {
        super(name);
    }



    @Override
    public boolean canVote() {
        return true;
    }
}
