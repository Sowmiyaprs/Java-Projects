abstract public class Oopinabstractmachine1 {
    abstract void clean();
    void wash(){
        System.out.println("Washing");
    }
    public static void main(String[] args) {
        WashingMachine w = new WashingMachine();
        w.wash();
    }
}

class WashingMachine extends Oopinabstractmachine1{
    void clean(){
        System.out.println("Washing");
    }
}
