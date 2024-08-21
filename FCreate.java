import java.io.File;
import java.io.IOException;

public class FCreate {
    public static void main(String[] args) {
        File newFile=new File("sample.txt");
        try {
            if (newFile.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File exists");
            }                           
        }
        catch (IOException i){
            System.out.println("Error");
        }                                           //the file sample.txt as been created
                                                    //the next process will be in the next 
    }
}




