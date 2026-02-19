public class SelectionVsInsertion {
    static class Stats { int comps = 0; int swaps = 0; }

    public static Stats selectionSort(int[] a) {
        Stats s = new Stats();
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) { s.comps++; if (a[j] < a[min]) min = j; }
            if (min != i) { int t = a[i]; a[i] = a[min]; a[min] = t; s.swaps++; }
        }
        return s;
    }

    public static Stats insertionSort(int[] a) {
        Stats s = new Stats();
        for (int i = 1; i < a.length; i++) {
            int key = a[i]; int j = i - 1;
            while (j >= 0) {
                s.comps++;
                if (a[j] > key) { a[j+1] = a[j]; s.swaps++; j--; } else break;
            }
            a[j+1] = key;
        }
        return s;
    }

    public static int[] copy(int[] a){ int[] b=new int[a.length]; System.arraycopy(a,0,b,0,a.length); return b; }

    public static void main(String[] args) {
        int[] base = {64, 25, 12, 22, 11};
        int[] a = copy(base);
        int[] b = copy(base);
        Stats s1 = selectionSort(a);
        Stats s2 = insertionSort(b);
        System.out.println("Selection - comps:" + s1.comps + " swaps:" + s1.swaps);
        System.out.println("Insertion - comps:" + s2.comps + " swaps:" + s2.swaps);
    }
}
