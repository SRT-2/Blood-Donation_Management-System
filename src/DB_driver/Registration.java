/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB_driver;

import com.mysql.jdbc.Statement;

/**
 *
 * @author user
 */
public class Registration {

    
    public boolean isInsert(Statement st,String name,String email,String mobile,String address,String username,String password){
        boolean flag=false;
        
        try{
            String query="insert into registration_input values('"+name+"','"+email+"','"+mobile+"','"+address+"','"+username+"','"+password+"')";
            int rows=st.executeUpdate(query);
            if(rows>0)
                flag=true;
        }
        catch(Exception ex)
        {
            System.out.println("exception occured while inserting"+ex);
        }
        return flag;
    }
    
}
