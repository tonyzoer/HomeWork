import Ex16.Core.Game;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mafio on 25.11.2016.
 */
public class Ex16Test {

    @Test
    public void shipPositionTest(){
        Game game=new Game();
        List<Pair<Integer,Integer>> ship=new LinkedList<>();
        ship.add(new Pair(2,2));
        game.addPlayerShip(game.getPlayer1(),ship);
        List<List<Boolean>> gameField=game.getShipField(game.getPlayer1());
        ship.clear();
        ship.add(new Pair(2,3));
        game.addPlayerShip(game.getPlayer1(),ship);
        ship.clear();
        ship.add(new Pair(3,2));
        game.addPlayerShip(game.getPlayer1(),ship);
        ship.clear();
        ship.add(new Pair(3,3));
        game.addPlayerShip(game.getPlayer1(),ship);
        ship.clear();
        ship.add(new Pair(1,3));
        game.addPlayerShip(game.getPlayer1(),ship);
        ship.clear();
        ship.add(new Pair(3,1));
        game.addPlayerShip(game.getPlayer1(),ship);
        ship.clear();
        ship.add(new Pair(1,1));
        game.addPlayerShip(game.getPlayer1(),ship);
        ship.clear();
        ship.add(new Pair(1,2));
        game.addPlayerShip(game.getPlayer1(),ship);
        ship.clear();
        ship.add(new Pair(3,2));
        game.addPlayerShip(game.getPlayer1(),ship);
        //UIConsole.showField(game.getPlayer1());
        Assert.assertEquals(gameField,game.getShipField(game.getPlayer1()));
    }
    @Test
    public void checkStrike(){
    Game game=new Game();

        List<Pair<Integer,Integer>> ship=new LinkedList<>();
        ship.add(new Pair<>(2,2));
        game.addPlayerShip(game.getPlayer1(),ship);
        game.shootP1(2,2);
        game.addPlayerShip(game.getPlayer2(),ship);
        game.shootP2(1,1);
        game.shootP2(1,2);
        game.shootP2(1,3);
        game.shootP2(2,3);
        game.shootP2(3,3);
        game.shootP2(3,2);
        game.shootP2(3,1);
        game.shootP2(2,1);
        game.shootP2(2,2);
//      UIConsole.showGameFields(game);
        Assert.assertEquals(game.getPlayField(game.getPlayer1()),game.getPlayField(game.getPlayer2()));

    }
}
