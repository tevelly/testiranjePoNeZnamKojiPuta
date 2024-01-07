/*
Zadatak problemski 4.3.4
Srednji po veličini
Napiši program u koji će se unositi tri različita realna broja
(nije potrebno provjeravati jesu li učitani brojevi različiti).
Na zaslon treba ispisati srednji po veličini učitani broj.
Zadatak riješi koristeći se naredbom if-else.
______________________________________________________________
MALA POMOĆ:
prvi > drugi > treći ILI prvi < drugi < treći
treba biti zadovoljeno da ispiše da je drugi srednji

drugi > prvi > treći ILI drugi < prvi < treći
treba biti zadovoljeno da ispiše da je prvi srednji
______________________________________________________________
ULAZNI PODATCI
∙ u varijablu a treba učitati realni broj
∙ u varijablu b treba učitati realni broj
∙ u varijablu c treba učitati realni broj

IZLAZNI PODATCI
∙ treba ispisati srednji po veličini realni broj

PRIMJER TEST-PODATAKA
Ulaz 	Izlaz
1.5     3.00
7.8
3.0
 */
import java.util.Scanner;
public class zadatak_problemski_4_3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double prvi, drugi, treci;
        System.out.println("Ispis broja koji je srednji po veličini.");
        System.out.println("Unesite prvi broj: ");
        prvi = in.nextDouble();

        System.out.println("Unesite drugi broj: ");
        drugi = in.nextDouble();

        System.out.println("Unesite treci broj: ");
        treci = in.nextDouble();

        if((prvi > drugi && drugi > treci) || (drugi > prvi && treci > drugi) ){
            System.out.println("drugi = " + drugi);
        }
        else if( (drugi > prvi && prvi > treci) || (drugi < prvi && prvi < treci) ){
            System.out.println("prvi = " + prvi);
        }
        else{
            System.out.println("treci = " + treci);
        }
    }
}
