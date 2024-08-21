public class arrayloop5 {
    public static void main(String[] args) {

        int a[] = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110 };

        int num = 0;
        int i = 0;
        while (i < 10) {
            num += a[i];
            i++;

        }
        System.out.println(num);

    }
}
