package oop.interface_demo;

public class Application {

    private Repository repository;

    public Application(Repository repository) {
        this.repository = repository;
    }

    public void start(){
        System.out.println("Aplikacja startuje");
        repository.loadData();
    }

    public void stop(){
        System.out.println("Aplikacja zamyka się");
        repository.saveData();
    }



}
