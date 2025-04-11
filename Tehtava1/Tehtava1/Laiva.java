// Tässä on mun Laiva-luokka, joka kuvaa laivan tietoja ja muutamaa toimintoa
public class Laiva {

    // Perusjutut mitä laivasta tarvitaan: nimi, pituus, syväys ja nopeus solmuina
    private String nimi;
    private double pituus;
    private double syvaus;
    private double nopeusSolmuina;

    // Konstruktori, eli kun tehdään uusi laiva niin nämä arvot pitää antaa
    public Laiva(String nimi, double pituus, double syvaus, double nopeusSolmuina) {
        this.nimi = nimi;
        this.pituus = pituus;
        this.syvaus = syvaus;
        this.nopeusSolmuina = nopeusSolmuina;
    }

    // Tällä metodilla voi laskea kuinka kauan kestää mennä joku tietty matka
    // Matka annetaan kilometreinä ja nopeus muunnetaan solmuista km/h
    public double laskeMatkaAika(double matkaKilometreina) {
        double nopeusKmH = nopeusSolmuina * 1.852; // Solmu muutetaan kilometreiksi
        return matkaKilometreina / nopeusKmH;
    }

    // Tässä vertaillaan kahta laivaa, että onko ne "samoja"
    // Eli katsotaan nimi, pituus ja syväys – jos ne on samat niin laivat on samat
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Laiva laiva = (Laiva) obj;
        return Double.compare(laiva.pituus, pituus) == 0 &&
               Double.compare(laiva.syvaus, syvaus) == 0 &&
               nimi.equals(laiva.nimi);
    }

    // Tällä saadaan laivan tiedot nätisti tulostettua esim. testauksessa
    @Override
    public String toString() {
        return "Laiva: " + nimi + ", pituus: " + pituus + " m, syväys: " + syvaus + " m, nopeus: " + nopeusSolmuina + " solmua";
    }

    // Getterit, näitä voi käyttää testauksessa jos haluaa tarkistaa yksittäisiä arvoja
    public String getNimi() {
        return nimi;
    }

    public double getPituus() {
        return pituus;
    }

    public double getSyvaus() {
        return syvaus;
    }

    public double getNopeusSolmuina() {
        return nopeusSolmuina;
    }
}

