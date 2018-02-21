/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hyouzyunnclass1;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author guest1Day
 */
public class hyouzyunclass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar a =  Calendar.getInstance();
        
        SimpleDateFormat b = new SimpleDateFormat("yyyy年MM月dd日hh時mm分ss秒");
        
        System.out.print(b.format(a.getTime()));
        
    }
    
}
