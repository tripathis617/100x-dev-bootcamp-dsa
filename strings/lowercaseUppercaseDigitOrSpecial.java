import java.util.*;

public class Strings {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      int c = (int)str.charAt(0);
      if (c>=97 && c<=122) {
        System.out.println("Lowercase");  
      }  else if (c>=65 && c<=90) {
        System.out.println("Uppercase");  
      } else if (c>=48 && c<=57) {
        System.out.println("Digit");  
      } else {
        System.out.println("Special");  
      }
    }
}