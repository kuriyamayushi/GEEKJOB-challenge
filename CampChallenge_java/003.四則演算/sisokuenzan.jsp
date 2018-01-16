<%-- 
    Document   : teisu
    Created on : 2018/01/16, 14:07:01
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
       final int a = 6;
        int b = 2;
        int c = a*b;
        int d = a+b;
        int e = a-b;
        int f = a/b;
       
        out.print("6かける2は" + c +"<br>");
       
        out.print("6足す2は" + d +"<br>");
        out.print("6引く2は" + e + "<br>");
       out.print("6割る2は" + f + "<br>");


        
        
%>
         
                 
                
    </body>
</html>
