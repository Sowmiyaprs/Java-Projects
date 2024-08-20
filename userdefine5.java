import java.util.Scanner;

public class userdefine5 {
    public static void main(String[] args) {
        int h []=new int[10];
        array(h);
        System.out.println("the given array");
        for (int m=0;m<h.length;m++){
            System.out.println(h[m]);     
        }
    }
    public static void array(int a[]){
        for (int i=0;i<a.length;i++){
            Scanner scan =new Scanner(System.in);
            int j=scan.nextInt();
            a[i]=j;
        }
    }
}
