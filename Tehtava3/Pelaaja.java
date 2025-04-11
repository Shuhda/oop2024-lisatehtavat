// Tää luokka kuvaa yksittäistä jalkapallopelaajaa
public class Pelaaja {

    private String nimi;
    private String pelipaikka; // esim. "maalivahti", "puolustaja", jne.
    private int pelinumero;

    // Konstruktori – tehdään uusi pelaaja näillä tiedoilla
    public Pelaaja(String nimi, String pelipaikka, int pelinumero) {
        this.nimi = nimi;
        this.pelipaikka = pelipaikka;
        this.pelinumero = pelinumero;
    }

    // Getterit
    public String getNimi() {
        return nimi;
    }

    public String getPelipaikka() {
        return pelipaikka;
    }

    public int getPelinumero() {
        return pelinumero;
    }

    // Setterit
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setPelipaikka(String pelipaikka) {
        this.pelipaikka = pelipaikka;
    }

    public void setPelinumero(int pelinumero) {
        this.pelinumero = pelinumero;
    }
}

