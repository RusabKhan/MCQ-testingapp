/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.Options.OptionsPage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rusab
 */
public class QuestionAccessLayer extends Questions {
    
    
    
     public static int addRec(QuestionBean b) throws SQLException
            {
                int rec=0;
                String query="call str_ques(?,?,?,?,?,?,?)";
                
                PreparedStatement ps=Database.Connectivity.con.prepareStatement(query);
                
                
                ps.setString(1, b.getQuestion());
                ps.setString(2, b.getOpA());
                ps.setString(3, b.getOpB());
                ps.setString(4, b.getOpC());
                ps.setString(5, b.getOpD());
                ps.setString(6, b.getCorrectOP());
                ps.setString(7, b.getPaper());
               
                
                rec=ps.executeUpdate();
                
                return rec;
            }
     
       private static Vector<QuestionBean> getList() throws SQLException
    {
        Vector<QuestionBean> vec=new Vector<QuestionBean>();
      
        
        String query="call get_question()";
        
        PreparedStatement ps=Database.Connectivity.con.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
        
        while(rs.next())
        {
            QuestionBean b=new QuestionBean();
           
            b.setPaper(rs.getString("Paper"));
            b.setQuestion(rs.getString("question"));
            b.setOpA(rs.getString("OpA"));
            b.setOpB(rs.getString("OpB"));
            b.setOpC(rs.getString("OpC"));
            b.setOpD(rs.getString("OpD"));
            b.setCorrectOP(rs.getString("CorrectOP")); 
            b.setPaper(rs.getString("Paper"));
             b.setSno(rs.getDouble("Sno"));
           
            vec.add(b);
        }
        return vec;
    }
     
      public static void setTable(javax.swing.JTable table) throws SQLException
    {
        Vector<QuestionBean> arr=getList();
        DefaultTableModel dt=(DefaultTableModel)table.getModel();
        
        for(QuestionBean b : arr)
        {
            Vector vec=new Vector();
            vec.add(b.getSno());
            vec.add(b.getPaper());
            vec.add(b.getQuestion());
            vec.add(b.getOpA());
            vec.add(b.getOpB());
            vec.add(b.getOpC());
            vec.add(b.getOpD());
            vec.add(b.getCorrectOP());
            dt.addRow(vec);
            
        }
     
     
}
      
       public static int updRec (QuestionBean b) throws SQLException{
    int rec=0;
      String query="call upd_ques(?,?,?,?,?,?,?,?)";
      PreparedStatement ps=Database.Connectivity.con.prepareStatement(query);
                ps.setString(1, b.getQuestion());
                ps.setString(2, b.getOpA());
                ps.setString(3, b.getOpB());
                ps.setString(4, b.getOpC());
                ps.setString(5, b.getOpD());
                ps.setString(6, b.getCorrectOP());
                ps.setString(7, b.getPaper());
                ps.setDouble(8, b.getSno());
               
        rec=ps.executeUpdate();
             
      return rec;      
          
   
      
}
       
}
