<%--
  Created by IntelliJ IDEA.
  User: SEEDINFOTECH
  Date: 3/7/2018
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
    <h1>Spring MVC Web Training</h1>
    <h3>Message: <%=request.getAttribute("fsg")%></h3>
    <h3>Message: ${fsg}</h3>
    <h3>Cookie: ${testCookie}</h3>
    <h4>Account</h4>
    <p>Id: ${account.id}</p>
    <p>Id: ${account.name}</p>
    <p>Id: ${account.balance}</p>
</body>
</html>
