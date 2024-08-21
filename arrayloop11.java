public class arrayloop11 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int add=0;
        for (int i=0;i<10;i++){
           if (i%2!=0)
               add+=a[i];
              // System.out.println(add);
           
        }System.out.println(add);
   }
}
