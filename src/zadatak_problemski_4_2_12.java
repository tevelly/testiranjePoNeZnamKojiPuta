/*
Ima pogreška u zadatku kod IZLAZNIH PODATAKA I PRIMJER TEST-PODATAKA
Zadatak problemski 4.2.12
Zamjena sadržaja varijabla
Napiši program u koji će se unositi dva prirodna broja x
 i y, pri čemu y mora biti barem dva puta veći od x. Ako drugi učitani broj nije veći barem dva puta od prvog, treba dojaviti poruku Pogresno zadani brojevi i prekinuti s izvođenjem programa. Inače, treba zamijeniti vrijednosti varijabli x i y te ispisati njihove zamijenjene vrijednosti.

ULAZNI PODATCI
∙ u varijablu x treba učitati prvi prirodni broj
∙ u varijablu y treba učitati drugi prirodni broj

IZLAZNI PODATCI
∙ ako je prvi dva puta veći od drugog, treba zamijeniti sadržaje varijabli
∙ ako unos nije točan, treba dojaviti porukom o neispravnom unosu

PRIMJER TEST-PODATAKA
Ulaz 	Izlaz
2       Pogresno zadani brojevi
3
----------------------------------------
2       x = 10
10 	    y = 2
 */
import java.util.Scanner;
public class zadatak_problemski_4_2_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int prvi, drugi, prviDvaPutaVeci;
        System.out.println("Drugi broj treba biti 2x veći od prvog da bi se zamijenili!");
        System.out.print("Unesite prvi broj: ");
        prvi = in.nextInt();
        System.out.print("Unesite drugi broj: ");
        drugi = in.nextInt();
        prviDvaPutaVeci = 2 * prvi;
        System.out.println("prviDvaPutaVeci = " + prviDvaPutaVeci);
        if ( drugi >=  prvi * 2){
            int temp;
            temp = prvi;
            prvi = drugi;
            drugi = temp;
        }
        else {
            System.out.println("Pogrešno zadani brojevi, molim ponovni unos!");
        }
        System.out.println("Drugi puta prvi = " + prvi);
        System.out.println("Drugi puta drugi = " + drugi);
    }
}
