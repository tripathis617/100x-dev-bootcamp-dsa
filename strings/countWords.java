import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            
            // If the string is empty, there are 0 words (though constraints say length >= 1)
            if (s.length() == 0) {
                System.out.println(0);
                return;
            }

            int wordCount = 1; // Start with 1 because there is at least one word
            
            for (int i = 0; i < s.length(); i++) {
                // Every space marks the separation between two words
                if (s.charAt(i) == ' ') {
                    wordCount++;
                }
            }
            
            System.out.println(wordCount);
        }
    }
}