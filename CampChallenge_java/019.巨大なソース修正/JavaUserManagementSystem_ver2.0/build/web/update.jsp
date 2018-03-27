<%@page import="java.util.Calendar"%>
<%@page import="jums.UserDataBeans"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jums.UserDataDTO"%>
<%@page import="jums.JumsHelper" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    
    UserDataBeans UDB =(UserDataBeans)session.getAttribute("updata_resultData");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS変更画面</title>
    </head>
    <body>
    <form action="UpdateResult" method="POST">
        名前:
        <input type="text" name="name" value="<%=UDB.getName()%>">
        <br><br>

        生年月日:　
        <select name="year" value="<%=UDB.getYear()%>">
            <option value="">----</option>
            
            <% for(int i=1950; i<=2010; i++){ %>
             <%if (i == UDB.getYear()){%>
             
              <option value="<%=i%>" selected><%=UDB.getYear()%></option>
              <%}else{%>
            <option value="<%=i%>" ><%=i%></option>
            <% } %>
            <% } %>
        </select>年
        <select name="month" value=<%=UDB.getMonth()%>>
            <option value="">--</option>
            <% for(int i = 1; i<=12; i++){ %>
            <%if (i == UDB.getMonth()){%>
             <option value="<%=i%>" selected><%=UDB.getMonth()%></option>
             <%}else{%>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
            <% } %>
        </select>月
        <select name="day" >
            <option value="">--</option>
           
            <% for(int i = 1; i<=31; i++){ %>
                <%if (i == UDB.getDay()){%>
                    <option value="<%=i%>" selected><%=UDB.getDay()%></option>
                <%}else{%>
                    <option value="<%=i%>"><%=i%></option>
                <% } %>
            <% } %>
        </select>日
        <br><br>

        種別:
        <br>
            <% for(int i = 1; i<=3; i++){ %>
            <%if (i == UDB.getType()){%>
                 <input type="radio" name="type" value="<%=i%>" checked = "checked"><%=jh.exTypenum(i)%><br>   
                <%}else{%>
            <input type="radio" name="type" value="<%=i%>"><%=jh.exTypenum(i)%><br>
            <% } %>
            <% } %>
        <br>

        電話番号:
        <input type="text" name="tell" value="<%=UDB.getTell()%>">
        <br><br>

        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50  style="resize:none" wrap="hard"><%=UDB.getComment()%></textarea><br><br>
        
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <%=jh.home()%>
    </body>
</html>
