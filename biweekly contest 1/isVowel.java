import java.util.*; 

public class Main {
    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      String letter = scn.nextLine();
      letter = letter.trim();
      char c = letter.charAt(0);
      scn.close();
      int charNum = c - 0;
      if (charNum == 97 || charNum == 101 || charNum == 105 || charNum == 111 || charNum == 117) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
  }
}