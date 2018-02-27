<%-- 
    Document   : datasousa1
    Created on : 2018/02/21, 13:09:55
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>個人情報</title>
    </head>
    <body>
        <form action ="./datasousa2.jsp" method ="Get">
           氏名 <input type="text" name="textName"><br><br><br>
            
           男 <input type="radio"name="rdoSample" value="男">　女 <input type="radio"name="rdoSample" value="女"><br><br><br>
           
                      
           <textarea name="mulText" cols="30" rows="10" ></textarea><br><br><br>
            
           <input type = "submit"name = "btnSubmit" value="リクエスト送信">
        
                   
           </form>
    </body>
</html>
