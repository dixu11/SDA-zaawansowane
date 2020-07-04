package inheritance.citizen;

import java.util.ArrayList;

public class Town {

    private ArrayList<Citizen> citizens = new ArrayList<>();

    public void add(Citizen citizen){
        citizens.add(citizen);
    }

    public int howManyCanVote(){
        int counter = 0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                counter++;
            }
        }
        return counter;
    }

    //dodatkowo trzeba zrobić whoCanVote

    @Override
    public String toString() {
        return "Town{" +
                "citizens=" + citizens +
                '}';
    }
}
