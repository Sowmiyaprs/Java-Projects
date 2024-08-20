import java.util.Scanner;

public class userdefine6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        array(arr);
    }
    public static void array(int a[]) {
        Scanner scan =new Scanner(System.in);
        int h=scan.nextInt();
        int j=0;
        for (int i=0;i<a.length;i++){
            if (h==a[i]) {
                j=1;
                break;
            }
        }
        if(j!=0){
            System.out.println("present");
        }else{
            System.out.println("absent");
        }
           
    }
}
