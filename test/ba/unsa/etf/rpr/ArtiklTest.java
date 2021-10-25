package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @org.junit.jupiter.api.Test
    void getNaziv() {
        Artikl a = new Artikl("Auto", 18000, "1321");
        assertEquals("Auto", a.getNaziv());
    }

    @org.junit.jupiter.api.Test
    void getCijena() {
        Artikl a = new Artikl("Auto", 18000, "1321");
        assertEquals(18000, a.getCijena());
    }

    @org.junit.jupiter.api.Test
    void getKod() {
        Artikl a = new Artikl("Auto", 18000, "1321");
        assertEquals("1321", a.getKod());
    }

    @org.junit.jupiter.api.Test
    void setNaziv() {
    }

    @org.junit.jupiter.api.Test
    void setCijena() {
    }

    @org.junit.jupiter.api.Test
    void setKod() {
    }
}