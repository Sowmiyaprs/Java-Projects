public class userdefine8 {
    public static void main(String[] args) {
        int arr[]={10,20,309,49,50,60,78,809,90,10};
         sum(arr);
    }
    public static void sum(int a[]) {
    int h=0;
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0){
                h+=a[i];
                } 
          }System.out.println("even number "+h);

    int m=0;
          for (int i=0;i<a.length;i++){
          if (a[i]%2!=0){
           m+=a[i];
          } 
        }System.out.println("odd number "+m);
    }
 } 


