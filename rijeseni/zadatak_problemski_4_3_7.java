import java.util.Scanner;
public class zadatak_problemski_4_3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int jedan = 1;
        final int dva = 2;
        final int tri = 3;
        final int cetiri = 4;
        final int pet = 5;

        int jedinice, dvojke, trojke, cetvorke, petice;
        System.out.print("Unesite broj jedinca: ");
        jedinice = in.nextInt();
        System.out.print("Unesite broje dvojki: ");
        dvojke = in.nextInt();
        System.out.print("Unesite broj trojki:");
        trojke = in.nextInt();
        System.out.print("Unesite broj cetvorki:");
        cetvorke = in.nextInt();
        System.out.print("Unesite broj petica:");
        petice = in.nextInt();

        double suma = (dva*dvojke) + (tri*trojke) + (cetiri*cetvorke) + (pet*petice);
        int broj = dvojke + trojke + cetvorke + petice;
        double prosjek = suma / broj;

        // System.out.println("prosjek = " + prosjek);

        if (jedinice > 0){
            System.out.println("Nedovljan!");
        }
        else if (prosjek > 1.49 && prosjek < 2.5){
            System.out.println("Prosjek ocjena: " + prosjek + " dovoljan");
        }
        else if(prosjek> 2.49 && prosjek < 3.5){
            System.out.println("prosjek = " + prosjek + " dobar");
        }
        else if(prosjek> 3.49 && prosjek < 4.5){
            System.out.println("prosjek = " + prosjek + " vrlo dobar");
        }
        else{
            System.out.println("prosjek = " + prosjek + " odličan");
        }
    }
}
