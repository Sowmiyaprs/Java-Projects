public class arrayloop6 {
    public static void main(String[] args) {
        
        int a[]={101,102,103,104,105,106,107,108,109,110};
        int j=a.length-1;
        int i=0;
        int b=0;
        while (i<a.length/2) {
            b=a[i];
            a[i]=a[j];
            a[j]=b;
            i++;
            j--;  
        }
        int k=0;
        while (k<a.length) {
            System.out.println(a[k]);
            k++;
            
        }
    }
}
