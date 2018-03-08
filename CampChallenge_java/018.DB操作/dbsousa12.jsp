<%-- 
    Document   : dbsousa12
    Created on : 2018/03/07, 19:54:41
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
            String ii = request.getParameter("inid");
            String in = request.getParameter("inname");
            String it = request.getParameter("intel");
            String ia = request.getParameter("inage");
            String ib = request.getParameter("inbirthday");

            Connection db_con = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int f = 0;

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();

                db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/geekjob_db", "root", "");

                db_st = db_con.prepareStatement("insert into profiles ( profilesid , name , tel , age , birthday ) values ( ? , ? , ? , ? , ? )");

                db_st.setString(1, ii);

                //a = db_st.executeUpdate();

                db_st.setString(2, in );

                //b = db_st.executeUpdate();

                db_st.setString(3, it);

                //c = db_st.executeUpdate();

                db_st.setString(4, ia);

                //d = db_st.executeUpdate();

                db_st.setString(5, ib );

                db_st.executeUpdate();

                db_st = db_con.prepareStatement("select * from profiles");

                db_data = db_st.executeQuery();

                while (db_data.next()) {

                    out.print("ID：" + db_data.getInt("profilesid") + "<br>");

                    out.print("名前：" + db_data.getString("name") + "<br>");

                    out.print("TEL：" + db_data.getString("tel") + "<br>");

                    out.print("年齢：" + db_data.getInt("age") + "<br>");

                    out.print("誕生日：" + db_data.getInt("birthday") + "<br>");

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
