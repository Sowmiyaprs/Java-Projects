public class ExphanduserThrow {
    static void Age(int age) throws Exception{
        if(age>=18){
            System.out.println("Access allowed");
        }
        else{
            throw new Exception("Age is below 18");
        }
    }
    public static void main(String[] args) {
        try{
            Age(10);
        }
        catch(Exception e){
            System.out.println(e.getMessage());          // e.getMessage() means above message is alone come
        }                                                // e alone means it will come like what type of error
    }
}
