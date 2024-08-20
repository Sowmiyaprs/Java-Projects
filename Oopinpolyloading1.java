public class Oopinpolyloading1 {
    int add(int a,int b){
        return a+b;                      //polymorphism second method
    }                                   //first method of loading
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Oopinpolyloading1 op = new Oopinpolyloading1();
        System.out.println(op.add(3,3,3));
    }
}
