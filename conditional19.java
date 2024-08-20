import java.util.Scanner;

public class conditional19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char gender = scan.next().charAt(0);
        int age = scan.nextInt();

        if (gender == 'f') {
            if (age>=18) {
                System.out.println("MARRIAGE IS OK");
            }else{
                System.out.println("AGE IS NOT ENOUGH");}
        }else{
                System.out.println("FOR FEMALE ONLY");}
    }
}
           
            
            
            
                      
    

