/*
Zadatak problemski 4.2.7
Funkcija
Napiši program u koji će se unositi realni broj x te se računa vrijednost funkcije:
f(x)={  x2+5,x≥2
         ____
        √x2+2,x<2

ULAZNI PODATCI
∙ u varijablu x treba učitati realni broj

IZLAZNI PODATCI
∙ treba ispisati vrijednosti funkcije

PRIMJER TEST-PODATAKA
Ulaz 	Izlaz
2 	    9.00
1 	    1.73
 */

import java.util.Scanner;
public class zadatak_problemski_4_2_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, temp;
        double rez=0;
        System.out.println("Unesite realni broj x: ");
        x = in.nextInt();

        if (x >= 2){
            rez = x*x + 5;
        }
        else if (x<2){
            temp = x*x + 2;
            rez = Math.sqrt (temp);
        }
        System.out.println("rez = " + rez);

        // ispis rezultata na dva decimlna mjesta
        System.out.format("%.2f", rez);
    }
}
