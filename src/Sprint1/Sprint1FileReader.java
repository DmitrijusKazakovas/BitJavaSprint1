package Sprint1;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Sprint1FileReader {
    public static void main(String[] args) {
        try{
            File EmployeeInfo = new File("G:\\JavaProjs\\Sprint 1 (CSV to Console via IO)\\EmployeeInfo.csv");
            Scanner EmployeeInfoScanner = new Scanner(EmployeeInfo);
            while (EmployeeInfoScanner.hasNextLine()) {
                String data = EmployeeInfoScanner.nextLine();
                System.out.println(data);
            }
            EmployeeInfoScanner.close();
        }catch (FileNotFoundException e){
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
}
