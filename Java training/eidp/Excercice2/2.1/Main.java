public class Main {


    public static void main(String[]args)


    {

        Artikel ketchup = new Artikel("ketchi", 23,4.00);

        Warenkorb w1    = new Warenkorb(2.00,4.00);

        System.out.println(w1.betrag);
        w1.kaufen(ketchup);

        System.out.println(w1.betrag);

        System.out.println(w1.rechnungStellen());
        System.out.println(w1.rechnungsbetrag);
        System.out.println(w1.betrag);







    }

















}
