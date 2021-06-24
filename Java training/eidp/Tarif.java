package eidp;

import java.util.Scanner;

public class Tarif {

  double basisPreis1=12.75;
  double basisPreis2=22.89;
  double GesamtPreisT1;
  double GesamtPreisT2;




  public double Tarif1(int dauer)
{
     return GesamtPreisT1=(dauer*0.05)+basisPreis1;

}
  public double Tarif2(int dauer)
  {
    return GesamtPreisT2= (dauer*0.02)+basisPreis2;
  }

public String beeserWeschsele(){


      if(GesamtPreisT2<GesamtPreisT1)
      {
        return "Tarif2 ist günstiger.";

      }

  return "Tarif2 ist teurer oder gleich";

}




public static void main(String[]args)
{
  Tarif t = new Tarif();


 double vodafone= t.Tarif1(400);
 double o2      = t.Tarif2(400);
  System.out.println(vodafone);
  System.out.println(o2);

  String tarif1 =t.beeserWeschsele();
  String tarif2 =t.beeserWeschsele();

  System.out.println(tarif1);
  System.out.println(tarif2);




}


}
