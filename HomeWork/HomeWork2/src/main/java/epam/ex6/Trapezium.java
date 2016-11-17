package epam.ex6;

/**
 * Created by mafio on 07.11.2016.
 */
public class Trapezium extends Shape {
    private Double ab;
    private Double bc;
    private Double cd;
    private Double ad;
    private Double alpha;//кут БАД
    private Double beta;//кут СДА
    private Double h;
    public Trapezium(Double ab, Double bc, Double cd, Double ad, Double alpha, Double beta) {
    Double localAlpha=alpha;
        Double localBeta=beta;
        if (localAlpha<0)
        {
            localAlpha=-localAlpha;
        }
        if (localBeta<0)
        {
            localBeta=-localBeta;
        }
        if(localAlpha>180)
        {
            int n= (int) (localAlpha/180);
            localAlpha-=n*180;
        }
        if(localBeta>180){
            int n= (int) (localBeta/180);
            localAlpha-=n*180;
        }
        this.ab = Math.abs(ab);
        this.bc = Math.abs(bc);
        this.cd = Math.abs(cd);
        this.ad = Math.abs(ad);
        this.alpha = localAlpha;
        this.beta = localBeta;
        findSquare();
    }

    //Getters
    public Double getAb() {
        return ab;
    }

    public Double getBc() {
        return bc;
    }

    public Double getCd() {
        return cd;
    }

    public Double getAd() {
        return ad;
    }

    public Double getAlpha() {
        return alpha;
    }

    public Double getBeta() {
        return beta;
    }

    public Double getH() {
        return h;
    }


    @Override
    protected Double findSquare() {
        h=Math.sin(Math.toRadians(alpha))*ab;
        square=((bc+ad)/2)*h;
        return square;
    }
}
