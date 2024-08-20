public class Oopincar {
    String brand;
    String color;
    double price;
    double model;
    
    void accelerate(){
        System.out.println("The car moves");
    }
    void window () {
        System.out.println("open the window");
    }
    void breaks() {
        System.out.println("Stop the car");
    }
    void gear () {
        System.out.println("Start with the first gear");  
    }
    public static void main(String[] args) {
        Oopincar cars = new Oopincar();
        
        cars.brand ="Bolero";
        cars.color ="White and Black";
        cars.price=1500000;
        cars.model = 2023;
        
        System.out.println("-----------------");
        cars.accelerate();
        System.out.println("");
        System.out.println(cars.brand);
        System.out.println("-----------------");
        cars.window();
        System.out.println("");
        System.out.println(cars.color);
        System.out.println("-----------------");
        cars.breaks();
        System.out.println("");
        System.out.println(cars.price);
        System.out.println("-----------------");
        cars.gear();
        System.out.println("");
        System.out.println(cars.model);
        System.out.println("-----------------");
     }
}
