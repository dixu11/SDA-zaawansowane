package inheritance;

public class Dog  extends Pet{

    public Dog() {
        super("Reksio", 1);
    }

    public Dog(String name, int age){
        super(name,age);
    }

    @Override
    public void feed(){
//        super.feed();
        System.out.println(name + " its bone");
    }

    @Override
    public void run() {
        System.out.println("Dog runs fast");
    }

    public void bark() {
        System.out.println("Woof, woof!");
    }

    public void fetch() {
        System.out.println(name + " runs and fetches!");
    }


}
