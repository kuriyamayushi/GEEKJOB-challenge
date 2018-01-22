<%-- 
    Document   : rensouhairerunosakusei
    Created on : 2018/01/22, 14:39:29
    Author     : guest1Day
--%>
<%@ page import ="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        HashMap<String,String> date1 = new HashMap<String,String>();
        date1.put("1","AAA"); 
        
        
        date1.put("Hellow","World" );
        
         
        date1.put("soeda","33" );
        
        
        date1.put("20","20" );
        
        out.print(date1);
        
        %>
    </body>
</html>
