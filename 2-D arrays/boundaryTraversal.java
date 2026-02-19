import java.io.*;
import java.util.*;

public class Array_2D {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
          System.out.print(arr[0][i] + " "); 
        }
        for (int i = 1; i < n; i++) {
          System.out.print(arr[i][m-1] + " "); 
        }
        if (n!=1) {
          for (int i = m-2; i >= 0; i--) {
            System.out.print(arr[n-1][i] + " "); 
          }  
        }
        if (m!=1) {
          for (int i = n-2; i >= 1; i--) {
            System.out.print(arr[i][0] + " "); 
          } 
        }
        out.flush();
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); } 
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
    }
}