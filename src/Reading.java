import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\jyoti\\Employee.csv");

        Scanner sc=new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
