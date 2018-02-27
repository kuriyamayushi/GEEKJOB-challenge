<%-- 
    Document   : datasousa5
    Created on : 2018/02/22, 18:46:58
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AMAZOOON</title>
    </head>
    <body>

        <form action ="./datasousa6.jsp" method ="Get">


            雑貨 <input type="radio" name="type" value="1"><br>  生鮮食品 <input type="radio" name="type" value="2"><br> その他 <input type="radio" name="type" value="3"><br><br><br>

            数量 <input type="text" name="count"><br><br><br>


            ランクA 1500円 <input type="radio" name="total" value="1500">　ランクB 1000円 <input type="radio" name="total" value="1000"><br><br>



            <input type = "submit"name = "btnSubmit" value="リクエスト送信">

            </body>
            </html>
