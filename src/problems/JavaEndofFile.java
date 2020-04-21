package problems;
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
public class JavaEndofFile {

    public static void main(String[] args) throws FileNotFoundException{
    	File readFile = new File("C:/readFile.txt"); //String con el nombre y la ubicacion del archivo
    	//En vez de enviarle System.in le envias el archivo
    	Scanner in = new Scanner(readFile);
        int counter = 1;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(counter  +" "+line);
            counter++;
        }
    }
}