import java.util.Scanner;

public class userdefine12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arr[] = { "-", "-", "-", "-", "-", "-", "-", "-", "-" };

        for(int i=0;i<9;i++){
            int h= scan.nextInt();
            change(arr,h);
            display(arr);
        }
    }

    public static void display(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
    public static void change(String a[],int h) {
     
    }
}

































