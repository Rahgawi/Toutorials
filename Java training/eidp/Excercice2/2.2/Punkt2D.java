public class Punkt2D {
    Punkt2D z;
    double x;
    double y;

    public Punkt2D() //default-Konstruktor
    {
        x=0.0;
        y=0.0;
    }

    public Punkt2D(double x,double y) //Konstruktor mit instanzvariablen
    {
        this.x = x;
        this.y = y;
    }

    public Punkt2D(Punkt2D a )

    {

           z = a.z;
           x = a.x;
           y = a.y;

    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public Punkt2D verschiebeUm(double dx,double dy)
    {
        return new Punkt2D(x + dx,y + dy);
    }

    public Punkt2D moveTo(double x, double y)
    {
        return new Punkt2D(x,y);

    }

    public String ToString()
    {
        String str ="("+x +"|"+y + ")";
        return str;
    }












}
