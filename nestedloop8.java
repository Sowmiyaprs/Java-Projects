import java.util.Scanner;

public class nestedloop8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int h=scan.nextInt();

        for(int i=1;i<=h;i++){
            for (int j=h; j>=i;j--){
                    System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }System.out.println();
        }
        
    }
}
