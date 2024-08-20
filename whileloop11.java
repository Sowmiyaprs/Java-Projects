public class whileloop11 {
    public static void main(String[] args) {

        int a=0;
        int a1=0;
        int i=1;
        while (i<11){
            if (i%2==0){ 
                 a+=i;
            }else if (i%2==1) {
                 a1+=i;         
            }
                 i++; 
        }
         System.out.println(a); 
         System.out.println(a1);
    }
}
