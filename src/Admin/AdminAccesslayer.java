/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author rusab
 */
public class AdminAccesslayer {
    
    
    
     public static String  getAdmin(String Admin) throws SQLException
    {
       
      String password=null;
        
        String query="call get_admin(?)";
        
        PreparedStatement ps=Database.Connectivity.con.prepareStatement(query);
        ps.setString(1, Admin);
        ResultSet rs=ps.executeQuery();
        
        while (rs.next()){
         password=rs.getString("pass");  
        }
  return password;
    }
}