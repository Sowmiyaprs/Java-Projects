import java.util.Scanner;

public class whileloop12 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();
        int num=1;
        while (a>=1) {
            num*=a;
            a--;
        }  System.out.println(num);
      
    
    }
}
