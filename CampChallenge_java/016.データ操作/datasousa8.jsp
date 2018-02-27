<%-- 
    Document   : datasousa8
    Created on : 2018/02/23, 19:21:47
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
        String n = (request.getParameter("number"));

        int i = Integer.parseInt(n);
        
        out.print(n);

        while(i > 1) {
            if (i % 2 == 0) {
                i /= 2;
                out.print(2);
            } else if (i % 3 == 0) {
                i /= 3;
                out.print(3);
            } else if (i % 5 == 0) {
                i /= 5;
                out.print(5);
            } else if (i % 7 == 0) {
                i /= 7;
                out.print(7);
           
            }else{
              out.print("余りは" + i + "です。");
            break;
            }
        }
         if (i == 1){
                out.print("余りは０です。");
         }
        %></body>
</html>
