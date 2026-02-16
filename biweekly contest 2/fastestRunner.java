import java.util.Scanner;

public class FastestRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int n = sc.nextInt();
            
            long minTime = Long.MAX_VALUE;
            int bestId = -1;

            for (int i = 1; i <= n; i++) {
                long time = sc.nextLong();
                // Use <= to update strictly better times OR equal times with higher ID (current i)
                if (time <= minTime) {
                    minTime = time;
                    bestId = i;
                }
            }
            System.out.println(bestId);
        }
    }
}