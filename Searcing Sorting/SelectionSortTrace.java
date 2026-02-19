import java.util.Arrays;

public class SelectionSortTrace {
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) if (a[j] < a[min]) min = j;
            if (min != i) {
                int tmp = a[i]; a[i] = a[min]; a[min] = tmp;
            }
            System.out.println("After pass " + (i+1) + ": " + Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        selectionSort(a);
    }
}
