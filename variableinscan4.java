import java.util.Scanner;
    public class variableinscan4{
        public static void main(String[] args) {
           
            Scanner scan=new Scanner(System.in);

             String a0=scan.next();
             byte b0=scan.nextByte();
             int c0=scan.nextInt();
             int d0=scan.nextInt();

             String a1=scan.next();
             byte b1=scan.nextByte();
             int c1=scan.nextInt();
             int d1=scan.nextInt();

             String a2=scan.next();
             byte b2=scan.nextByte();
             int c2=scan.nextInt();
             int d2=scan.nextInt();
            
             System.out.println("--------------------------------------------");
             System.out.println("| PRODUCT | QUANTITY | PRICE | TOTAL PRICE |");
             System.out.println("--------------------------------------------");
             System.out.println("|"+a0+"|"+b0+"|"+"|"+c0+"|"+d0+"|");
             System.out.println("--------------------------------------------");
             System.out.println("|"+a1+"|"+b1+"|"+"|"+c1+"|"+d1+"|");
             System.out.println("---------------------------------------------");
             System.out.println("|"+a2+"|"+b2+"|"+"|"+c2+"|"+d2+"|");
             System.out.println("----------------------------------------------");
             

        }
        }
        
    
