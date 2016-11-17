import junit.framework.Assert;
import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by mafio on 02.11.2016.
 */
public class RSATest {

    @Test
    public void rsaTest(){
        RSA rsa=new RSA(128);
        BigInteger message=new BigInteger("10000101025674674567568435341111111111111111111111343252325245325622342353654564363535635635735634563743487875278070702458723084702832803740729534531111111111111115703756111111111111111111111111111111111111111",10);
        BigInteger encrypt= rsa.encrypt(message);
        BigInteger decrypt=rsa.decrypt(encrypt);
        //System.out.println(encrypt+" "+decrypt);
        Assert.assertEquals(message,decrypt);
        Assert.assertEquals(new BigInteger("1"),rsa.encrypt(new BigInteger("1")));
    }
}
