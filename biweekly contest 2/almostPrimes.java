import java.util.Scanner;

public class AlmostPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                if (countDivisors(i) <= 4) {
                    sb.append(i).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
    }

    // Helper to count divisors
    private static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i == num) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}