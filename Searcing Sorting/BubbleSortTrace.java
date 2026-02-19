import java.util.Arrays;

public class BubbleSortTrace {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j+1]) { int t = a[j]; a[j] = a[j+1]; a[j+1] = t; swapped = true; }
            }
            System.out.println("After pass " + (i+1) + ": " + Arrays.toString(a));
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};
        bubbleSort(a);
    }
}
