import java.util.Scanner;

public class ternary4 {
    public static void main(String[] args) {
        
          Scanner scan=new Scanner(System.in);
          
            int a=scan.nextInt();
            int b=scan.nextInt();
            String c=(a>b)?"BIGGER":"SMALLER";
            System.out.println(c);
    }
}
