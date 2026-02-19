import java.io.*;
import java.util.*;

public class RowWithMaxOnes {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int maxOnes = 0;
        int maxRowIndex = -1;

        for (int i = 0; i < n; i++) {
            int currentOnes = 0;
            for (int j = 0; j < m; j++) {
                if (sc.nextInt() == 1) {
                    currentOnes++;
                }
            }
            if (currentOnes > maxOnes) {
                maxOnes = currentOnes;
                maxRowIndex = i;
            }
        }
        out.println(maxRowIndex);
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