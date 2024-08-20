import java.util.Scanner;

public class nestedloop15{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int h=scan.nextInt();
        for(int i=1;i<h-1;i++){
            for (int j=h; j>=i;j--){
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                if (i==5||j==i){
                System.out.print("*");}
                else {
                    System.out.print(" ");}
            }
            for (int j=i;j>=2;j--){
                if (i==5||j==2)
                System.out.print("*");
                else{
                System.out.print(" ");}
            }  
                System.out.println();

        }

    for(int i=h-1;i>=1;i--){
        for (int j=h; j>=i;j--){
            System.out.print(" ");
        }
        for (int j=i;j>=1;j--){
            if (i==5||j==i){
            System.out.print("*");}
            else {
            System.out.print(" ");}

        }
        for (int j=i;j>=2;j--){
            if (i==5||j==2){
            System.out.print("*");}
            else {
            System.out.print(" ");}
        }    
            System.out.println();
        } 
    }
}

