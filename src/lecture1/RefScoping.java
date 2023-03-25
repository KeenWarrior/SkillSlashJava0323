package lecture1;

public class RefScoping {
    public static void main(String[] args) {
        int a = 8;

        if(a > 6){
            int b = 10;
            System.out.println(a);
            System.out.println(b);
        }
    }
}
