/*
Ispis kvadrata prirodnih brojeva do n.
Ako je n krivo zadan, prekida se izvođenje programa.
Na primjer ako je n=3, to su brojevi: 1, 4 i 9.
 */
import java.util.Scanner;
public class zadatak_problemski_5_3_e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Unesite broj do kojeg želite kvadrat ispisati:");
        int uneseniBroj = in.nextInt();

        if (uneseniBroj<=0){
            System.out.println("unesite broj veći od nule");
        }
        else {
            for (int i = 1; i <= uneseniBroj; i++) {
                System.out.println(i+ " na kvadrat = " + i * i);
            }
        }
    }
}
