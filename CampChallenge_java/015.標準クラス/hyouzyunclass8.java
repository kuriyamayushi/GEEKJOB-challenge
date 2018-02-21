/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyouzyunnclass1;
import java.io.*;
/**
 *
 * @author guest1Day
 */
public class hyouzyunclass8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
   File fp = new File("test.txt");
   
   FileWriter fw = new FileWriter(fp);
   
   fw.write("クリヤマユウシ");
   
   fw.close();
   
   
   
   
    
    }
    
}
