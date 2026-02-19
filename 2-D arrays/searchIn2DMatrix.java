import java.io.*;
import java.util.*;

public class SearchMatrix {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n * m; i++) {
            if (sc.nextInt() == x) {
                found = true;
                // We keep reading to empty the stream, 
                // but we know we've found it.
            }
        }
        
        out.println(found);
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