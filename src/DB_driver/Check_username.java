/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB_driver;
import java.sql.*;
import java.util.*;
/**
 *
 * @author user
 */
public class Check_username {
    
    public ArrayList checkusername(Statement st){
        ArrayList a1=new ArrayList();
        
        try{
            String query= "select * from registration_input";
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                String username=rs.getString(5);
                a1.add(username);  
                
                
            }
        }
        catch(Exception ex){
            System.out.println("exception is : "+ex);
     
       }
       
        System.out.println(a1);
         return a1;
    }
    
}
