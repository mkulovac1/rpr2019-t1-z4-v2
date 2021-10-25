package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] artikli = new Artikl[1000];
    static int brojac;


    public void dodajArtikl(Artikl a) {
        artikli[brojac] = new Artikl(a.naziv, a.cijena, a.kod);
        brojac++;
    }

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


    public int brojArtikala() {
        return brojac;
    }

}
