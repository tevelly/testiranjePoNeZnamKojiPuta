// Greška kod prikaza rezultata nije 0.2500 nego 0.3333
import java.util.Scanner;
public class zadatak_problemski_5_3_b {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.printf("Ispis recipročnih vrijednosti prvih n " +
        "prirodnih brojeva. Rezultate treba ispisati na 4 decimalna " +
        "mjesta te svaku vrijednost ispisati u novi redak. " +
        "Na primjer ako je n=3, to su brojevi: 1.0000, 0.5000 i 0.2500");
        System.out.println("Unesi dva prirodna broja p i n");
        System.out.print("Unesite broj p: ");
        int p = in.nextInt();
        System.out.print("Unesite broj n: ");
        int n = in.nextInt();
        if (p<n){
            for (int i = p; i <= n; i++) {
                System.out.println("i = " + i);
            }
        }
        else{
            p=2;
            n=8;
            for (int i = p; i <= n; i++) {
                System.out.println("i = " + i);
            }

        }
    }
}