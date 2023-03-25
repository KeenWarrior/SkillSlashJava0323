package lecture1;

public class NumberSystem {

    public static void main(String[] args) {
        System.out.println(deci2bin(12));
    }

    public static int deci2bin(int num){
        int place = 1;
        int result = 0;

        while (num > 0){
            int rem = num % 2;
            result = result + (place * rem);
            num = num / 2;
            place = place * 10;
        }
        return result;
    }

    public static int deci2any(int num, int base){
        int place = 1;
        int result = 0;

        while (num > 0){
            int rem = num % base;
            result = result + (place * rem);
            num = num / base;
            place = place * 10;
        }
        return result;
    }

    public static int bin2deci(int num) {
        int result = 0;
        int place = 1;

        while (num > 0){
            int rem = num % 10;
            result = result + (place * rem);
            place = place * 2;
            num = num / 10;
        }

        return result;
    }
}
