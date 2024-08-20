abstract public class Oopinabstractmachine2 {
    abstract void clean();
    void wash(){
        System.out.println("Washing");
    }
    public static void main(String[] args) {
        WashingMachine w = new WashingMachine();
        w.clean();
        Vacuum w1= new Vacuum();
        w1.clean();
    }
}
class WashingMachine extends Oopinabstractmachine2{
    void clean(){
        System.out.println("Cleaning");
    }
}
class Vacuum extends Oopinabstractmachine2{
    void clean(){
        System.out.println("Cleaning floor");
    }
}