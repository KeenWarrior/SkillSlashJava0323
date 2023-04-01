package lecture3;

import java.util.ArrayList;

class Player {
    String name;
    boolean alive;
    static ArrayList<Player> players = new ArrayList<>();

    public Player(String name){
        this.name = name;
        this.alive = true;
        Player.players.add(this);
    }

    @Override
    public String toString() {
        return this.name + " : " + this.alive;
    }

    public void die(){
        this.alive = false;
    }

    public void revive(){
        this.alive = true;
    }
}

class Shooter extends Player {

    int kills;
    public Shooter(String name) {
        super(name);
        this.kills = 0;
    }

    public void kill(Player player){
        if (this == player){
            return;
        }
        if (player.alive){
            player.die();
            this.kills += 1;
        }
    }
}

public class ShootingGame {
    public static void main(String[] args) {
        System.out.println(Player.players);
        Player ravi = new Player("Ravi");
        Player shubham = new Player("Shubham");
        System.out.println(Player.players);
        Player anil = new Player("Anil");
        System.out.println(Player.players);

        anil.die();

        System.out.println(Player.players);

        anil.revive();

        System.out.println(Player.players);

        Shooter gogo = new Shooter("Crime master gogo");

        System.out.println(Player.players);

        gogo.kill(anil);
        gogo.kill(anil);

        System.out.println(gogo.kills);

        gogo.kill(gogo);

        System.out.println(Player.players);

        System.out.println(gogo.kills);

    }
}
