<%-- 
    Document   : ru-pusyori2
    Created on : 2018/01/23, 13:21:42
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
        String name = "A";
        
        for (int i=0; i<30; i++){
            name += "A";
        }
        
        
        out.print(name);
        

        //String str = "a";
//        out.print(str);
//        out.print(str);
//        out.print(str);
        
        //str = str + "a";//=> "aa"
        //str = str + "a";//=> "aaa"
        //out.print(str);//=> "aaa"と表示される

        %>
    </body>
</html>
