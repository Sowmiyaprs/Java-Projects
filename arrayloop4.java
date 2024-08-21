public class arrayloop4 {
    public static void main(String[] args) {
        int a[] = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110 };
        int num = 0;
        int i = 0;
        while (i < 10) {
            if (i % 2 !=0) {
                num += a[i];
            }
            i++;
        }
        System.out.println(num);

    }
}
