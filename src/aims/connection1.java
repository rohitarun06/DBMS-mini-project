/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aims;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rohit
 */
public class connection1 {
    

    
    public static Connection getConnection(){
            Connection con = null;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/agridb","root","Rohit@2002");
                
                
                
            }catch(ClassNotFoundException | SQLException e){
                System.out.println(e.getMessage());
                
            }
            return con;
    }

     
    
}
