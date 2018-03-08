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
public class dbsousa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/geekjob_db", "root", "");

            db_st = db_con.prepareStatement("select*from profiles where age = ?");

            db_st.setInt(1, 35);

            db_data = db_st.executeQuery();

            while (db_data.next()) {

                System.out.print("名前：" + db_data.getString("name") + "<br>");

            }
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
