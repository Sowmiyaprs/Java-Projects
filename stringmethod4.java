public class stringmethod4 {
    public static void main(String[] args) {
        String name = "Hello everyone! I am sowmiya. I currently Completed my class 12.";
        String regex = " ";
        String[] myArray = name.split(regex);
        for (int i = 0; i<myArray.length; i++) {
            if (i % 2 == 0) {
                System.out.println(myArray[i].toUpperCase());
            } else {
                System.out.println(myArray[i].toLowerCase());
            }
        }
    }
}
