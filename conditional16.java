import java.util.Scanner;
    public class conditional16 {
     public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        char a=scan.next().charAt(0);
        if (a=='S'){
            System.out.println("SOWMIYA");
        }else if (a=='R'){
            System.out.println("RENUKA");
        }else if (a=='P'){
            System.out.println("PREETHI");
        }else if (a=='K'){
            System.out.println("KUFRA");
        }else if (a=='A'){
            System.out.println("AKSHAYA");
        }else if (a=='Y'){
            System.out.println("YAZHINI");
        }else if (a=='G'){
            System.out.println("GUNA");
        }else if (a=='J'){
            System.out.println("JANET");
        }else 
            System.out.println("NO RESULT FOUND");

   } 
}
