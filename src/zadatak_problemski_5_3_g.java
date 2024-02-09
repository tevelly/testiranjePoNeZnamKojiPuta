/*
Ispis parnih prirodnih brojeva od 2 do n. 
Na primjer ako je n=8, to su brojevi: 2,4,6 i 8.
 */
import java.util.Scanner;

public class zadatak_problemski_5_3_g {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Unesite broj do kojeg želite ispis parnih brojeva");
        int uneseniBroj = in.nextInt();

        //jedan način
        for (int i = 2; i <= uneseniBroj; i+=2) {
            System.out.println("i = " + i);
            
        }
        //drugi način
        for (int j = 2; j <= uneseniBroj; j++) {
            if(j%2==0){
                System.out.println("Drugi način j = " + j);
            }
        }
    }
}
