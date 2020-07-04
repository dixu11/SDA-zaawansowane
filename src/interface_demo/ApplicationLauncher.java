package interface_demo;

public class ApplicationLauncher {

    public static void main(String[] args) {
        Application application = new Application(new DbRepository());
        application.start();
        application.stop();
    }

}
