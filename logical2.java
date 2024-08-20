import java.util.Scanner;
    public class logical2 {
        public static void main(String[] args) {
            
            Scanner scan=new Scanner(System.in);

            char gender=scan.next().charAt(0);
            int age=scan.nextInt();

            if (gender=='f' || gender=='F') {
               if (age>=18 && age<=25) {
                    System.out.println("ADMISSION IS OK");
               }else {
                    System.out.println("AGE IS NOT OK");}
            }else {
                System.out.println("FEMALES ONLY ALLOWED");}
        }
}
