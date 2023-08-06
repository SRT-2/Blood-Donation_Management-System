/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB_driver;
  import java.sql.*;
/**
 *
 * @author user
 */
public class DB_connection {

       
    public Statement getConnection()
    {
        Statement st=null;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_donation_database","root","root");
            st=conn.createStatement();
            }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex)
        {
            System.out.println("exception while inserting data"+ex);
        }
        return st;
    }
    
  

}
