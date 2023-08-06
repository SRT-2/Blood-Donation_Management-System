
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
public class EditProfile 
{
        public boolean isUpdate(Statement st,String name,String email,String mobile,String address,String username,String password){
        boolean flag=false;
        
        try{
            String query="update registration_input set Name='"+name+"',email_id='"+email+"',mobile_number='"+mobile+"',address='"+address+"',username='"+username+"',password='"+password+"'where username='"+username+"'";
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
