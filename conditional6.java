import java.util.Scanner;

public class conditional6 {
    public static void main(String[] args) {
        
         Scanner scan= new Scanner(System.in);

        int a=scan.nextInt();
        if (a%2==0) {
           System.out.println("odd");
        }else
           System.out.println("even");
            
    }
}
