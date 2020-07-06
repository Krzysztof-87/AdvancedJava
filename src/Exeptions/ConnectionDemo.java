package Exeptions;

import java.io.File;
import java.io.FileNotFoundException;

public class ConnectionDemo {


    public static void main(String[] args) {
        FileDbConnection fileDbConnection = new FileDbConnection();
        try {
            fileDbConnection.connect();
            fileDbConnection.getData();
            System.out.println(fileDbConnection.isConnected());
            System.out.println(fileDbConnection.getData());
        }catch(FileDbConnectionException e){
            System.out.println(e.getMessage());
    } finally {
            fileDbConnection.disconnect();
        }
        System.out.println(fileDbConnection.isConnected());


        }
}
