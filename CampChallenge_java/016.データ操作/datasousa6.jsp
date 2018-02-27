<%-- 
    Document   : datasousa6
    Created on : 2018/02/23, 18:00:10
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

            request.setCharacterEncoding("UTF-8");

            String t = (request.getParameter("type"));
            
            out.print("商品タイプは" + t);
            
            String c = (request.getParameter("count"));
            
            out.print("お買い上げ数量" + c + "コ");

            String y = (request.getParameter("total"));

            int i = Integer.parseInt(c);

            int x = Integer.parseInt(y);

            if (i * x > 3000 && i * x < 5000) {
                out.print("今回のポイントは" + i * x * 0.04);
            } else if (i * x > 5000) {
                out.print("今回のポイントは" + i * x * 0.05);

            } else if (i * x < 3000) {
                out.print("今回のポイントは" + "0");
            }


        %>  
    </body>
</html>
