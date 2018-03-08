<%-- 
    Document   : dbsousa11
    Created on : 2018/03/07, 19:54:13
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
        <form action ="./dbsousa12.jsp" method ="get">


            ID <input type="text" name="inid"><br><br>
            名前 <input type="text" name="inname"><br><br>
            携帯番号 <input type="text" name="intel"><br><br>
            年齢 <input type="text" name="inage"><br><br>
            誕生日 <input type="text" name="inbirthday"><br><br>

            <input type = "submit"name = "btnSubmit" value="登録する"> 
        </form>
    </body>
</html>
