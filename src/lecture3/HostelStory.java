package lecture3;

class Hosteler {
    int money;

    public Hosteler(){
        this.money = 1000;
    }

    public void party(){
        if (this.money < 100){
            System.out.println("Can not party");
        } else {
            System.out.println("Party party");
            this.money-= 100;
        }
    }

    public void loan(int amount, Hosteler provider){
        if (provider.money >= amount){
            provider.money -= amount;
            this.money += amount;
        }
    }
}
public class HostelStory {
    public static void main(String[] args) {
        Hosteler neha = new Hosteler();
        Hosteler sowmya = new Hosteler();
        System.out.println(neha.money);
        for (int i = 0; i < 14; i++) {
            neha.party();
        }
        System.out.println(neha.money);

        neha.loan(500, sowmya);
        System.out.println(neha.money);
        System.out.println(sowmya.money);

        neha.party();

        System.out.println(neha.money);
        System.out.println(sowmya.money);


    }
}
