        import java.util.Scanner;

public class conditional20 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Gender");
        char gender = data.next().charAt(0);

        System.out.println("Age");
        int age = data.nextInt();

        System.out.println("Blood Line");
        float bl = data.nextFloat();



        if (gender=='m') {
            if (age>12 || age<=18) {
                if (bl>13.0 && bl<=16.0) {
                    System.out.println("Healthy Man");
                }
                else{
                    System.out.println("un healthy");
                }
            }
            else{
                System.out.println("age is wrong");
            }
        }
        else{
            System.out.println("un healthy");
           }
           
        if (age>18){
            if(bl>13.6 || bl<=17.7){
                System.out.println("healthy");
            }
            else {
                System.out.println("un healthy");
            }
        }
        else{
            System.out.println("un healthy");
        }
       
    }
}      
 





