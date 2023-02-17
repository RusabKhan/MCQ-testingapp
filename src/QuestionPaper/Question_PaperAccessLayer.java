/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionPaper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author rusab
 */
public class Question_PaperAccessLayer {
    
     public static Vector<Question_PaperBean> getList() throws SQLException
        {
        Vector<Question_PaperBean> vec=new Vector<Question_PaperBean>();
      
        
        String query="call get_question()";
        
        PreparedStatement ps=Database.Connectivity.con.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
        
        while(rs.next())
        {
            Question_PaperBean b=new Question_PaperBean();
            b.setQuestion(rs.getString("question"));
            b.setOpA(rs.getString("opA"));
            b.setOpB(rs.getString("opB"));
            b.setOpC(rs.getString("opC"));
            b.setOpD(rs.getString("opD"));
            b.setCorrectOP(rs.getString("CorrectOP"));
            
            vec.add(b);
            
            
        }
        return vec;
    }
    
}
