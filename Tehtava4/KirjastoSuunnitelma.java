/**
 * Tämä tiedosto sisältää luokkasuunnitelmat kirjastojärjestelmälle.
 * Suunnitelmassa on asiakkaita, henkilökuntaa ja lainattavia tuotteita.
 * Toteutusta ei ole, vain rakenteet ja Javadoc-kommentit.
 */
public class KirjastoSuunnitelma {

    /**
     * Asiakas voi lainata ja varata tuotteita.
     */
    public class Asiakas {
        private String nimi;
        private String asiakasnumero;

        /**
         * Asiakas tekee varauksen lainassa olevaan tuotteeseen.
         * @param tuote Tuote jota halutaan varata
         */
        public void teeVaraus(Lainattava tuote) {}

        /**
         * Asiakas lainaa tuotteen.
         * @param tuote Lainattava tuote
         */
        public void lainaa(Lainattava tuote) {}
    }

    /**
     * Henkilökunta voi hallita kirjaston sisältöä.
     */
    public class Henkilo {
        private String nimi;
        private String tunnus;

        /**
         * Lisää uusi tuote kirjastoon.
         * @param tuote Uusi lainattava tuote
         */
        public void lisaaTuote(Lainattava tuote) {}

        /**
         * Poistaa tuotteen kirjastosta.
         * @param tuote Poistettava tuote
         */
        public void poistaTuote(Lainattava tuote) {}
    }

    /**
     * Abstrakti pohjaluokka kaikille lainattaville asioille.
     */
    public abstract class Lainattava {
        private String nimi;
        private String id;

        /**
         * Palauttaa tuotteen tiedot.
         * @return Tuotteen kuvaus
         */
        public abstract String haeTiedot();
    }

    /**
     * Kirja on lainattava tuote.
     */
    public class Kirja extends Lainattava {
        private String kirjailija;

        @Override
        public String haeTiedot() {
            return null;
        }
    }

    /**
     * Äänilevy on lainattava tuote.
     */
    public class Aanilevy extends Lainattava {
        private String artisti;

        @Override
        public String haeTiedot() {
            return null;
        }
    }

    /**
     * Lautapeli on lainattava tuote.
     */
    public class Lautapeli extends Lainattava {
        private int pelaajienMaara;

        @Override
        public String haeTiedot() {
            return null;
        }
    }

    /**
     * Elokuva on lainattava tuote.
     */
    public class Elokuva extends Lainattava {
        private String ohjaaja;

        @Override
        public String haeTiedot() {
            return null;
        }
    }
}

