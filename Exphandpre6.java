public class Exphandpre6 {
    public static void main(String[] args) {
        int a[]={5,8,10};
        try{
            System.out.println(a[4]);
        }
        catch(Exception i){                                          //we are using Exception alone here 
            System.out.println("it has index upto 0 to 2 only");
        }
        finally{
            System.out.println("the length has been solved and executed");
        }
        System.out.println("Hello all");
    }
}
