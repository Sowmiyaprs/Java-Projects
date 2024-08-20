import java.util.Scanner;

public class conditional7 {
    public static void main(String[] args) {
        
         Scanner scan= new Scanner(System.in);

       int a=scan.nextInt();
       if (a%4==0) {
          System.out.println("leap year");
       }else

          System.out.println("non leap year");
    }
}
