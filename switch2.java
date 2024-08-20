import java.util.Scanner;
    public class switch2 {
        public static void main(String[] args) {
          
            Scanner scan=new Scanner(System.in);

            int a=scan.nextInt();
            switch (a) {
                case 1:System.out.println("hi");
                break;
                case 2:System.out.println("how are you");
                break;
                case 3:System.out.println("i am fine and good");
                break;
                case 4:System.out.println("nice to meet you");
                break;
                default:System.out.println("bye");
                break;
            }

        }
}
