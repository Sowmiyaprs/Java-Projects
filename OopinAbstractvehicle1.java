abstract public class OopinAbstractvehicle1{

    abstract void run();
    void move (){
        System.out.println("the bike is moving ");
    }
    public static void main(String[] args) {
        // Vehicle1 myVehicle =new Vehicle1();
        Bike mybike= new Bike();
        mybike.run();
        mybike.move();
        SportsBike mySportsBike= new SportsBike();
        mySportsBike.run();
    }
}
class Bike extends OopinAbstractvehicle1{
    void run(){
        System.out.println("The bike is running ");
    }
}
class SportsBike extends OopinAbstractvehicle1{
    void run(){
        System.out.println("the Sportsbike is running faster than bike ");
    }
}