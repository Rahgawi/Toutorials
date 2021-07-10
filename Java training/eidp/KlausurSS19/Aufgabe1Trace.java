package eidp.KlausurSS19;

public class Aufgabe1Trace {
  public static void main (String[]arg)
  {

     int n =10;
      int i = 1 ;
      int j = 1 ;
      int s = 0 ;
      System.out.println("n: "+n);
      System.out.println("i: "+i);
      System.out.println("J: "+j);
      System.out.println("S: "+s+"\n\n");

      while ( s < n ) {
          if ( j ==2 ) {
              j = 0 ;
              s = s + i ;
              System.out.println("n: "+n);
              System.out.println("i: "+i);
              System.out.println("J: "+j);
              System.out.println("S: "+s+"\n\n");
          }
          i = i + 1;
          j = j + 1;
          System.out.println("n: "+n);
          System.out.println("i: "+i);
          System.out.println("J: "+j);
          System.out.println("S: "+s+"\n\n");
      }
      i= i/2;
      System.out.println("n: "+n);
      System.out.println("i: "+i);
      System.out.println("J: "+j);
      System.out.println("S: "+s+"\n\n");
  }
  }




















