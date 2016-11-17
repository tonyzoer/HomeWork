import ex7.*;
import junit.framework.Assert;
import org.junit.Test;
/**
 * Created by mafio on 14.11.2016.
 */

public class Ex7Test {
    StarSystem sys=new StarSystem("MilkyWay");
    Planet pl=new Planet("Heisenberg");
    Continent cn=new Continent("Meth");
    Ocean ocean=new Ocean("Heroin");
    Island is=new Island("Jhony");
    Moon moon=new Moon("Moooon");
    @Test
    public void planetTest(){

        pl.addMoon(moon);
        pl.addContinent(cn);
        pl.addIsland(is);
        pl.addOcean(ocean);
        Assert.assertEquals("My name is:Heisenberg",pl.sayMyName());
        Assert.assertEquals(1,pl.amountOfContinents());
        Assert.assertEquals(1,pl.amountOfMoons());

    }
    @Test
    public void starSystemTest(){
    sys.addPlanet(pl);
        Star centralStar =new Star("Sun");
        sys.setCentralStar(centralStar);

    }
}
