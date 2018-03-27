
<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
     HttpSession hs = request.getSession();
    UserDataBeans ChD = (UserDataBeans)hs.getAttribute("ChangeData");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS更新結果画面</title>
    </head>
    <body>
        <h1>変更結果</h1><br>
        名前:<%= ChD.getName()%><br>
        生年月日:<%= ChD.getYear()+"年"+ChD.getMonth()+"月"+ChD.getDay()+"日"%><br>
        種別:<%= jh.exTypenum(ChD.getType())%><br>
        電話番号:<%= ChD.getTell()%><br>
        自己紹介:<%= ChD.getComment()%><br>
        以上の内容で登録しました。<br>
    </body>
    <%=jh.home()%>
    </body>
</html>
