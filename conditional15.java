import java.util.Scanner;

public class conditional15 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int a=scan.nextInt();
        if (a%2==0){
          System.out.println("divisible by 2");
        }else if (a%3==0){
          System.out.println("divisible by 3");
        }else if (a%5==0){
          System.out.println("divisible by 5");
        }else if (a%7==0){
          System.out.println("divisible by 7");
        }else if (a%9==0){
          System.out.println("divisible by 9");
         } else 
          System.out.println("NO RESULT FOUND");
    }
}
