public class Oopinpolyloadingparameters1 {
    
    int add(int a,int b){
        return a+b;
    }                                           
    double add(double a,double b){
        return a*b;
    }
    public static void main(String[] args) {
        Oopinpolyloadingparameters1 op = new Oopinpolyloadingparameters1();
        System.out.println(op.add(3, 4));       
        System.out.println(op.add(10000,90000));
    }

}
