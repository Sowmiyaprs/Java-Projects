public class OopinComputerinheri {
    
    String brand;
    double price;

    void move(){
        System.out.println("The System is running ");   
    }
    public static void main(String[] args){
        OopinComputerinheri myComputer = new OopinComputerinheri();
        myComputer.brand = "Computer";
        myComputer.price=30000;
        System.out.println(myComputer.brand);
       System.out.println( myComputer.price);
        myComputer.move();

        System.out.println("");

        Laptop mylaptop=new Laptop();
        mylaptop.size="15inch";
        mylaptop.keyboard="attached with system";
        mylaptop.price=15000;
        
        System.out.println(mylaptop.price);
        System.out.println(mylaptop.size);
        System.out.println(mylaptop.keyboard);
        mylaptop.settings();
        mylaptop.move();

        System.out.println("");

        Desktop mydesktop=new Desktop();
        mydesktop.size="20inch";
        mydesktop.keyboard="separated and connected with wire to the system";
        mydesktop.price=25000;

        System.out.println(mydesktop.price);
        System.out.println(mydesktop.size);
        System.out.println(mydesktop.keyboard);
        mydesktop.settings();
        mydesktop.move();

    }
}
class Laptop extends OopinComputerinheri {
      String size;
      String keyboard;
      
      void settings(){
        System.out.println("the carriable one");
      }
}
class Desktop extends OopinComputerinheri{
    String size;
    String keyboard;

    void settings(){
        System.out.println("it can't be carried");
    }
}