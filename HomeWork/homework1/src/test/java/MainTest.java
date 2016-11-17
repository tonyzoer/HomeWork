import junit.framework.Assert;
import org.junit.Test;
import org.omg.PortableInterceptor.Interceptor;
import java.math.BigInteger;

/**
 * Created by mafio on 01.11.2016.
 */
public class MainTest {

    @Test
    public void sizeOfTest(){
        Assert.assertEquals("Smth went wrong",8, Main.SizeOf.Byte());
        Assert.assertEquals("Smth went wrong",16, Main.SizeOf.Short());
        Assert.assertEquals("Smth went wrong",32, Main.SizeOf.Int());
        Assert.assertEquals("Smth went wrong",64, Main.SizeOf.Long());
    }
    @Test (expected = Exception.class)
    public void changePosBitTest() throws Exception {
        Assert.assertEquals(1, Main.BitChanger.changePosBit(0,1));
        Assert.assertEquals(0, Main.BitChanger.changePosBit(1,1));
        Main.BitChanger.changePosBit(1,33);
        Assert.assertEquals(-1, Main.BitChanger.changePosBit(Integer.MAX_VALUE,32));
        Assert.assertEquals(Integer.MIN_VALUE,Main.BitChanger.changePosBit(0,32));
    }
    @Test
    public void gcdTest(){
        Assert.assertEquals(0, Main.Gcd.gcd(0,0));
        Assert.assertEquals(1, Main.Gcd.gcd(0,1));
        Assert.assertEquals(1, Main.Gcd.gcd(1,0));
        Assert.assertEquals(3, Main.Gcd.gcd(6,9));
        Assert.assertEquals(10, Main.Gcd.gcd(0,10));
        Assert.assertEquals(1, Main.Gcd.gcd(1,1034533));
        Assert.assertEquals(2, Main.Gcd.gcd(3465326,2354632));
        Assert.assertEquals(10, Main.Gcd.gcd(-20,-10));
    }
    @Test
    public void kuratsubaTest(){
        Assert.assertEquals(new BigInteger("0",10), Main.Kuratsuba.mult(new BigInteger("0",10),new BigInteger("0",10)));
        Assert.assertEquals(new BigInteger("-100000000",10), Main.Kuratsuba.mult(new BigInteger("10000",10),new BigInteger("-10000",10)));
        Assert.assertEquals(new BigInteger("10000000000000000",10), Main.Kuratsuba.mult(new BigInteger("100000000",10),new BigInteger("100000000",10)));
        Assert.assertEquals(new BigInteger("100000000",10), Main.Kuratsuba.mult(new BigInteger("-10000",10),new BigInteger("-10000",10)));
        Assert.assertEquals(new BigInteger("-1000000",10), Main.Kuratsuba.mult(new BigInteger("-10000",10),new BigInteger("100",10)));
    }
}
