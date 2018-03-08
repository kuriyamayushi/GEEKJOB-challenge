<%-- 
    Document   : dbsousa13
    Created on : 2018/03/08, 10:16:32
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
         <form action ="./dbsousa14.jsp" method ="get">
          
            名前 <input type="text" name="inname"><br><br>
            
            年齢 <input type="text" name="inage"><br><br>
            
            誕生日 <input type="text" name="inbirthday"><br><br>

            <input type = "submit"name = "btnSubmit" value="検索する"> 
        </form>
    </body>
</html>
