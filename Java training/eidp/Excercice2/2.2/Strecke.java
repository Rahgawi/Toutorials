public class Strecke {


    Punkt2D startpunkt;
    Punkt2D endpunkt;

    public Strecke(Punkt2D sp,Punkt2D ep)
    {
        this.startpunkt = sp;
        this.endpunkt   = ep;


    }

    public Punkt2D getStartpunkt()
    {
        return startpunkt;
    }

    public void setStart(Punkt2D p)
    {
        this.startpunkt = p;
    }

    public Punkt2D getEndpunkt()
    {
        return endpunkt;
    }

    public void setEnde(Punkt2D p)
    {
        this.endpunkt = p;
    }

    public Punkt2D mittelpunkt(Punkt2D P,Punkt2D Q)
    {
        Punkt2D M = new Punkt2D();
        M.x = (P.x + Q.x) / 2;
        M.y = (P.y + Q.y) / 2;
        return M;


    }

    public String ToString()
    {
        String str1 = "[(" + startpunkt.x + "," + startpunkt.y + ")" +
                      ",(" + endpunkt.x + "," + endpunkt.y + ")]";
        return str1;
    }




}
