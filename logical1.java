import java.util.Scanner; 
    public class logical1 {
      public static void main(String[] args) {
          
        Scanner scan=new Scanner(System.in);

        int numb=scan.nextInt();
         
        if (numb<=50 &&numb>=25) {
            System.out.println("SATISFIED");
        }else{
            System.out.println("CONDITION NOT SATISFIED");
        }
      
      } 
}
        