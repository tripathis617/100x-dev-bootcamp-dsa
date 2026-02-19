public class BinarySearchStrings {
    public static int search(String[] arr, String key) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int cmp = arr[m].compareTo(key);
            if (cmp == 0) return m;
            if (cmp < 0) l = m + 1; else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] a = {"apple", "banana", "cherry", "date"};
        System.out.println(search(a, "cherry"));
        System.out.println(search(a, "fig"));
    }
}
