/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyouzyunnclass1;

import java.util.Calendar;

/**
 *
 * @author guest1Day
 */
public class hyouzyunclass {
    public static void main (String[] args){
   
  Calendar a = Calendar.getInstance();

  a.set(2016,1,1,0,0,0);
  
  System.out.print(a.get(Calendar.YEAR));
  System.out.print(a.get(Calendar.MONTH));
  System.out.print(a.get(Calendar.DAY_OF_MONTH));
  System.out.print(a.get(Calendar.HOUR_OF_DAY));
  System.out.print(a.get(Calendar.MINUTE));
  System.out.print(a.get(Calendar.SECOND));
  
    }
  

}
