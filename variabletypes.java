import java.util.Scanner;
public class variabletypes {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
         System.out.println("enter the total");
         int a = scan.nextInt();
         System.out.println("-----------------------------");
         System.out.println(a);
        
         System.out.println("enter the marks");
         byte b = scan.nextByte();
         System.out.println("------------------------------");
         System.out.println(b);
        
         System.out.println("enter the phn numb");
         long c=scan.nextLong();
         System.out.println("----------------------------------");
         System.out.println(c);
        
         
         System.out.println("enter the decimel");
         float d=scan.nextFloat();
         System.out.println("--------------------------------------");
         System.out.println(d);
        
         System.out.println("enter the double decimel");
         double e=scan.nextDouble();
         System.out.println("------------------------------------------");
         System.out.println(e);

        System.out.println("enter the statement");
        boolean f=scan.nextBoolean();
        System.out.println("--------------------------------------------");
        System.out.println(f);

        System.out.println("enter the average number");
        short i=scan.nextShort();
        System.out.println("----------------------------------------------");
        System.out.println(i);

        System.out.println("enter the words");
        String g=scan.next();
        System.out.println("-----------------------------------------");
        System.out.println(g);

        System.out.println("enter the grade");
        char j=scan.next().charAt(0);
        System.out.println("-----------------------------------------------");
        System.out.println(j);



    }
}