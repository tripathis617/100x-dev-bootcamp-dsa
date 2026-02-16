import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn  = new Scanner(System.in);
    int n = scn.nextInt();
    int space = 0;
    int star = n;
    for (int i=2; i<=n; i+=2)  {
      if ( i==n) {
        
        System.out.print(i);
      } else {
        System.out.print(i + " ");
      } 
    }
  }
}

