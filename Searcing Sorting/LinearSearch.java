public class LinearSearch {
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == key) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 8, 1, 9};
        int k = 1;
        System.out.println(search(a, k));
    }
}
