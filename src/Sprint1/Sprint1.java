package Sprint1;

import java.io.File;
import java.io.IOException;

public class Sprint1 {
    public static void main(String[] args) {
        //Sukuriam csv failą per try+catch
        try{
            File EmployeeInfo = new File("G:\\JavaProjs\\Sprint 1 (CSV to Console via IO)\\EmployeeInfo.csv");
            if (EmployeeInfo.createNewFile()) {
                System.out.println("File created: " + EmployeeInfo.getName());
            }else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
}
