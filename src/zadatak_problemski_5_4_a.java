import java.util.Scanner;

public class zadatak_problemski_5_4_a {
    public static void main(String[] args) {

        int sumaBrojeva=1;
        Scanner in = new Scanner(System.in);

        System.out.print("Unesite broj do kojeg želite izračunati sumu prirodnih brojeva: ");
        int unosBroja = in.nextInt();

        for (int i = 1; i <= unosBroja; i++) {
            sumaBrojeva *=i;
        }
        System.out.println("sumaBrojeva = " + sumaBrojeva);
    }
}
