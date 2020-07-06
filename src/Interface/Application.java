package Interface;

public class Application {

    private DbRepository repository;

    private CloudRepository cloudRepository;

    public Application(CloudRepository cloudRepository) {
        this.cloudRepository = cloudRepository;
    }

    public Application(DbRepository repository) {
        this.repository = repository;
    }

    public void start(){
        System.out.println("aplikacja startuje");
        cloudRepository.loadData();

    }

    public void stop(){
        System.out.println("aplikacja zamyka sie");
        cloudRepository.saveData();

    }
}
