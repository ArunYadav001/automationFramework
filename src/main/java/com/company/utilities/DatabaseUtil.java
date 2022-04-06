package com.company.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseUtil {

     public static  void open(String connectionString){
         try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
             DriverManager.getDriver(connectionString);

         }catch (Exception e){

         }
         }

         public static  void close(){

         }

         public static void ExecuteQuery(String query, Connection connection){

             Statement statement = null;

             try{
                 statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query);

             }catch(Exception e){

             }

         }

}
