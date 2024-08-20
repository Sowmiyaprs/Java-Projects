 import java.util.Scanner;
    public class variableinscan2{
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
            char e=scan.next().charAt(0);

            System.out.println("NAME:"+a);
            System.out.println("ID:" +c);
            System.out.println("TAMIL:"+b1);
            System.out.println("ENGLISH:"+b2);
            System.out.println("MATHS:"+b3);
            System.out.println("SCIENCE:"+b4);
            System.out.println("SOCIAL:"+b5);
            System.out.println("TOTAL MARKS:"+d);
            System.out.println("GRADE:"+e);


            
            

        }
    }
