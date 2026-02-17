import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SpecialFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int n = sc.nextInt();
            ArrayList<Integer> factors = new ArrayList<>();

            // N is up to 10^6, simple iteration is fast enough
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    int lastDigit = i % 10;
                    if (lastDigit == 2 || lastDigit == 7) {
                        factors.add(i);
                    }
                }
            }

            if (factors.isEmpty()) {
                System.out.println("-1");
            } else {
                StringBuilder sb = new StringBuilder();
                for (int f : factors) {
                    sb.append(f).append(" ");
                }
                System.out.println(sb.toString().trim());
            }
        }
    }
}