import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.concurrent.ExecutionException;

/**
 * Created by mafio on 28.10.2016.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("Size Of Byte "+SizeOf.Byte());
//        System.out.println("Size Of Short "+SizeOf.Short());
//        System.out.println("Size Of Int "+SizeOf.Int());
//        System.out.println("Size Of Long "+SizeOf.Long());
//        System.out.println("Input 15 shift bit 4 Output: "+changePosBit(15,4));
//        System.out.println("Greatest common divisor of 35 and 14 is "+gcd(35,14));
   //     int N = Integer.parseInt(args[0]);
     //   System.out.println(1000);
//           RSA rsa=new RSA(32);
//        System.out.println(rsa);
//        BigInteger message=new BigInteger("1010212223",10);
//        BigInteger encrypt = rsa.encrypt(message);
//        BigInteger decrypt = rsa.decrypt(encrypt);
//        System.out.println("message   = " + message);
//        System.out.println("encrypted = " + encrypt);
//        System.out.println("decrypted = " + decrypt);
    }

    static class SizeOf {
        static int Int() {
            int n = 1;
            int size = 0;
            while (n != 0) {
                n <<= 1;
                size++;
            }
            return size;
        }

        static int Byte() {
            byte n = 1;
            int size = 0;
            while (n != 0) {
                n <<= 1;
                size++;
            }
            return size;
        }

        static int Long() {
            long n = 1;
            int size = 0;
            while (n != 0) {
                n <<= 1;
                size++;
            }
            return size;
        }

        static int Short() {
            short n = 1;
            int size = 0;
            while (n != 0) {
                n <<= 1;
                size++;
            }
            return size;
        }

    }

    static class BitChanger {
        static int changePosBit(int n, int pos) throws Exception {
            if (pos>32||pos<0){
                throw new Exception("Position of changin bit is bigger then 32 or less then zero");
            }
            int xorval = 1;
            xorval <<= pos - 1;
            n ^= xorval;
            return n;
        }
    }

    static class Gcd {
        static int gcd(int u, int v) {
            u = Math.abs(u);
            v = Math.abs(v);
            int shift;
            if (u == 0 || v == 0)
                return u | v;
            for (shift = 0; ((u | v) & 1) == 0; ++shift) {
                u >>= 1;
                v >>= 1;
            }

            while ((u & 1) == 0)
                u >>= 1;

            do {
                while ((v & 1) == 0)
                    v >>= 1;

                if (u < v) {
                    v -= u;
                } else {
                    int diff = u - v;
                    u = v;
                    v = diff;
                }

                v >>= 1;
            }
            while (v != 0);

            return u << shift;
        }
    }

    static class Kuratsuba {
        static BigInteger mult(BigInteger x, BigInteger y) {
            int N = Math.max(x.bitLength(), y.bitLength());
            if (N <= 2000) return x.multiply(y);
            N = (N / 2) + (N % 2);
            BigInteger x2 = x.shiftRight(N);
            BigInteger x1 = x.subtract(x2.shiftLeft(N));
            BigInteger y2 = y.shiftRight(N);
            BigInteger y1 = y.subtract(y2.shiftLeft(N));
            BigInteger x1y1 = mult(x1, y1);
            BigInteger x2y2 = mult(x2, y2);
            BigInteger x1x2y1y2 = mult(x1.add(x2), y1.add(y2));
            return x1y1.add(x1x2y1y2.subtract(x1y1).subtract(x2y2).shiftLeft(N)).add(x2y2.shiftLeft(2 * N));
        }
    }

    }