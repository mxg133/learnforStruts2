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

  <a href="product-input.action">Product Input</a><br/>
  <a href="TestActionContext?name=mxg">TestActionContext</a><br/>
  <a href="TestAware.do?name=mxg">TestAware</a><br/>
  <a href="Login-ui.do">Login-ui</a><br/>

  <a href="testActionSupport.do">testActionSupport</a><br/>

  <a href="testResult.do?number=5">test Result</a><br/>

  <a href="actionName.do?number=6">actionName</a><br/>

  <a href="testDynamicMethodInvocation.do">testDynamicMethodInvocation</a><br/>


  <%
    if (application.getAttribute("date") == null) {
      application.setAttribute("date", new Date());
    }
  %>
  <br/><br/>
  <a href="testTag.action?name=mxg133">testTag</a>

  <%
    session.setAttribute("date", new Date());
  %>

  <form action="testTag.action">
    <input type="text" name="username"/>
    <input type="submit" value="Sub!">
  </form>

  <a href="save.action?name=mxg133">testForm</a>
  </body>
</html>
