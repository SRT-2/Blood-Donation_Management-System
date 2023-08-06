/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB_driver;

import com.mysql.jdbc.Statement;
import java.sql.*;
/**
 * 
 * @author user
 */
public class Login {
    
    public boolean isLogin(Statement st,String username,String password)
    {
       boolean flag=false;
        try{
            String query="select * from registration_input where username='"+username+"'and password='"+password+"'";
            ResultSet rs=st.executeQuery(query);
             if(rs.next())
                 flag=true;
             else
                 flag=false;
             
        } 
        catch(Exception ex){
            System.out.println("Exception is"+ex);
        }
        return flag;
    }
}
