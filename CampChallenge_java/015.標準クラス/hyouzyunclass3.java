/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyouzyunnclass1;
import java.text.ParseException;
import java.util.Date;
//import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author guest1Day
 */
public class hyouzyunclass3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
   
   
  //Calendar someday = Calendar.getInstance;
  
   SimpleDateFormat a = new SimpleDateFormat("yyyy年MM月dd日hh時mm分ss秒");
   
   Date day = a.parse("2016年11月04日10時00分00秒");
   //System.out.print(a.format(someday.getTime()));
   
  
   System.out.print(a.format(day));
    }
    
}
