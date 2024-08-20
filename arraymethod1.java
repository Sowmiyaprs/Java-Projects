import java.util.Arrays;

public class arraymethod1 {
    public static void main(String[] args) {
        String name[] = { "sowmiya", "shalini", "sharmila", "shruthi", "renuka", "kavitha", "kufra", "keerthana",
                "akshaya", "dharani", "bharathi" };
        Arrays.sort(name);
        for (String i : name) {
            System.out.println(i);
        }
    }
}