import java.util.Scanner;

public class whileloop10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 10;
        while (i >= 1) {
            if (num % 2 == 1) {
                System.out.println(i + "*" + num + "=" + i * num);
            }
            i--;
        }
        int i1 = 1;
        while (i1 <= 10) {
            if (num % 2 == 0) {
                System.out.println(i1 + "*" + num + "=" + i1 * num);
            }
            i1++;
        }
    }
}
