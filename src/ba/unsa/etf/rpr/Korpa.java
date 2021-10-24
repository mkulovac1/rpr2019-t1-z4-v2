package ba.unsa.etf.rpr;

public class Korpa {

    Artikl[] artikli = new Artikl[50];
    static int brojac = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbaceniArtikal = null;
        for(int i = 0; i < brojac; i++) {
            if(artikli[i].kod.equals(kod)) {
                izbaceniArtikal = new Artikl(artikli[i].naziv, artikli[i].cijena, artikli[i].kod);

                //if (brojac - (i + 1) >= 0) System.arraycopy(artikli, i + 1, artikli, i + 1 - 1, brojac - (i + 1));

                for(int j = i + 1; j < brojac; j++) {
                    artikli[j - 1] = artikli[j];
                }
                i--; brojac--;
            }
        }
        return izbaceniArtikal;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for (Artikl artikl : artikli)
            ukupnaCijena = ukupnaCijena + artikl.cijena;
        return ukupnaCijena;
    }

    public boolean dodajArtikl(Artikl a) {
        if(brojac > 50)
            return false;
        artikli[brojac] = new Artikl(a.naziv, a.cijena, a.kod);
        brojac++;
        return true;
    }
}
