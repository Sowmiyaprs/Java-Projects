import java.util.Scanner;
    public class variableinscan3{
        public static void main(String[] args) {
           
            Scanner scan=new Scanner(System.in);

            String a=scan.next();
            long c=scan.nextLong();
            byte b1=scan.nextByte();
            byte b2=scan.nextByte();
            byte b3=scan.nextByte();
            byte b4=scan.nextByte();
            byte b5=scan.nextByte();
            int d=scan.nextInt();
            char g=scan.next().charAt(0);

            String a1=scan.next();
            long c1=scan.nextLong();
            byte e1=scan.nextByte();
            byte e2=scan.nextByte();
            byte e3=scan.nextByte();
            byte e4=scan.nextByte();
            byte e5=scan.nextByte();
            int d1=scan.nextInt();
            char g1=scan.next().charAt(0);

            String a2=scan.next();
            long c2=scan.nextLong();
            byte f1=scan.nextByte();
            byte f2=scan.nextByte();
            byte f3=scan.nextByte();
            byte f4=scan.nextByte();
            byte f5=scan.nextByte();
            int d2=scan.nextInt();
            char g2=scan.next().charAt(0);


            
            
            System.out.println("----------------------------------------------------------------");
            System.out.println("|NAME| ID| TAMIL|ENGLISH|MATHS|SCIENCE|SOCIAL|TOTAL MARKS|GRADE|");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("|"+a+"|"+c+"|"+"|"+b1+"|"+"|"+b2+"|"+b3+"|"+"|"+b4+"|"+b5+"|"+d+"|"+g+"|");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("|"+a1+"|"+c1+"|"+"|"+e1+"|"+"|"+e2+"|"+e3+"|"+"|"+e4+"|"+e5+"|"+d1+"|"+g1+"|");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("|"+a2+"|"+c2+"|"+"|"+f1+"|"+"|"+f2+"|"+f3+"|"+"|"+f4+"|"+f5+"|"+d2+"|"+g2+"|");
        }
    }