package citizen;

public class Peasant extends Citizen {
    @Override
    public boolean canVote() {
        return false;
    }
}
