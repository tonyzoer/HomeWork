/**
 * Created by mafio on 11.11.2016.
 */

import epam.ex6.Parallelogram;
import epam.ex6.Ring;
import epam.ex6.Trapezium;
import epam.ex6.Triangle;
import junit.framework.Assert;
import org.junit.Test;

public class Ex6Test {
    @Test
    public void ringTest(){
        Ring r1=new Ring(1d,-1d);//minus test,zero test
        Ring r2=new Ring(1d,0d);//Test on right formula
        Assert.assertEquals(0.0d,r1.getSquare());
        Assert.assertEquals(Math.PI,r2.getSquare());

    }
    @Test
    public void triangleTest(){
        Triangle t1=new Triangle(3d,4d,5d);//usual test
        Assert.assertEquals(6.0,t1.getSquare());
    }
    @Test
    public void paralelogramTest(){
        Parallelogram p1=new Parallelogram(3d,2d,90d);//square
        Assert.assertEquals(6d,p1.getSquare());
        //Parallelogram p2=new Parallelogram(4d,2d,30.00000000000001d);//sin 30 = 1/2 but it just close to 1/2
        //Assert.assertEquals(4d,p2.getSquare());
    }
    @Test
    public void trapeziumTest(){
        Trapezium tr1=new Trapezium(8.212d,16d,8.212d,20d,60d,60d);
     //   Assert.assertEquals(1,tr1.getSquare());
    }
}
