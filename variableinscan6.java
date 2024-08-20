import java.util.Scanner;
    public class variableinscan6{
        public static void main(String[] args) {
            
            Scanner scan=new Scanner(System.in);
              
            String a0=scan.next();
            String a1=scan.next();
            long b0=scan.nextLong();

            String a2=scan.next();
            String a3=scan.next();
            Long b1=scan.nextLong();

            String a6=scan.next();
            String a7=scan.next();
            Long b4=scan.nextLong();

            String a09=scan.next();
            String a08=scan.next();
            Long b07=scan.nextLong();

            String a8=scan.next();
            String a9=scan.next();
            Long b5=scan.nextLong();

            System.out.println("-------------------------------------");
            System.out.println("| STATE     | DISTRICT | POPULATION |");
            System.out.println("-------------------------------------");
            System.out.println("|"+a0+" |"+a1+"    |"+b0+"      |");
            System.out.println("|"+a2+" |"+a3+" |"+b1+"      |");
            System.out.println("|"+a6+" |"+a7+"    |"+b4+"      |");
            System.out.println("|"+a09+" |"+a08+"    |"+b07+"      |");
            System.out.println("|"+a8+" |"+a9+"    |"+b5+"      |");
            
        }

    }