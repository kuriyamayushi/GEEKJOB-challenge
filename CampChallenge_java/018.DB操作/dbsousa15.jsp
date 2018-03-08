<%-- 
    Document   : dbsousa15
    Created on : 2018/03/08, 10:46:35
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
          <form action ="./dbsousa16.jsp" method ="get">
            
            焼肉栗山　仕入れ管理表<br><br>  
          
            日付 <input type="text" name="day"><br><br>
            
            牛肉 <input type="text" name="beef"><br>
            
            数量 <input type="text" name="beefweigth"><br><br>
            
            豚肉 <input type="text" name="pook"><br>
            
            数量 <input type="text" name="pookweigth"><br><br>
            
            鳥肉 <input type="text" name="chickin"><br>
            
            数量 <input type="text" name="chickinweigth"><br><br>

            <input type = "submit"name = "btnSubmit" value="入力する"> 
        </form>
    </body>
</html>
