import java.util.Scanner;

public class nestedloop10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int h=scan.nextInt();
        for(int i=1;i<=h;i++){
            for (int j=1;j<=h;j++){
                if (i==1||j==1||i==5||j==5){
                System.out.print("*");
            }else{
                System.out.print(" ");

            }
           }System.out.println();
        }
    }
}