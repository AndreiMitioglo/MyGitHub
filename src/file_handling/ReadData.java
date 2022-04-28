package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
/*
    1. create a new txt file called shoppingList
    2. Write all items below
    Ice-cream
    Fruits
    Pen
    Paper
    Milk
 */
        File file1 = new File("shoppingList.txt");

        try {

            file1.createNewFile();

            FileWriter fileWriter = new FileWriter("shoppingList.txt");
            fileWriter.write("Ice-cream\n");
            fileWriter.write("Fruits\n");
            fileWriter.write("Pen\n");
            fileWriter.write("Paper\n");
            fileWriter.write("Milk");
            fileWriter.close();
            Thread.sleep(1000);

            Scanner scanner = new Scanner(file1);
            // 1st way to print each element
//            for (int i = 1; scanner.hasNextLine(); i++) {
//                System.out.println("Item" + i + " = " + scanner.nextLine());
//            }

            // 2nd way to print each element
           int index = 1;
            while (scanner.hasNextLine()){
                System.out.println("Item " + index++ + " = " + scanner.nextLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
          file1.delete();  // delete the file1

        }
        System.out.println("End of the program");

    }
}
