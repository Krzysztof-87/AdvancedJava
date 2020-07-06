package Interface;

public class ApplicationLauncher {



    public static void main(String[] args) {

//        Application application = new Application(new DbRepository());
//        application.start();
//        application.stop();
        Application application1 = new Application(new CloudRepository());
        application1.start();
        application1.stop();

    }
}
