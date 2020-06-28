package inheritance;

public class Dog  extends Pet{

    public Dog() {
        name = "Reksio";
        age = 1;
    }

    @Override
    public void feed(){
        System.out.println(name + " its bone");
    }

    public void bark() {
        System.out.println("Woof, woof!");
    }

    public void fetch() {
        System.out.println(name + " runs and fetches!");
    }


}
