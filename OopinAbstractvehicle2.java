interface OopinAbstractvehicle2 {
    abstract void run();
    public static void main(String[] args) {
        Bike mybike= new Bike();
        mybike.run();
        SportsBike mySportsBike= new SportsBike();
        mySportsBike.run();
    }
}

class Bike implements OopinAbstractvehicle2{
    public void run(){
        System.out.println("The bike is running ");
    }
}
class SportsBike implements OopinAbstractvehicle2{
   public  void run(){
        System.out.println("the Sportsbike is running faster than bike ");
    }
}

