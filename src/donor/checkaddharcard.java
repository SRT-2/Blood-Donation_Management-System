  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donor;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class checkaddharcard {
    
     public boolean checkaddhar(Statement st,String addharno){
        boolean flag=false;
        
        
        try{ 
            String query= "select * from donor_info where addhar_no'"+addharno+"'";
            ResultSet rs=st.executeQuery(query);
           if(rs.next())
               flag=false;
           else
               flag=true;   
            }
         
        catch(Exception ex){
            System.out.println("exception is : "+ex);
     
       }
       
        return flag;
}
}