package lecture2;

public class StringIntro {
    public static void main(String[] args) {
        String welcome = "Hello World";
        String name = "Anuj Garg";

        System.out.println(welcome.charAt(2));
        System.out.println(welcome.length());
        System.out.println(welcome.concat(name));
        System.out.println(welcome + name);
        System.out.println(welcome);

        String one = "hello";
        String two = "hello";

        System.out.println(one.equals(two));
        System.out.println(one);
        System.out.println(two);

        System.out.println(welcome.indexOf('c'));
        System.out.println(welcome.contains("c"));





    }
}
