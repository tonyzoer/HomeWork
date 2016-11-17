package epam.ex6;

/**
 * Created by mafio on 07.11.2016.
 */
public class Parallelogram extends Shape {
    private Double a;
    private Double b;
    private Double alpha;
    public Parallelogram(Double a, Double b,double alpha) {
        Double localAlpha=alpha;
        if (alpha<0)
        {localAlpha=-alpha;}
        if(alpha>180) {
            int n=(int)alpha/180;
            localAlpha-=n*180;
        }
        this.a = Math.abs(a);
        this.b = Math.abs(b);
        this.alpha=localAlpha;
        findSquare();
    }

    @Override
    protected Double findSquare() {
        square=Math.sin(Math.toRadians(alpha))*a*b;
        return square;
    }
}
