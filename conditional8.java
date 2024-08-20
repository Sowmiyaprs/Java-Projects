import java.util.Scanner;

public class conditional8 {
    public static void main(String[] args) {
        
         Scanner scan= new Scanner(System.in);
         int a=scan.nextInt();
          if (a%8==0){
           System.out.println("divisible");

          }else {

           System.out.println("not divisible");
       }
    }
}
