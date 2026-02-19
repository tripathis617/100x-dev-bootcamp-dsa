import java.io.*;
import java.util.*;

public class FindMaximum {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < n * m; i++) {
            int val = sc.nextInt();
            if (val > maxVal) maxVal = val;
        }
        
        out.println(maxVal);
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