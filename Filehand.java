import java.io.File;
import java.io.IOException;

public class Filehand {
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





// // Import the File class
//     import java.io.File;

//     //Import this class for handling errors
//     import java.io.FileNotFoundException;

//     //Import the Scanner class to read content from text file
//     import java.util.Scanner;

// public class FileReading {
//     public static void main(String[] args) {
//         try {
//             File Obj =new File ("sample.txt") ;                      //like scanner statement
//             Scanner  scan =new Scanner (Obj);
//             while (scan.hasNextLine()){
//                 String data =scan.nextLine();
//                 System.out.println(data);
//             }
//             scan.close();
//         }
//         catch(FileNotFoundException i){
//             System.out.println("An error has occured");
//             i.printStackTrace();
//         }
//     }  
// }
