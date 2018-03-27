/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;
import java.io.Serializable;

/**
 *
 * @author guest1Day
 */


public class UserDataBeans implements Serializable{
    private String Name = "";
    private String Year = "";
    private String Month = "";
    private String Day = "";
    private String Type = "";
    private String Comment = "";
    private String Tell = "";
    private int Pass = 0;
    
    public UserDataBeans(){}
    
    public String getName() { return this.Name;}
    
    public void setName(String n) {this.Name = n;}
    
   public String getYear() { return this.Year;}
    
    public void setYear(String y) {this.Year = y;}
    
    public String getMonth() { return this.Month;}
    
    public void setMonth(String m) {this.Month = m;}
    
    public String getDay() { return this.Day;}
    
    public void setDay(String d) {this.Day = d;}
    
    public String getType() { return this.Type;}
    
    public void setType(String t) {this.Type = t;}
    
    public String getComment() { return this.Comment;}
    
    public void setComment(String c) {this.Comment = c;}
    
    public String getTell() { return this.Tell;}
    
    public void setTell(String te) {this.Tell = te;}
    
    public int getPass() { return this.Pass;}
    
    public void setPass(int p) {this.Pass = p;}
}
