public class Oopinmobile {
    String brand;
    String color;
    String model;
    double price;
   
    void screen(){
        System.out.println("Open the Screen");
    }
    void settings () {
        System.out.println("Operate the settings");
    }
    void apps() {
        System.out.println("Download the apps using playstore");
    }
    void mobiledata() {
        System.out.println("Connect with the 5G data");  
    }
    public static void main(String[] args) {
        Oopinmobile mobile = new Oopinmobile();

        mobile.brand ="Oppo";
        mobile.color ="Light Green";
        mobile.model ="A79 5G";
        mobile.price=17000;
       

        System.out.println("-----------------");
        mobile.screen();
        System.out.println("");
        System.out.println(mobile.brand);
        System.out.println("-----------------");
        mobile.settings();
        System.out.println("");
        System.out.println(mobile.color);
        System.out.println("-----------------");
        mobile.apps();
        System.out.println("");
        System.out.println(mobile.model);
        System.out.println("-----------------");
        mobile.mobiledata();
        System.out.println("");
        System.out.println(mobile.price);
        System.out.println("-----------------");
    }
}
