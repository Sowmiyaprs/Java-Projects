public class arrayloop8 {
    public static void main(String[] args) {
        int a[]={111,112,113,114,115,116,117,118,119,120};
        int h=a.length/4;
        int half=a.length/2-1;
        int len=a.length;
        int i=0;
        while (i<h) {
            int temp =a[i];
         a[i]=a[half];
         a[half]=temp;   
         i++;
         half--;         
        }
        i=a.length/2;
        half=a.length-1;
        while (i<a.length/2+h) {
            int temp =a[i];
            a[i]=a[half];
            a[half]=temp;

        }
        int k=0;
        while (k<a.length) {
            System.out.println(a[k]);
            k++;
        }
    }
}
