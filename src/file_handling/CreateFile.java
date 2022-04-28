package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        // To create a file we use some classes

        File myFile = new File("myFirstFile.xls");
        try {
            myFile.exists(); // true/false > check if file exist

            myFile.createNewFile(); // true// creates the file
            System.out.println("File name is " + myFile.getName()); // myFirstFile.xls
            System.out.println("Path file is " + myFile.getAbsolutePath()); //  C:\Users\mitio\IdeaProjects\tech4Project\myFirstFile.xls
            System.out.println("Size is " + myFile.length());// 0 > contains no information

            Thread.sleep(5000); // 5 seconds
          System.out.println(myFile.delete());  // deletes the file created

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End of the program");
    }
}
