import java.util.Arrays;

public class InsertionSortTrace {
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) { a[j+1] = a[j]; j--; }
            a[j+1] = key;
            System.out.println("After inserting index " + i + ": " + Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        int[] a = {12, 11, 13, 5, 6};
        insertionSort(a);
    }
}
