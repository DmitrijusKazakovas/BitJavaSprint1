package Sprint1;

import java.io.FileWriter;
import java.io.IOException;

public class Sprint1FileWriter {
    public static void main(String[] args) {
        //Rašom informaciją į EmployeeInfo
        try{
            FileWriter WriteEmployeeInfo = new FileWriter("G:\\JavaProjs\\Sprint 1 (CSV to Console via IO)\\EmployeeInfo.csv");
            WriteEmployeeInfo.write("Anna Annaite " + "Jonas Jonaitis " + "Robertas Mugabe ");
            WriteEmployeeInfo.close();
            System.out.println("Employee info updated successfully.");
        }catch (IOException e){
            System.out.println("Error.");
            e.printStackTrace();
        }
    }
}
