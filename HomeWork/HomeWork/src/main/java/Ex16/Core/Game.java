package Ex16.Core;

import javafx.util.Pair;

import java.util.List;

/**
 * Created by mafio on 21.11.2016.
 */
public class Game {


    Player player1 = new Player();
    Player player2 = new Player();

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Integer nextShipSize(Player p) {
        return p.nextShipSize();
    }

    public String getPlayerName(Player p) {
        return p.name;
    }

    public void setPlayerName(Player p, String s) {
        p.setName(s);
    }

    public List<List<Boolean>> getShipField(Player p) {
        return p.getShipField();
    }

    public List<List<Boolean>> getPlayField(Player p) {
        return p.getPlayField();
    }

    public Boolean gameIsnotOwer() {
        return player1.isWin() && player2.isWin();
    }

    public int shootP1(int x, int y) {
        return player1.takeShoot(x, y);
    }

    public int shootP2(int x, int y) {
        return player2.takeShoot(x, y);
    }

    public int getWinner() {
        return (player1.isWin()) ? 1 : (player2.isWin()) ? 2 : 0;
    }

    public Boolean addPlayerShip(Player p, List<Pair<Integer, Integer>> pos) {
        return p.addShip(pos);
    }


}
