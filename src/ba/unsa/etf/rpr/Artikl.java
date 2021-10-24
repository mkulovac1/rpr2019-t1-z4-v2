package ba.unsa.etf.rpr;

public class Artikl {
    String naziv;
    int cijena;
    String kod;

    public Artikl(String n, int c, String k) {
        naziv = n; cijena = c; kod = k;
    }

    private Artikl() {}

    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
