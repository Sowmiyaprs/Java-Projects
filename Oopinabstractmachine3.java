interface Oopinabstractmachine3 {
    abstract void clean();
    public static void main(String[] args) {
        WashingMachine w = new WashingMachine();
        w.clean();
        Vacuum w1= new Vacuum();
        w1.clean();
    }
}

class WashingMachine implements Oopinabstractmachine3{
    public void clean(){
        System.out.println("Cleaning");
    }
}
class Vacuum implements Oopinabstractmachine3{
    public void clean(){
        System.out.println("Cleaning floor");
    }
}

