<%-- 
    Document   : ru-pusyori
    Created on : 2018/01/23, 10:21:57
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
        <%
        int total = 8;
        for (int i = 0; i<20; i++){
            total*= 8 ;
            out.print(total);
            
        }
        
%>
    </body>
</html>
