
//Import the fileWriterclass
import java.io.FileWriter;

//Import the IOException class for handling error 
import java.io.IOException;

public class FWrite {
    public static void main(String[] args) {
        try {
            FileWriter file =new FileWriter("sample.txt");
            file.write("java is interesting ");
            file.close();
        }
        catch(IOException i){
            System.out.println("Error");
        }
    }
}