public class testiranje_01 {
    public static void main(String[] args) {
        int c=4;
        int d=5;

        for (int p = c+d; p > 1; p++) {
            System.out.println("p = " + p);
            if (p == 9) {
                break;
            }
            d=d+p;
        }
        System.out.println("d = " + d);
    }
}
