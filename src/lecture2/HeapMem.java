package lecture2;


class Human {}
public class HeapMem {
    public static void main(String[] args) {
        Human anil = new Human();
        Human baby = anil;
        Human ram = new Human();
        System.out.println(anil);
        System.out.println(baby);
        System.out.println(ram);
        baby = ram;
        System.out.println(anil);
        System.out.println(baby);
        System.out.println(ram);

    }
}
