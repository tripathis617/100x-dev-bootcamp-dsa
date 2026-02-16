import java.util.*; 

public class Main {
    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      int n = scn.nextInt();
      scn.close();
      int secondLastDigit = n;
      for (int i=0; i<2; i++) {
        secondLastDigit = n%10;
        n = n/10;
      }
      System.out.println(secondLastDigit);
  }
}