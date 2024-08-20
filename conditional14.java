import java.util.Scanner;

public class conditional14 {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         int a=scan.nextInt();
       if (a>=90){
         System.out.println("A");
        }else if (a>=80){
         System.out.println("B");
       }else if (a>=70){
         System.out.println("C");
        }else if (a>=60){
         System.out.println("D");
       }else if (a>=50){
         System.out.println("E");
        }else if (a>=35){
         System.out.println("F");
        }else 
         System.out.println("G");

    }
}
