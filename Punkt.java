public class Punkt {

    private double i_punktX;
    private double i_punktY;

    public Punkt(double _i_punktX, double _i_punktY)
    {
        this.i_punktX = _i_punktX;
        this.i_punktY = _i_punktY;
    }

    public Punkt translate(double X, double Y)
    {
       Punkt p = new Punkt(i_punktX,i_punktY);
       p.i_punktX += X;
       p.i_punktY += Y;
       return p;
    }

    public Punkt scale (double _scale)
    {
        Punkt p = new Punkt(i_punktX,i_punktY);
        p.i_punktX *= _scale;
        p.i_punktY *= _scale;
        return p;
    }

    @Override
    public String toString()
    {
        return i_punktY + " " + i_punktX;
    }

    public double getX()
    {
        return i_punktX;
    }

    public double getY()
    {
        return i_punktY;
    }
}
