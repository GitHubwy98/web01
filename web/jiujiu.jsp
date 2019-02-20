<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/16 0016
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table id="tb" border="1">
    <%
        int i = 0;
        int j = 0;
        for (i = 1; i < 10; i++) {
    %>
    <tr>
        <%
            for (j = 1; j <= i; j++) {
        %>
        <td><%=i%>*<%=j%>=<%=i * j%>
        </td>
        <%
            }
        %>

    </tr>
    <%
        }
    %>
</table>


</body>
</html>
