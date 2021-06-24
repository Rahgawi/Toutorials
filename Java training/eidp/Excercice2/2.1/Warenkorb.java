public class Warenkorb {

    double betrag;
    Artikel Art1;
    double rechnungsbetrag;

    public Warenkorb(double betrag,double rechnbetrag)
    {
        this.betrag          = betrag;
        this.rechnungsbetrag = rechnbetrag;
    }

    public double getBetrag()
    {
        return betrag;
    }

    public void kaufen (Artikel art1)
    {
        betrag= rechnungsbetrag + art1.getVerkaufspreis();
    }

    public double rechnungStellen()
    {
        betrag = 0.0;
        return rechnungsbetrag;

    }




}
