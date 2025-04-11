// Tällä testiluokalla testaan että mun Laiva-luokka toimii oikein
public class LaivaTest {
    public static void main(String[] args) {

        // Tehdään pari laivaa eri tiedoilla
        Laiva laiva1 = new Laiva("Titanic", 269.1, 10.54, 21);
        Laiva laiva2 = new Laiva("Titanic", 269.1, 10.54, 22); // melkein sama kuin laiva1, mutta nopeus eri
        Laiva laiva3 = new Laiva("Bore", 120.0, 6.5, 18);

        // Tulostetaan laivojen tiedot toStringin avulla
        System.out.println("--- Laivojen tiedot ---");
        System.out.println(laiva1);
        System.out.println(laiva2);
        System.out.println(laiva3);

        // Testataan equals-metodia, eli onko laivat "samoja"
        System.out.println("\n--- Yhtäsuuruustestit ---");
        System.out.println("laiva1.equals(laiva2): " + laiva1.equals(laiva2)); // pitäisi olla true, koska nimi, pituus ja syväys on samat
        System.out.println("laiva1.equals(laiva3): " + laiva1.equals(laiva3)); // pitäisi olla false

        // Testataan matkan kulkuaikaa – kuinka kauan kestää mennä 100 km
        System.out.println("\n--- Matka-aikaesimerkit ---");
        double matka = 100.0; // kilometreinä
        System.out.printf("Matka-aika laivalla1 (%.1f km): %.2f tuntia\n", matka, laiva1.laskeMatkaAika(matka));
        System.out.printf("Matka-aika laivalla3 (%.1f km): %.2f tuntia\n", matka, laiva3.laskeMatkaAika(matka));
    }
}

