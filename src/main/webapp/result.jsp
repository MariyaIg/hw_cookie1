<%--
  Created by IntelliJ IDEA.
  User: Мария
  Date: 30.03.2024
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>all series of symbols</h1>
<h1>
    <%=request.getAttribute("allSeries")%>
</h1>

<h1>maximum series of characters in text</h1>

<%=request.getAttribute("max")%>
<br>
<h1>
    number of character in max series<br>
    ${max.length()}<br>
</h1>

<a href="index.jsp">на главную</a><br>

</body>
</html>
