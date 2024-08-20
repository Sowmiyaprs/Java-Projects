public class stringmethod5 {
    public static void main(String[] args) {
        String name = "Hello everyone! I am sowmiya. I currently Completed my class 12.";
        String regex = " ";
        String[] myArray = name.split(regex);
        for (int i =myArray.length-1; i>=0; i--) {
            if (i % 2 == 0) {
                System.out.println(myArray[i].toUpperCase());
            } else {
                System.out.println(myArray[i].toLowerCase());
            }
        }
    }
}
