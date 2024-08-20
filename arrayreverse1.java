public class arrayreverse1 {
    public static void main(String[] args) {

        int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int j = a.length - 1;
        int i = 0;
        int b = 0;
        while (i < a.length / 2) {
            b = a[i];
            a[i] = a[j];
            a[j] = b;
            i++;
            j--;
        }
        int k = 0;
        while (k < a.length) {
            System.out.println(a[k]);
            k++;
        }
    }
}
