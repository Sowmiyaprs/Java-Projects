import java.util.Scanner;
    public class conditional17 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        char GENDER=scan.next().charAt(0);
        int AGE=scan.nextInt();

        if (GENDER=='F'){
            if (AGE>=18){
                System.out.println("ADMISSION IS OK");    
            }else {
                 System.out.println("AGE IS NOT OK");
            }
        }else{
                 System.out.println("FEMALE ONLY ALLOWED");
        }
    }
}
