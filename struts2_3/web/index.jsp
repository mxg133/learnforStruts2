<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/3
  Time: 5:01 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
  index.jsp<br/>
  <a href="TestActionContext?name=mxg">TestActionContext</a><br/>
  <a href="TestAware.do?name=mxg">TestAware</a><br/>
  <a href="Login-ui.do">Login-ui</a><br/>

  <a href="testActionSupport.do">testActionSupport</a>

  <%
    if (application.getAttribute("date") == null) {
      application.setAttribute("date", new Date());
    }
  %>

  </body>
</html>
