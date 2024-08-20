public class Oopinvehicleinheri {
    String color;
    String brand;
    double price;

    void move(){
        System.out.println("The car is moving");
    }

    public static void main(String[] args){
        Oopinvehicleinheri myVehicle = new Oopinvehicleinheri();
        myVehicle.color = "black";
        System.out.println(myVehicle.color);
        myVehicle.move();

        Bike myBike = new Bike();
        myBike.color="red";
        myBike.handbar="present";
        System.out.println(myBike.handbar);
        myBike.move();
    }
}

class Bike extends Oopinvehicleinheri{
    int wheels;
    String handbar;

    void run(){
        System.out.println("The bike is running");
    }
}

// class Car extends Oopinvehicleinheri{
//     int wheels;
//     String steering;
// }
