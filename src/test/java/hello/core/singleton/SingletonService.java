package hello.core.singleton;

public class SingletonService {

    private static SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {}

    public void logic() {
        System.out.println("SingletonService.logic");
    }

}
