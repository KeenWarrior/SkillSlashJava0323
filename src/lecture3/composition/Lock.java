package lecture3.composition;

public class Lock {
    private String password;
    private int attempts;

    public Lock(String password){
        this.password = password;
        this.attempts = 4;
    }

    public boolean checkPassword(String password){
        if(attempts <= 0){
            System.out.println("Password attempts exceeded.");
            return false;
        }
        if(this.password.equals(password)){
            return true;
        } else {
            this.attempts-=1;
            System.out.println("Wrong password. Attempts remaining :"+ this.attempts);
            return false;
        }
    }
}
