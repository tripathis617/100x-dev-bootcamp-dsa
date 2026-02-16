import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn  = new Scanner(System.in);
    int n = scn.nextInt();
    int space = 0;
    int star = n;
    for (int i=n; i>=1; i--)  {
      if (i==1) {
        System.out.print(i);
      } else {
        System.out.print(i + " ");
      } 
    }
  }
}

