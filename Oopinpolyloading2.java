public class Oopinpolyloading2 {
    
    int add(int a,int b){
        return a+b;
    }                                           //second method of loading
    double add(double a,double b){
        return a*b;
    }
    public static void main(String[] args) {
        Oopinpolyloading2 op = new Oopinpolyloading2();
        System.out.println(op.add(3, 1));       
        System.out.println(op.add(3.1,9.2));
                                        //  Any one print statement enough for knowing only 2 pribt statement
    }
}
