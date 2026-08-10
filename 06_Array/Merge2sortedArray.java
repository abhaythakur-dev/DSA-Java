public class Merge2sortedArray {
    public static void main(String[] args) {
        int[] a = { 2, 5, 6, 9, 20, };
        int[] b = { 1, 3, 4, 5, 7, 8 };
        int[] c = new int[a.length + b.length];

        for (int ele : c)
            System.out.print(ele + " ");
        System.out.println();

        merge(c, a, b);
        for (int ele : c)
            System.out.print(ele + " ");

    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;

            } else {
                c[k] = b[j];
                j++;
                k++;

            }
            if (i == a.length) { // a array khtm toh b ke bache hue array lo
                while (j < b.length) {
                    c[k++] = b[j++];
                }

            }
            if (j == b.length) { // b array khtm toh a ke bache hue array lo
                while (i < a.length) {
                    c[k++] = a[i++];
                }

            }

        }

    }
}
