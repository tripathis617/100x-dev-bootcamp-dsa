import java.util.Scanner;

public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int n = sc.nextInt();
            int first = sc.nextInt(); // Read first element
            boolean beautiful = true;

            for (int i = 1; i < n; i++) {
                int curr = sc.nextInt();
                if (curr != first) {
                    beautiful = false;
                    // Note: We continue reading to consume input correctly, 
                    // though logic technically knows the answer already.
                }
            }

            if (beautiful) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}