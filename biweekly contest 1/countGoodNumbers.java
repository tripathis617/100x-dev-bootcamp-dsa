import java.util.*; 

public class Main {
    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
      int n = scn.nextInt();
      int goodNumbers = 0;
      for (int i=0; i<n; i++) {
        int num = scn.nextInt();
        if (num%45 == 0 || 18%num == 0) {
          goodNumbers++;
        }
      }
      scn.close();
      System.out.println(goodNumbers);
  }
}