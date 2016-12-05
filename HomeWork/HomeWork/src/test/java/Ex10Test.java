import Ex10.Computer;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by mafio on 12.11.2016.
 */
public class Ex10Test {
    @Test
    public void powerTest(){
        Computer comp=new Computer();
        comp.setProccesor("Intel core 2 duo",2.3d,2014d,2);
        comp.setMemmory("Kingston",8048,1.6d);
        comp.setOs("Windows 10.1","Build 9867");
        Assert.assertEquals(829,comp.getSummaryPower());
    }
    public void powerZeroTest(){
        Computer comp=new Computer();
        Assert.assertEquals(0,comp.getSummaryPower());
    }
}
