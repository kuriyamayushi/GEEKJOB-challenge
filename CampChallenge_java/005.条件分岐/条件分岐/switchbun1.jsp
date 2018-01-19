<%-- 
    Document   : switchbun1
    Created on : 2018/01/17, 15:56:37
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
            int a = 1;
            switch (a) {
                case 1:
                    out.print("ONE");
                    break;
                case 2:

                    out.print("TWO");
                    break;
                default:
                    out.print("想定外");
            }
        %>

    </body>
</html>
