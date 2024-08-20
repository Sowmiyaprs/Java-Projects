import java.util.Scanner;

public class conditional12 {
    public static void main(String[] args) {
        
         Scanner scan= new Scanner(System.in);


        char a=scan.next().charAt(0);
        if (a=='F'){
           System.out.println("FEMALE");
        }else if (a=='M') {
           System.out.println("MALE");
        }else
          System.out.println("no gender found");

    }
}
