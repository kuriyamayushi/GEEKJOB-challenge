/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author guest1Day
 */
public class dbsousa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        int nam = 0;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/geekjob_db", "root", "");

            db_st = db_con.prepareStatement("insert into profiles (profilesid , name , tel , age , birthday) values (? , ? , ? , ? , ?); ");

            db_st.setInt(1, 3);
            
            db_st.setString(2, "田中勝");
            
            db_st.setString(3, "090-1111-1111");
            
            db_st.setInt(4, 30);
            
            db_st.setString(5, "1990-08-30");
            
            db_st.setInt(1, 3);

            nam = db_st.executeUpdate();
            

//            while (db_data.next()) {
//
//                System.out.print("名前：" + db_data.getString("name") + "<br>");
//
//            }
System.out.print(nam);
            db_data.close();

            db_st.close();

            db_con.close();

        } catch (SQLException e_sql) {
            System.out.println(e_sql);

            System.out.print("接続時にエラーが発生しました：" + e_sql.toString());
        } catch (Exception e) {

        }
    }
}
    
    
    
    
    
