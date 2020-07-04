package oop.inheritance;

public class Dog  extends Pet implements ZwierzeDomowe{

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

    @Override
    public void makeSound() {
        System.out.println("Woof, woof!");
    }

    public void fetch() {
        System.out.println(name + " runs and fetches!");
    }


    @Override
    public void zrobSztuczke() {
        System.out.println("Aportuje");
    }
}
