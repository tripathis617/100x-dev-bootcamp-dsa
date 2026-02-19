import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] merge(int[] a, int[] b) {
        int i = 0, j = 0, k = 0; int[] c = new int[a.length + b.length];
        while (i < a.length && j < b.length) c[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6, 8};
        System.out.println(Arrays.toString(merge(a, b)));
    }
}
