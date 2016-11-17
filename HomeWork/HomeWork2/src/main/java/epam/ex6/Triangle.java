package epam.ex6;

/**
 * Created by mafio on 07.11.2016.
 */
public class Triangle extends Shape{
    private Double a;
    private Double b;

    private Double p;

    private Double c;
    public Triangle(Double a, Double b, Double c) {
        Double loca=Math.abs(a);
        Double locb=Math.abs(b);
        Double locc=Math.abs(c);
        if (loca+locb>locc&&locb+locc>loca&&locc+loca>locb){
            this.a = loca;
            this.b = locb;
            this.c = locc;
            findSquare();
        }

    }
    @Override
    protected Double findSquare() {
        p=(a + b + c)/2;
        square=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return square;
    }

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    public Double getP() {
        return p;
    }

    public Double getC() {
        return c;
    }
}
