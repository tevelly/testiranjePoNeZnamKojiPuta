/*
Zadatak problemski 5.2
Napiši program za ispis:
a) prirodnih brojeva od 1 do n.
   Pretpostavi da će n biti točno upisan (n>1).
b) prvih n prirodnih brojeva u obrnutom redoslijedu, od n do 1.
   Ako je n krivo zadan, prekida se izvođenje programa (n>1).
c) prirodnih brojeva od 3 do n, pri čemu je n prirodni broj veći od 3.
   U slučaju da je n krivo zadan, ispisuju se brojevi od 3 do 11.
d) velikih slova engleske abecede od A do Z.
   Ispis napraviti u jednom redu bez razmaka.
e) malih slova engleske abecede od z do a.
   Ispis treba napraviti tako da svako slovo bude u novom redu.

   Sve podzadatke riješi na 3 načina: preko petlji
   for,
   while i
   do-while.
   U svim podzadatcima gdje se spominje varijabla n,
   potrebno ju je učitati s tipkovnice.
 */
import java.util.Scanner;
public class zadatak_problemski_5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        System.out.print("Unesite broj do kojeg želite brojati: ");
        int n= in.nextInt();
        /*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        if (n>1){
            for (i=1; i<=n; i++){
                System.out.println("i = " + i);
            }
        }
        */

        /*bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
        System.out.println("ispis brojeva od kojeg ste upisali do 1");
        if (n>1){
            for (i=1; n>=i ;n--) {
                System.out.println("n = " + n);
            }
        }else
            System.out.println("Upisati broj veći od 1!");
         */
        /*ccccccccccccccccccccccccccccccccccccccccc
        if (n>3){
            for (i=3; n>=i; i++){
                System.out.println("i = " + i);
            }
        }
        else{
            for (i=3; i<=11; i++){
                System.out.println("i = " + i);
            }
        }
         */
        /*ddddddddddddddddddddddddddddddddddddddd
        for (char a='A'; a<='Z'; a++){
            System.out.print("Slovo - " + a);
        }
         */
        /*eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
        for (char a='a'; a<='z'; a++){
            System.out.print(" " + a);
        }

         */


    }
}
