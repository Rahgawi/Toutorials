public class Punkt2DTest {


    public static  void main(String[]args)
    {
        Punkt2D p1 = new Punkt2D();

        p1.x = 2;
        p1.y = 4;
        System.out.println("Punkt1" + p1.ToString());

        Punkt2D p2 = new Punkt2D(3,5);
        System.out.println("Punkt2" + p2.ToString());

        Punkt2D p3 = new Punkt2D(p1);
        p3.x = p1.x;
        p3.y = p1.y;
        System.out.println("Punkt3" + p3.ToString());

        System.out.println();

        Punkt2D eP =p1.verschiebeUm(-2.0,5.3);
        Punkt2D zP =p2.moveTo(3.8,-12.4);
        Punkt2D dP =p3.verschiebeUm(-1.0,1.0);


        System.out.println(eP.ToString());
        System.out.println(zP.ToString());
        System.out.println(dP.ToString());


        Strecke s1 = new Strecke(p1,p2);
        Punkt2D eM = s1.mittelpunkt(p1,p2);
        System.out.println("Strecke1" + s1.ToString());
        System.out.println("Mittelpunkt s1" + eM.ToString());






    }














}
