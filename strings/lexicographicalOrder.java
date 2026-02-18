import java.util.*;

public class Strings {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String str1 = scn.nextLine();
      int n = str1.length();
      String str2 = scn.nextLine();
      if (n > str2.length()) {
        n = str2.length();
      }
      for (int i=0; i<n; i++) {
        char c1 = str1.charAt(i);
        char c2 = str2.charAt(i);
        if ((int)c1 > (int)c2) {
          System.out.println("B");
          return;
        } else if ((int)c1 < (int)c2){
          System.out.println("A");
          return;
        }
      }
      if (str1.length() < str2.length()) {
        System.out.println("A"); 
      } else if (str1.length() > str2.length()){
        System.out.println("B");
      } else {
        System.out.println("Equal");
      }
    }
}