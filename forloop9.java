import java.util.Scanner;

public class forloop9 {
     public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int h=scan.nextInt();

        for ( int i=1;i<=h*h;i++){
              if(i%h==0){
                System.out.println("*");
              }else{
                System.out.print("*");
              }
        }                
    }    
}
