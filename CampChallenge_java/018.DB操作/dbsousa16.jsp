<%-- 
    Document   : dbsousa16
    Created on : 2018/03/08, 10:46:52
    Author     : guest1Day
--%>
<%@page import = "java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

            request.setCharacterEncoding("UTF-8");
            
            String id = request.getParameter("day");
            
            String be = request.getParameter("beef");
            
            String bw = request.getParameter("beefweigth");
            
            int a = Integer . parseInt(bw);
            
            String po = request.getParameter("pook");
            
            String pw = request.getParameter("pookweigth");
            
            int b = Integer . parseInt(pw);
            
            String ch = request.getParameter("chickin");
            
            String cw = request.getParameter("chickinweigth");
            
            int c = Integer . parseInt(cw);
          

            Connection db_con = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;
            /*int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            int f = 0;
            int g = 0;*/
           

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();

                db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db", "root", "");

                 //db_st = db_con.prepareStatement("create table manage (day date , beef varchar(255) , beefweight int , pook varchar(255) , pookweight int ,  chicken varchar(255) , chickenweight int)");

                //db_data = db_st.executeQuery();

                 db_st = db_con.prepareStatement("insert into manage (day , beef , beefweight , pook , pookweight , chicken , chickenweight) values (? , ? , ? , ? , ? , ? , ?)");

                
                db_st.setString(1, id );
 
                db_st.setInt(2, a);

                db_st.setString(3, bw);
                
                db_st.setString(4, po);
                
                db_st.setInt(5, b);
                
                db_st.setString(6, ch);
                
                db_st.setInt(7, c);
                
                
                

                db_st.executeUpdate();

                //db_st = db_con.prepareStatement("select * from profiles");

                //db_data = db_st.executeQuery();

                while (db_data.next()) {

                    out.print("日付：" + db_data.getInt("day") + "<br>");

                    out.print("牛肉：" + db_data.getString("beef") + "<br>");

                    out.print("数量：" + db_data.getString("beefweigth") + "<br>");

                    out.print("豚肉：" + db_data.getInt("pook") + "<br>");

                    out.print("数量：" + db_data.getInt("pookweigth") + "<br>");

                    out.print("鶏肉：" + db_data.getInt("chickin") + "<br>");
                
                    out.print("数量：" + db_data.getInt("chickinweigth") + "<br>");
                }
                db_data.close();

                db_st.close();

                db_con.close();

            } catch (SQLException e_sql) {
                System.out.println(e_sql);

                System.out.print("接続時にエラーが発生しました：" + e_sql.toString());
            } catch (Exception e) {
                System.out.print("接続時にエラーが発生しました：" + e.toString());

            } finally {
                if (db_con != null) {
                    try {
                        db_con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();

                    }

                }
            }


        %>
    </body>
</html>
