import java.util.Scanner;
    public class logical3 {
        public static void main(String[] args) {
            
            Scanner scan=new Scanner(System.in);

            char num=scan.next().charAt(0);
           
            if (num>='0' && num<='9') {
                System.out.println("it is number");
            }else {
                System.out.println("it is alphabet");}
                 
        }
}
