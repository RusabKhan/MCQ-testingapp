/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegisterStudent;

/**
 *
 * @author rusab
 */
public class Register_StudentBean {
    
    
    
    private String name;
    private String middle_name;
    private String last_name;
    private String loginID;
    private String nic;
    private String pass;
    private String paper;

    
    
    
    public Register_StudentBean(String name,String middle_name,String last_name,String loginID,String nic,String pass,String papers){
    
    this.name=name;
    this.middle_name=middle_name;
    this.last_name=last_name;
    this.loginID=loginID;
    this.nic=nic;
    this.pass=pass;
    this.paper=paper;
    
    
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the middle_name
     */
    public String getMiddle_name() {
        return middle_name;
    }

    /**
     * @param middle_name the middle_name to set
     */
    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the loginID
     */
    public String getLoginID() {
        return loginID;
    }

    /**
     * @param loginID the loginID to set
     */
    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the paper
     */
    public String getPaper() {
        return paper;
    }

    /**
     * @param paper the paper to set
     */
    public void setPaper(String paper) {
        this.paper = paper;
    }
   
    
}
