/*
Zadatak problemski 4.2.9
Jednakostranični trokut
Napiši program u koji će se unositi pozitivan realni broj, koji predstavlja duljinu stranice jedna- kostraničnog trokuta. Ako učitani broj nije pozitivan broj, na zaslon treba ispisati poruku Duljina stranice mora biti pozitivni broj i potom prekinuti s izvođenjem programa. Potrebno je izračunati i na zaslon ispisati površinu tog trokuta.

ULAZNI PODATCI
 ∙
 u varijablu x treba učitati realni broj koji predstavlja duljinu stranice trokuta

IZLAZNI PODATCI
∙ treba ispisati površinu trokuta ako je stranica pozitivan realni broj
∙ treba ispisati poruku da duljina stranice mora biti pozitivan broj

PRIMJER TEST-PODATAKA
Ulaz 	Izlaz
2.3 	Povrsina trokuta: 2.29
–1.4 	Duljina stranice mora biti pozitivni broj
 */

import java.util.Scanner;
public class zadatak_problemski_4_2_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double stranica, povrsina, tri;
        tri = 3;
        System.out.print("Unesite stranicu a: ");
        stranica = in.nextDouble();

        if (stranica>0){
            povrsina = Math.sqrt(tri)*Math.pow(stranica, 2d) / 4;
            System.out.println("stranica = " + stranica);
            System.out.println("povrsina = " + povrsina);
        }


    }
}
