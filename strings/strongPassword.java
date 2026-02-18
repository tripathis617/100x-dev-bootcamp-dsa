import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextLine()) {
            String s = scanner.nextLine();

            // Condition 1: Length must be exactly 10
            if (s.length() != 10) {
                System.out.println("Weak");
                return;
            }

            boolean hasLower = false;
            boolean hasUpper = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            // Iterate through each character to check conditions
            for (char c : s.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    hasLower = true;
                } else if (Character.isUpperCase(c)) {
                    hasUpper = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else {
                    // If it's not lower, upper, or digit, it's considered special
                    hasSpecial = true;
                }
            }

            // Check if all character type conditions are met
            if (hasLower && hasUpper && hasDigit && hasSpecial) {
                System.out.println("Strong");
            } else {
                System.out.println("Weak");
            }
        }
        scanner.close();
    }
}