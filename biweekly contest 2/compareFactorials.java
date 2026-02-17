import java.util.Scanner;

public class CompareFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a == b) {
                System.out.println("Yes");
            } else if ((a == 0 && b == 1) || (a == 1 && b == 0)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}