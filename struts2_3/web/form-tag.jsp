<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/6
  Time: 5:00 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form-tag</title>
</head>
<body>
form-tag.jsp<br/>

<s:form action="save">
    <s:hidden name="userId"></s:hidden>
    <s:textfield name="userName" label="UserName"></s:textfield>
    <s:password name="password" label="Password"></s:password>
    <s:textarea name="desc" label="Desc"></s:textarea>

    <s:checkbox name="married" label="Married"></s:checkbox>

    <s:submit></s:submit>
</s:form>
<br/>

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
</body>
</html>
