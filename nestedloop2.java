import java.util.Scanner;

public class nestedloop2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int h=scan.nextInt();
        for (int i=1;i<=h;i++){
            for (int j=1;j<=h;j++){
                System.out.print("*");
            }System.out.println("");
        } 
     }
}
