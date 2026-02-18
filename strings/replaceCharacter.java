import java.util.*;

public class Strings {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String str1 = scn.nextLine();
      int n = str1.length();
      String str2 = scn.nextLine();
      String[] arr = str2.split(" ");
      StringBuilder res = new StringBuilder();
      for (int i=0; i<n; i++) {
        char c = str1.charAt(i);
        char a = arr[0].charAt(0); 
        if (c == a) {
          res.append(arr[1]);
        } else {
          res.append(c);
        }
      }
      System.out.println(res);
    }
}