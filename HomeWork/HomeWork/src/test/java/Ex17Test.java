import Ex17.Calculator;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by mafio on 29.11.2016.
 */
public class Ex17Test {
    @Test
    public void calculatorTest(){
        Assert.assertEquals(6.0, Calculator.calculate("2 + 2 * 2"));
        Assert.assertEquals(29.0,Calculator.calculate("( 1 + 2 ) * 3 + 4 * 5"));
    }
}
