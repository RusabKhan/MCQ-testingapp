/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.Options.OptionsPage;

/**
 *
 * @author rusab
 */
public class QuestionBean {
    
  
    private String question;
    private String opA;
    private String opB;  
    private String opC;
    private String opD;
    private String CorrectOP;
    private String chapter;
    private String subject;
    private String paper;
    private double Sno;
    
    
    public QuestionBean(String question,String opA,String opB,String opC,String opD,String CorrectOP,String paper){
        
        this.question=question;
        this.opA=opA;
        this.opB=opB;
        this.opC=opC;
        this.opD=opD;
        this.CorrectOP=CorrectOP;
        this.paper=paper;
    }

    QuestionBean() {
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return the opA
     */
    public String getOpA() {
        return opA;
    }

    /**
     * @param opA the opA to set
     */
    public void setOpA(String opA) {
        this.opA = opA;
    }

    /**
     * @return the opB
     */
    public String getOpB() {
        return opB;
    }

    /**
     * @param opB the opB to set
     */
    public void setOpB(String opB) {
        this.opB = opB;
    }

    /**
     * @return the opC
     */
    public String getOpC() {
        return opC;
    }

    /**
     * @param opC the opC to set
     */
    public void setOpC(String opC) {
        this.opC = opC;
    }

    /**
     * @return the opD
     */
    public String getOpD() {
        return opD;
    }

    /**
     * @param opD the opD to set
     */
    public void setOpD(String opD) {
        this.opD = opD;
    }

    /**
     * @return the CorrectOP
     */
    public String getCorrectOP() {
        return CorrectOP;
    }

    /**
     * @param CorrectOP the CorrectOP to set
     */
    public void setCorrectOP(String CorrectOP) {
        this.CorrectOP = CorrectOP;
    }

    /**
     * @return the chapter
     */
    public String getChapter() {
        return chapter;
    }

    /**
     * @param chapter the chapter to set
     */
    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
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

    /**
     * @return the Sno
     */
    public double getSno() {
        return Sno;
    }

    /**
     * @param Sno the Sno to set
     */
    public void setSno(double Sno) {
        this.Sno = Sno;
    }









}
