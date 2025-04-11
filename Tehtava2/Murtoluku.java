// Tää luokka mallintaa murtolukua, esim. 2/3 tai 5/7
public class Murtoluku implements Comparable<Murtoluku> {

    private int osoittaja;
    private int nimittaja;

    // Konstruktori – kun tehdään uusi murtoluku, annetaan osoittaja ja nimittäjä
    public Murtoluku(int osoittaja, int nimittaja) {
        this.osoittaja = osoittaja;
        this.nimittaja = nimittaja;
    }

    // Getterit, eli näillä voi tarkistaa mitä arvoja on annettu
    public int getOsoittaja() {
        return osoittaja;
    }

    public int getNimittaja() {
        return nimittaja;
    }

    // Tällä saa murtoluvun desimaalimuodossa esim. 2/3 = 0.666...
    public double toDouble() {
        return (double) osoittaja / nimittaja;
    }

    // Tulostusmuoto tyyliin "2/3" – toimii kun printataan olio
    @Override
    public String toString() {
        return osoittaja + "/" + nimittaja;
    }

    // Tämän avulla voi vertailla murtolukuja – toimii esim. listojen järjestelyssä
    @Override
    public int compareTo(Murtoluku toinen) {
        double eka = this.toDouble();
        double toka = toinen.toDouble();

        if (eka < toka) return -1;
        else if (eka > toka) return 1;
        else return 0;
    }
}

