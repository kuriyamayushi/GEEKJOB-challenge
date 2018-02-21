/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyouzyunnclass1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class hyouzyunclass4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
   
   Date day1 = null;
   Date day2 = null;
   
   day1 = sdf.parse("2015年01月01日00時00分00秒");
   day2 = sdf.parse("2015年12月31日23時59分59秒");
  
   
     
   long day3 = day1.getTime();
   long day4 = day2.getTime();
   
   long dayDiff = (day4 - day3);// / (1000*60*60*24);
   
   System.out.print("1."+sdf.format(day1));
   System.out.print("2."+sdf.format(day2));
   System.out.print("二つのタイムスタンプの差は"+ dayDiff);
   
   
   
   
    
    
    
    }
    
}
