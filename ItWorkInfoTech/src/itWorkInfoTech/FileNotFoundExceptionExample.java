package itWorkInfoTech;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            String filename = "nonexistent.txt"; 
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}
