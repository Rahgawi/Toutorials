package eidp.excercise3;

public class KontoTest {


    public static void main(String[]args)
    {
      Person p1 = new Person("Max Mustermann", 40);
      Person p2 = new Person("Mareike Mustermann",37);
      Person p3 = new Person("miaw muck",18);
      Konto K1 = new Konto(p1);
      Konto K2 = new Konto(p2);
      Konto K3 = new Konto(p3);

        System.out.println(K1.getAccNumber());
        System.out.println(K1.getAccNumber());
        System.out.println(K2.getAccNumber());
        System.out.println(K2.getAccNumber());











    }





}
