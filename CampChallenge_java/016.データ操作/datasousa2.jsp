<%-- 
    Document   : datasousa2
    Created on : 2018/02/21, 15:28:35
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><%
        
        request.setCharacterEncoding("UTF-8");

        out.print(request.getParameter("textName"));

        out.print(request.getParameter("rdoSample"));

        out.print(request.getParameter("mulText"));


      %>  
    </body>
</html>
