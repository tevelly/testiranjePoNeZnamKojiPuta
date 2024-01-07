/*
Zadatak problemski 4.3.10
Ples sa zvijezdama
slika 04-09.jpgU zabavnoj emisiji "Ples sa zvijezdama" glasački žiri
ocjenjuje ples parova.
Svatko od četiriju članova žirija paru daje ocjenu od 1 do 10.
Ukupna ocjena za taj plesački par je zbroj ocjena svih članova žirija,
koja se preračunava na broj osvojenih zvjezdica.
Tvoj je zadatak napisati program koji će ispisivati poruku koliko je par
dobio zvjezdica na način kako je prikazano tablicom:

Ukupno postignut broj bodova 	Ispis poruke
30 – 40 	Par je osvojio 5 zvjezdica
20 – 29 	Par je osvojio 4 zvjezdice
10 – 19 	Par je osvojio 3 zvjezdice
00 – 09 	Par je osvojio 2 zvjezdice

Zadatak riješi na dva načina: koristeći se naredbom if else i naredbom switch case.
Napomena: Ulazni podatci o dodijeljenom broju bodova moraju biti iz intervala[1,10]
 i nije potrebno provjeravati je li ih korisnik točno upisao.

ULAZNI PODATCI
∙ prirodan broj a koji predstavlja broj bodova prvog člana žirija
∙ prirodan broj b koji predstavlja broj bodova drugog člana žirija
∙ prirodan broj c koji predstavlja broj bodova trećeg člana žirija
∙ prirodan broj d koji predstavlja broj bodova četvrtog člana žirija

IZLAZNI PODATCI
∙ treba ispisati broj zvjezdica koje je dobio plesački par

PRIMJER TEST-PODATAKA
Ulaz 	Izlaz
7       Par je osvojio 4 zvjezdice.
8
5
6
 */

import java.util.Scanner;
public class zadatak_problemski_4_3_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int prvi, drugi, treci, cetvrti, suma;

        System.out.print("Unesite prvi broj: ");
        prvi = in.nextInt();
        System.out.println("Unesite drugi broj: ");
        drugi = in.nextInt();
        System.out.println("Unesite treci broj: ");
        treci = in.nextInt();
        System.out.println("Unesite cetvrti broj: ");
        cetvrti = in.nextInt();

        suma = prvi + drugi + treci + cetvrti;

        switch (suma){
            case (suma<10):
                System.out.println("Par je osvojio 2 zvjezdice\n");
                break;
        }
    }
}
