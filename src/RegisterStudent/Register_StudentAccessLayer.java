/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegisterStudent;

import Admin.Options.OptionsPage.QuestionBean;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author rusab
 */
public class Register_StudentAccessLayer {
    
     public static int addRec(Register_StudentBean b) throws SQLException
            {
                int rec=0;
                String query="call cr_std(?,?,?,?,?,?,?,?)";
                
                PreparedStatement ps=Database.Connectivity.con.prepareStatement(query);
                
                
                ps.setString(1, b.getLoginID());
                ps.setString(2, b.getPass());
                ps.setString(3, "Student");
                ps.setString(4, b.getName());
                ps.setString(5, b.getMiddle_name());
                ps.setString(6, b.getLast_name());
                ps.setString(7, b.getNic());
                ps.setString(8, b.getPaper());
                
                rec=ps.executeUpdate();
                
                return rec;
            }
 
    
    
    
}
