package lecture3;

class Human {

    public Human(String name){
        this.name = name;
        this.legs = 2;
        this.age = 0;
        Human.population += 1;
    }


    static int population = 0;
    String name;
    int age;
    int legs;

    public void walk(){
        System.out.println("I am walking");
    }
}
public class OOPIntro {
    public static void main(String[] args) {
        Human anuj = new Human("Anuj Garg");
        anuj.walk();

        Human mohit = new Human("Mohit Garg");
        mohit.walk();

        System.out.println(Human.population);
    }
}

