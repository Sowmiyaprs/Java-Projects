public class Oopfinalcalculator {
    int a;
    int b;
    int add (int a,int b){
        return a+b;
    }
    int sub (int a, int b){
        return a-b;
    }
    int multi (int a ,int b){
        return a*b;
    }
    int divide (int a , int b){
        return a/b;
    }
    int mod (int a, int b){
        return a%b;
    }
    public static void main(String[] args) {
        Oopfinalcalculator myCalculator = new Oopfinalcalculator();
        ScientificCalculator myScientificCalculator=new ScientificCalculator();
        System.out.println(myCalculator.add(5, 10));                    
        System.out.println(myCalculator.divide(5,5));                // multi mod sub anything can be given
        System.out.println(myScientificCalculator.max(5, 20));
        System.out.println(myScientificCalculator.min(12, 5));
    }
}
class ScientificCalculator extends Oopfinalcalculator{
    int c;
    int d;
    int max (int c, int d){
        return Math.max(c,d);
    }
    int min(int c,int d){
        return Math.min(c, d);
    }
}
