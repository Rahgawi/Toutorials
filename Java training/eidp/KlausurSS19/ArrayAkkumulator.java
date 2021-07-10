package eidp.KlausurSS19;

public class ArrayAkkumulator {

    public static int [ ] akkumulator ( int [ ] a ) {
        int [ ] b = new int [ a . length ] ;
        int s = 0 ;
        for ( int i = 0 ; i < b . length ; i ++ ) {
            s = s + a [ i ] ;
            b [ i ] = s ;
        }
        return b ;
    }












}
