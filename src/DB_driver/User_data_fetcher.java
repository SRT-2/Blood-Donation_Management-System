/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB_driver;

import com.mysql.jdbc.Statement;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author user
 */
public class User_data_fetcher {
    
    public ArrayList getData(Statement st,String username){
        
        ArrayList data=new ArrayList();
        
        try
        {
            String query="select * from registration_input where username='"+username+"'";
            ResultSet rs=st.executeQuery(query);
            
            if(rs.next())
           {
                String name=rs.getString(1);
                String email=rs.getString(2);
                String mobile=rs.getString(3);
                String address=rs.getString(4);
                String password=rs.getString(6);
                
                data.add(name);
                data.add(email);
                data.add(mobile);
                data.add(address);
                data.add(username);
                data.add(password);
                
           }
            
        }
        catch(Exception ex)
        {
        System.out.println("exception is"+ex); 
        }
    
        return data;
}
}