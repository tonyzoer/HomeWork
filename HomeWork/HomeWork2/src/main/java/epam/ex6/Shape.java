package epam.ex6;

/**
 * Created by mafio on 07.11.2016.
 */
 public abstract class Shape {
    protected Double square;
    public Double getSumOfSquares(Shape s){return this.getSquare()+s.getSquare();}
    public Double getSquare(){return square;}
    protected abstract  Double findSquare();
}
