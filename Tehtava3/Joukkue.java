import java.util.ArrayList;

// Tää luokka kuvaa kokonaisen jalkapallojoukkueen
public class Joukkue {

    private String nimi;
    private String valmentaja;
    private String kotipaikkakunta;
    private String kotistadion;
    private ArrayList<Pelaaja> pelaajat;

    // Konstruktori – annetaan perusjutut joukkueesta
    public Joukkue(String nimi, String valmentaja, String kotipaikkakunta, String kotistadion) {
        this.nimi = nimi;
        this.valmentaja = valmentaja;
        this.kotipaikkakunta = kotipaikkakunta;
        this.kotistadion = kotistadion;
        this.pelaajat = new ArrayList<>();
    }

    // Pelaajan lisäysjoukkueeseen
    public void lisaaPelaaja(Pelaaja pelaaja) {
        pelaajat.add(pelaaja); // ei tarkisteta rajoja tässä tehtävässä
    }

    // Getterit
    public String getNimi() {
        return nimi;
    }

    public String getValmentaja() {
        return valmentaja;
    }

    public String getKotipaikkakunta() {
        return kotipaikkakunta;
    }

    public String getKotistadion() {
        return kotistadion;
    }

    public ArrayList<Pelaaja> getPelaajat() {
        return pelaajat;
    }

    // Setterit
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setValmentaja(String valmentaja) {
        this.valmentaja = valmentaja;
    }

    public void setKotipaikkakunta(String kotipaikkakunta) {
        this.kotipaikkakunta = kotipaikkakunta;
    }

    public void setKotistadion(String kotistadion) {
        this.kotistadion = kotistadion;
    }
}

