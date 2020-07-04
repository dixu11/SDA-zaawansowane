package inheritance.citizen;

public class Soldier extends Citizen {
    @Override
    public boolean canVote() {
        return true;
    }
}
