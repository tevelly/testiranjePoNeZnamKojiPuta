import java.util.Scanner;
public class zadatak_problemski_5_1_do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n;
        System.out.println("Unesite broj od kojeg želite odbrojavati: ");
        i = in.nextInt();
        System.out.println("Unesite broj do kojeg želite odbrojavati: ");
        n = in.nextInt();
        /*
        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        do {
            System.out.println("Broj je: " + i);
            i++;
        }while (i<=n);

         */
        /*
        bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
        do {
            System.out.print("# ");
            i++;
        }
        while (i<=n);

         */
        /*cccccccccccccccccccccccccccccccccccccccccccccc
        do {
            System.out.println("i kvadrat= " + i*i);
            i++;
        }while (i<n);

         */

        do {
            System.out.println(i);
        }
    }
}
