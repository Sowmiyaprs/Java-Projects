import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        switch(a){
            case 1: System.out.println("good");
            break;
            case 2: System.out.println("excellent");
            break;
            case 3: System.out.println("haiii");
            break;
            default:System.out.println("good bye");
            break;
        }
    }
}
