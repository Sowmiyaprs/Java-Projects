import java.util.Scanner;

public class forloop10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int h=scan.nextInt();
        int j=1;
        for (int i=1;i<=h*h;i++){
            if (i%h==0){
                System.out.println(j);
                j++;
            }else{
                System.out.print(j);
            }  
        }
               
    }
}
