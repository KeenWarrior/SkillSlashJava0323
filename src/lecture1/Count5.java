package lecture1;

public class Count5 {
    public static void main(String[] args) {
        System.out.println(count5(5255));
    }

    public static int count5(int num){
        int count = 0;

        while (num > 0){
            int rem = num % 10;
            if ( rem == 5 ) {
                count++;
            }
            num = num / 10;
        }

        return count;

    }
}
