<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/3
  Time: 10:55 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
%>
details.jsp<br/>
ProductId:${productId}<br/>
ProductName:${productName} -> <%=request.getAttribute("productName")%><br/>
ProductDesc:${productDesc}<br/>
ProductPrice:${productPrice}<br/>
</body>
</html>