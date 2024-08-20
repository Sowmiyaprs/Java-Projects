public class Exphandpre3 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(Exception i){                             //we are using Exception alone
            System.out.println("cant be zero");
        }
        finally{
            System.out.println("error has been solved and executed");
        }
        System.out.println("Hello all");
    }
}
