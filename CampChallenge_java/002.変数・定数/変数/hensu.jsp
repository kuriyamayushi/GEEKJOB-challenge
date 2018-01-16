<%-- 
    Document   : hensu
    Created on : 2018/01/16, 11:33:17
    Author     : kuriyama
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            out.print("私の名前は栗山裕史です<br>");
            int age = 26;
            out.print("私の年齢は"+age);
           out.print("才です。");
        %>
    </body>
</html>
