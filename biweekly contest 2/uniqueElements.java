import java.util.HashMap;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> freq = new HashMap<>();

            // Read and count frequencies
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            }

            StringBuilder sb = new StringBuilder();
            boolean found = false;

            // Check original order
            for (int x : arr) {
                if (freq.get(x) == 1) {
                    sb.append(x).append(" ");
                    found = true;
                }
            }

            if (found) {
                System.out.println(sb.toString().trim());
            } else {
                System.out.println(); // Empty line
            }
        }
    }
}