public class Oopinpolyloadingparameters {
    int add(int a,int b){
        return a+b;  
    }                                   
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Oopinpolyloadingparameters num = new Oopinpolyloadingparameters();
        System.out.println(num.add(5,10,5));
    }
}


