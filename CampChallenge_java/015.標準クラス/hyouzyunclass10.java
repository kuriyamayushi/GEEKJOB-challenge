/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyouzyunnclass1;

import java.util.HashSet;
import java.io.*;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author guest1Day
 */
public class hyouzyunclass10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Date d = new Date();
        System.out.print("処理を実行します。" + d + "開始");

        File fp = new File("test.txt");

        FileWriter fw = new FileWriter(fp);

        fw.write("名前を格納する処理を行います。");

         HashSet<String> PersonalData = new HashSet<String>();
        
        PersonalData.add("タケヤマ.");
        PersonalData.add("クリヤマ.");
        PersonalData.add("フクヤマ");
        
        Iterator<String> it = PersonalData.iterator();
        
         while (it.hasNext()){
            fw.write(it.next());
        }
        
        fw.close();

        FileReader fr = new FileReader(fp);

        BufferedReader br = new BufferedReader(fr);

        System.out.print(br.readLine());

        br.close();

       
        
       
        //name a = new String; 
        
//        name("クリヤマ");
//        name b = new 
//        PersonalData.add(a);
//        PersonalData.add(b);

       //for (String a : PersonalData) {
       //     System.out.print(a);
       // }

        System.out.print("処理を完了しました。" + d + "終了");

    }
    

}
