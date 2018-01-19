<%--
    Document   : swichbun2
    Created on : 2018/01/17, 16:24:52
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


        //シングルクォートで囲む
        // shift + 7 で出てくる
        char a = 'あ';
        //String name = "arai";


        switch(a){

            case 'A':
                out.print("英語");
               break;
            case 'あ':
                out.print("日本語");
               break;
            default:


        }
        %>
    </body>
</html>
