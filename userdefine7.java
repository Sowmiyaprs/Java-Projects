public class userdefine7 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
         sum(arr);
    }
    public static void sum(int a[]) {
    int h=0;
        for (int i=0;i<a.length;i++){
            h+=a[i];

        }System.out.println(h);
    } 
}
