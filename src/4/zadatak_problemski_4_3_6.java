/*
Zadatak problemski 4.3.6
Zbroj brojeva
Napiši program u koji će se unositi tri prirodna broja a, b i c.
Potrebno je ispitati je li jedan od učitanih brojeva jednak zbroju drugih
dvaju učitanih brojeva.
Ako jest, taj će se zbroj ispisati na zaslonu računala.
U suprotnom ispisat će se poruka da niti jedan od učitanih brojeva
nije moguće prikazati kao zbroj preostalih dvaju brojeva.
Zadatak riješi koristeći se naredbom if-else.

ULAZNI PODATCI
∙ u varijablu a učitati treba prirodni broj
∙ u varijablu b učitati treba prirodni broj
∙ u varijablu c učitati treba prirodni broj

IZLAZNI PODATCI
∙ ispisauje se ako je moguće traženi zbroj;
  u suprotnom ispisuje se poruka da nije moguće ispisati zbroj

PRIMJER TEST-PODATAKA
Ulaz 	Izlaz
---------------------------------------------
|4                                          |
|5                                          |
|1 	    4 + 1 = 5                           |
|___________________________________________|
|4                                          |
|5   Niti jedan broj nije moguce prikazati  |
|3 	kao zbroj preostalih dvaju brojeva.     |
---------------------------------------------

MALA POMOČ:
- bilo bi dobro da su i brojevi koji se unose veći od nule.
- a + b = c
- a + c = b
- b + c = b
 */

import java.util.Scanner;
public class zadatak_problemski_4_3_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int prvi, drugi, treci, suma;
        System.out.print("Upišite prvi broj: ");
        prvi = in.nextInt();
        System.out.print("Upišite drugi broj: ");
        drugi = in.nextInt();
        System.out.print("Upišite treći broj: ");
        treci = in.nextInt();

        if (prvi + drugi == treci) {
            System.out.println(prvi + "+" + drugi + "=" + treci);
        } else if (prvi + treci == drugi) {
            System.out.println(prvi + "+" + treci + "=" + drugi);
        } else if (drugi + treci == prvi) {
            System.out.println(drugi + "+" + treci + "=" + prvi);
        } else {
            System.out.println("Niti jedan broj nije moguce prikazati kao zbroj preostalih dvaju brojeva.");
        }
    }
}