import java.util.Scanner;

    public class variableinscan5 {
        public static void main(String[] args) {
            
           Scanner scan=new Scanner(System.in);

           String a=scan.next();
           byte b=scan.nextByte();
           int c=scan.nextInt();
           int d=scan.nextInt();

           String a0=scan.next();
           byte b0=scan.nextByte();
           int c0=scan.nextInt();
           int d0=scan.nextInt();

           String a1=scan.next();
           byte b1=scan.nextByte();
           int c1=scan.nextInt();
           int d1=scan.nextInt();

           System.out.println("----------------------------------");
           System.out.println("| BOOKS | QUANTITY | MRP | PRICE | ");
           System.out.println("----------------------------------");
           System.out.println("|"+a+" |"+b+"|"+c+"|"+d+"|");
           System.out.println("|"+a0+"|"+b0+"|"+c0+"|"+d0+"|");
           System.out.println("|"+a1+"|"+b1+"|"+c1+"|"+d1+"|");
        }
    
}
