<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/3
  Time: 10:55 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
input.jsp<br/>

<s:debug/>
<%--<s:property value="exceptionStack"/><br/>--%>
<s:property value="exception"/><br/>
${exception}<br/>
<s:property value="exception.message"/><br/>
${exception.message}<br/>



<form action="product-save.action" method="post">
    ProductName: <input type="text" name="productName" /><br/>
    ProductDesc: <input type="text" name="productDesc" /><br/>
    ProductPrice: <input type="text" name="productPrice" /><br/>
    <input type="submit" value="SUBMIT">

</form>
</body>
</html>
