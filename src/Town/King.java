package Town;

public class King extends Citizen {

    private String name;

    public King(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean canVote() {
        return false;
    }
}
