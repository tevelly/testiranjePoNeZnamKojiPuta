/*
Zadatak problemski 5.1
Napiši program za ispis:
a) prirodnih brojeva od 1 do 7 tako da svaki broj bude u novom retku.
b) 10 znakova # tako da razmak između svakog znaka bude 1 mjesto.
c) ispis kvadrata prirodnih brojeva od 1 do 5 tako da brojevi budu
   ispisani jedan do drugog s jednim mjestom razmaka.
d) prirodnih brojeva od 2 do 12 tako da brojevi budu ispisani jedan ispod drugoga.
e) prirodnih brojeva od 12 do 2 tako da brojevi budu ispisani jedan pored
   drugoga s jednim mjestom razmaka.
 */
import java.util.Scanner;
public class zadatak_problemski_5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Unesite broj do kojeg želite broj ponavljanja:");
        int brojPonavljanja = in.nextInt();

        /* aaaaaaaaaaaaaaa
        for (int i = 0; i < brojPonavljanja; ++i) {
            System.out.println("i = " + i);
        }
        */

        /*bbbbbbbbbbbb
        for (int i = 0; i < brojPonavljanja; i++) {
            System.out.print("# ");
        }
        */

        /*ccccccccccc
        for (int i = 0; i < brojPonavljanja; i++) {
            System.out.print(" " + i*i);
        }
        */
        /*ddddddddddd
        for (int i = 2; i <= 12; i++) {
            System.out.println("i = " + i);
        }
        */
        /*eeeeeeeeeee
        for (int i = 12; i >=2 ; i--) {
            System.out.println("i = " + i);
        }
        */

/*
        System.out.println("brojPonavljanja = " + brojPonavljanja);
        System.out.println("brojPonavljanja = " + ++brojPonavljanja);
        System.out.println("brojPonavljanja = " + brojPonavljanja++);
        System.out.println("brojPonavljanja = " + brojPonavljanja);
*/

    }
}
