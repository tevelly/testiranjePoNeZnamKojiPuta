import java.util.Scanner;
public class zadatak_problemski_5_4_b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sumaBrojeva= 0;
        int ulaz = in.nextInt();
        System.out.print("Unesite broj dok kojeg zelite izracunati sumu brojeva umnoskom: ");



        for (int i = 0; i < ulaz; i++) {
            sumaBrojeva +=i;
        }
    }
}
