import java.util.Scanner;
public class zadatak_problemski_5_2_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /////////////////////////// a)
        /*
        System.out.println("Ispis prirodnih brojeva od 1 do n. Pretpostavi da će n biti točno upisan (n>1)");
        System.out.print("Unesite broj do kojeg želite odbrojavati: ");
        int n= in.nextInt();
        int i=1;
        while (i<=n){
            System.out.println("i = " + i);
            i++;
        }
        */

        /////////////////////////// b)
        /*
        System.out.println("prvih n prirodnih brojeva u obrnutom redoslijedu, od n do 1. " +
                "Ako je n krivo zadan, prekida se izvođenje programa (n>1).");
        System.out.print("Unesite broj od kojeg želite odbrojavati: ");
        int n= in.nextInt();
        int i=1;
        if (n>1){
            while (i<=n){
                System.out.println("n = " + n);
                n--;
            }
        }
        else{
            System.out.println("Upišite broj veći od 1!");
        }
        */

        /////////////////////////// c)
        /*
        System.out.println("prirodnih brojeva od 3 do n, " +
                "pri čemu je n prirodni broj veći od 3. " +
                "U slučaju da je n krivo zadan, ispisuju se brojevi od 3 do 11.");
        System.out.print("Unesite broj od kojeg želite odbrojavati: ");
        int n= in.nextInt();
        int i=3;
        if (n>i){
            while (i<=n){
                System.out.println("i = " + i);
                i++;
            }
        }
        else{
            while (i<=11){
                System.out.println("i = " + i);
                i++;
            }
        }
         */
        /////////////////////////// d)

        char a = 'A', z='Z';
        while (a<=z){
            System.out.print("a = " + a + "; ");
            a++;
        }

    }
}
