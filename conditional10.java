import java.util.Scanner;

public class conditional10 {
    public static void main(String[] args) {
        
         Scanner scan= new Scanner(System.in);

         int a=scan.nextInt();
         if (a<=17){
           System.out.println("MINOR");
        }else if (a<=59){
           System.out.println("MAJOR");
        }else if (a>=60){
           System.out.println("SENIOR CITIZEN");            
         }
         else {
           System.out.println("no result");
         }
    }
}
