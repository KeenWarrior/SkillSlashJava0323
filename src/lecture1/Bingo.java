package lecture1;

class Human {
    int hands;
    int legs;
    String name;

    void eat(){
        System.out.println("This human eats");
    }

    void dance(){
        System.out.println("This human dance");
    }
}

class Life {
    public static void main(String[] args) {
        Human anuj = new Human();
        anuj.dance();
        anuj.name = "Anuj Garg";
        System.out.println("Hello world");
        System.out.println(anuj.name);
    }
}