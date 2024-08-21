
// Import the File class
    import java.io.File;

    //Import this class for handling errors
    import java.io.FileNotFoundException;

    //Import the Scanner class to read content from text file
    import java.util.Scanner;

public class FRead {
    public static void main(String[] args) {
        try {
            File Obj =new File ("sample.txt") ;                      //like scanner statement
            Scanner  scan =new Scanner (Obj);
            while (scan.hasNextLine()){
                String data =scan.nextLine();
                System.out.println(data);
            }
            scan.close();
        }
        catch(FileNotFoundException i){
            System.out.println("An error has occured");
            i.printStackTrace();
        }
    }                                                            //the file reading has been created
                                                                //    the next process is after that
}

