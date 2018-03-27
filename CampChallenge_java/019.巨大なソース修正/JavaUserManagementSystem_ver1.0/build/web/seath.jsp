<%-- 
    Document   : seath
    Created on : 2018/03/12, 11:08:00
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="jums.JumsHelper" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action ="./insertresult.jsp" method ="get">
          
            名前 <input type="text" name="name"><br><br>
            
            年齢 <input type="text" name="age"><br><br>
            
            種別 <input type="text" name="type"><br><br>

            <input type = "submit"name = "btnSubmit" value="検索する"> 
        </form>
         <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
