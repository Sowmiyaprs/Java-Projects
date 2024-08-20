import java.util.Scanner;
    public class conditional18 {
        public static void main(String[] args) {
            
            Scanner scan=new Scanner(System.in);
            char gender=scan.next().charAt(0);
            int age=scan.nextInt();
            int marks=scan.nextInt();

            if (gender=='F') {
                if (age>=18) {
                    if (marks>=70) {
                        System.out.println("ADMISSION IS OK");
            }else{
                        System.out.println("MARK IS NOT ENOUGH"); }
            }else{
                        System.out.println("AGE IS NOT OK"); }
            }else{
                        System.out.println("FEMALES ONLY ALLOWED"); }
        }
    
}
