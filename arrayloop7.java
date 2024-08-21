public class arrayloop7 {
    public static void main(String[] args) {
        
        int a[]={81,82,83,84,85,86,87,88,89,90};
        int j=a.length/2;
        int i=0;
        int b=0;

        while (i<a.length/2) {
            b=a[i];
            a[i]=a[j];
            a[j]=b;
            i++;
            j++;            
        }
        int k=0;
        while (k<a.length) {
            System.out.println(a[k]);
            k++;
            
        }
    }    
}
