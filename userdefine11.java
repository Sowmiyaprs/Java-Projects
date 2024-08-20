import java.util.Scanner;

public class userdefine11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arr[] = { "-", "-", "-", "-", "-", "-", "-", "-", "-" };
        char1(arr);
        int h= scan.nextInt();
        char2(arr,h);
     
    }

    public static void char1(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }

    public static void char2(String a[],int h) {
        a[h-1]="X";
        char1(a);
    
    }
}