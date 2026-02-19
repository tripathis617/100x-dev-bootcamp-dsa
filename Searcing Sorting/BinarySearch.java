public class BinarySearch {
    public static int search(int[] arr, int key) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == key) return m;
            if (arr[m] < key) l = m + 1; else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        System.out.println(search(a, 7));
        System.out.println(search(a, 2));
    }
}
