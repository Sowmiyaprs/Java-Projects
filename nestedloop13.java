import java.util.Scanner;

public class nestedloop13{
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int h=scan.nextInt();

        for (int i=1;i<=h;i++){

            for ( int j=h;j>=i;j--){
                   System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                    System.out.print(" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=h;j++){
                    System.out.print(j);
            }
            System.out.println();
        }
        for (int i=h;i>=1;i--){

            for ( int j=h;j>=i;j--){
                   System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                    System.out.print(" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=h;j++){
                    System.out.print(j);
            }
            System.out.println();
    }
   
}
}    
