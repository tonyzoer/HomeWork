package epam.ex6;

/**
 * Created by mafio on 07.11.2016.
 */
public class Ring  extends Shape{
    private Double r1;
    private Double r2;


    public Ring(Double r1, Double r2) {
        Double localr1=Math.abs(r1);
        Double localr2=Math.abs(r2);
        this.r1 = localr1;
        this.r2 = localr2;
        findSquare();
          }

    @Override
    protected Double findSquare() {
        square=(r1 > r2)?Math.PI*Math.pow(r1,2)-Math.PI*Math.pow(r2,2):Math.PI*Math.pow(r2,2)-Math.PI*Math.pow(r1,2);
        return square;
    }
}
