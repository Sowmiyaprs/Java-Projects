public class Oopinpolyriding {
    void sleep(){
        System.out.println("sleeping");
    }                                                       //polymorphism 1st method
    public static void main(String[] args) {
        Oopinpolyriding ani = new Dog();
        ani.sleep();
    }
}
class Dog extends Oopinpolyriding{
    void sleep(){
        System.out.println("Dog is sleeping");
    }
}
class Horse extends Oopinpolyriding{
    void sleep(){
        System.out.println("Horse sleeps");
    }
}
