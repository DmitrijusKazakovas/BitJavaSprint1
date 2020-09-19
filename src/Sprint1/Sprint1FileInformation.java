package Sprint1;

import java.io.File;

public class Sprint1FileInformation {
    public static void main(String[] args) {
        //Kosminis laivas skrenda tikrinti EmployeeFile parametrus
        File EmployeeInfo = new File("G:\\JavaProjs\\Sprint 1 (CSV to Console via IO)\\EmployeeInfo.csv");
        if (EmployeeInfo.exists()){
            System.out.println("File name: " + EmployeeInfo.getName());
            System.out.println("Absolute path: " + EmployeeInfo.getAbsolutePath());
            System.out.println("Writeable: " + EmployeeInfo.canWrite());
            System.out.println("Readable " + EmployeeInfo.canRead());
            System.out.println("File size in bytes " + EmployeeInfo.length());
        }else {
            System.out.println("File does not exist.");
        }
    }
}
