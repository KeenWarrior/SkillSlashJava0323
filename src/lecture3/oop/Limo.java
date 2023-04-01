package lecture3.oop;

public class Limo extends Car {
    private int wheels = 6;

    public void start(){
        System.out.println("Limo is starting");
    }

    public void stop(){
        System.out.println("Limo is stopping");
    }

    public void acc(){
        System.out.println("Limo is doing Vroom Vroom");
    }
}
