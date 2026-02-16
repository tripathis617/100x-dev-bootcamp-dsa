import java.util.Scanner;

public class ResultDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int p = sc.nextInt();

            int pass = 0;
            int fail = 0;

            for (int mark : a) {
                if (mark >= p) {
                    pass++;
                } else {
                    fail++;
                }
            }

            System.out.println("Pass: " + pass);
            System.out.println("Fail: " + fail);
        }
    }
}