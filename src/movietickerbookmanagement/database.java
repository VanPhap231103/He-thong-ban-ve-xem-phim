/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietickerbookmanagement;
import java.sql.*;

/**
 *
 * @author ACER
 */
public class database {
    
       public static Connection connectDb(){
           
           try{
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/movieBook","root","");
               
               return connect;
           }
           catch (Exception e) {
               e.printStackTrace();
           }           
           return null;
}
}
