import java.util.Scanner;

public class RCBWinsAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            StringBuilder sb = new StringBuilder();
            
            // Middle indices
            int left = (n / 2) - 1;
            int right = n / 2;

            while (left >= 0 && right < n) {
                sb.append(arr[left]).append(" ");
                sb.append(arr[right]).append(" ");
                left--;
                right++;
            }
            
            System.out.println(sb.toString().trim());
        }
    }
}