package lecture1;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(checkPrime(6));
    }

    public static boolean checkPrime(int num){
        if(num <= 2){
            return true;
        }

        boolean flag = true;
        int current = 2;
        while ((current * current) <= num){
            if((num % current) == 0){
                flag =  false;
                break;
            }
            current++;
        }

        return flag;
    }
}

