/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
public class JumsHelper {
     
    private final String homeURL = "top.jsp";
    
    public static JumsHelper getInstance(){
        return new JumsHelper();
}
  
    public String home(){
        return "<a href=\""+homeURL+"\">トップへ戻る</a>";
    }

 /**
     * 入力されたデータのうち未入力項目がある場合、チェックリストにしたがいどの項目が
     * 未入力なのかのhtml文を返却する
     * @param chkList　UserDataBeansで生成されるリスト。未入力要素の名前が格納されている
     * @return 未入力の項目に対応する文字列
     */
    public String chkinput(ArrayList<String> chkList){
        String output = "";
        for(String val : chkList){
                if(val.equals("name")){
                    output += "名前";
                }
               
                if(val.equals("pass")){
                    output +="パスワード";
                }
                if(val.equals("mail")){
                    output +="メールアドレス";
                }
                if(val.equals("address")){
                    output +="住所";
                }
                output +="が未記入です<br>";
            }
        return output;
    }

}