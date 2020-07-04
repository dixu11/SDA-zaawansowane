package oop.interface_demo;

public class Launcher {

    public static void main(String[] args) {
        Application application = new Application(new DbRepository());
        application.start();
        application.stop();
    }

}
