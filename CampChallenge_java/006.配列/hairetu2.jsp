<%-- 
    Document   : hairetu2
    Created on : 2018/01/22, 13:28:30
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
        String[] c = {"10","100","soeda","hatasi","-20","118","END"};

        c[2] = "33";
        
        out.print(c[2]);
       %>
    </body>
</html>
