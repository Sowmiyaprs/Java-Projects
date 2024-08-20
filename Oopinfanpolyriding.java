public class Oopinfanpolyriding {
    void run(){
        System.out.println("the fun is running");
    }                                                     
    public static void main(String[] args) {
        Oopinfanpolyriding myfan = new Oopinfanpolyriding();
        myfan.run();

        tablefan mytablefan = new tablefan();
        mytablefan.run();

        celingfan myCelingfan=new celingfan();
        myCelingfan.run();
    }
}
class tablefan extends Oopinfanpolyriding{
    void run(){
        System.out.println("it can rotate to 90 degree angle");
    }
}
class celingfan extends Oopinfanpolyriding{
    void sleep(){
        System.out.println("it can fix in the celing ");
    }
}
