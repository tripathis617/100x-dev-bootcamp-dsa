import java.util.*;

public class Strings {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String str1 = scn.nextLine();
      String[] arr1 = str1.split(" ");
      String str2 = scn.nextLine();
      String[] arr2 = str2.split(" ");
      if (arr1[1].equals(arr2[1])) {
        System.out.println("YES");
      } else {
        System.out.println("NO"); 
      }
    }
}