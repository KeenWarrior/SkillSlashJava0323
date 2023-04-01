package lecture3.composition;

public class Car {

    private Lock lock;
    private Engine engine;

    public Car(String password){
        this.engine = new Engine();
        this.lock = new Lock(password);
    }

    public void start(String password) {
        if (this.lock.checkPassword(password)) {
            engine.start();
        }
    }

    public void stop(){
       engine.stop();
    }

    public void changeEngine(Engine engine){
        this.engine = engine;
    }

    public void acc(){
        System.out.println("Vroom Vroom");
    }
}
