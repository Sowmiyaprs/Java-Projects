import java.util.Scanner;

public class nestedloop4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int h=scan.nextInt();
        for (int i=h;i>=1;i--){
            for (int j=i;j>=1;j--){
               
                System.out.print("*");
            }System.out.println("");

        }
    }
}

