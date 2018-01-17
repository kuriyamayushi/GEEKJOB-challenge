<%-- 
    Document   : ifbunn
    Created on : 2018/01/17, 10:53:50
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
      int a = 2;
      if ( a == 1){
         out.print("1です<br>");  
      } else if (a == 2){
         out.print("プログラミングキャンプ！<br>");
     }else{
          out.print("その他です");
      }        
              
         
          
      
      
      

      %>
    </body>
</html>
