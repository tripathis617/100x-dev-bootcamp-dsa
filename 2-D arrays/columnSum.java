import java.io.*;
import java.util.*;

public class ColumnSum {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] colSums = new long[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                colSums[j] += sc.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            out.print(colSums[j] + " ");
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