<%-- 
    Document   : FortuneTellingResult
    Created on : 2018/01/24, 13:09:59
    Author     : guest1Day
--%>
<%@page import="org.mypackage.sample.ResultData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <%
        ResultData data = (ResultData)request.getAttribute("DATA");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
       if (data !=null){
           out.print("<h1>あなたの"+"運勢は、"+data.getLuck()+"です！</h1>");
       }
       %> 
       
       
    </body>
</html>
