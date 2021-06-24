public class Artikel {


    String bezeichnung;
    int    artikelnr;
    double verkaufspreis;

public Artikel(String bez,int artnr,double vkPreis)
{

    this.bezeichnung    =  bez;
    this.artikelnr      =  artnr;
    this.verkaufspreis  =  vkPreis;
}

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public int getArtikelnr()
    {
        return artikelnr;
    }

    public double getVerkaufspreis()
    {
        return verkaufspreis;
    }




}
