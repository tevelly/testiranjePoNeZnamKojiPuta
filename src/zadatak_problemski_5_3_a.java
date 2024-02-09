import java.util.Scanner;
public class zadatak_problemski_5_3_a {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.printf("Napiši program za ispis:\n" +
                "prirodnih brojeva od p do n, pri čemu je p<n, " +
                "gdje su p i n prirodni brojevi. " +
                "Ako p i n nisu dobro zadani, " +
                "postavi ih na vrijednosti p=2, a n=8.");
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