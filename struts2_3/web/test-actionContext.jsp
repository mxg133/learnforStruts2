<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/4
  Time: 9:59 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
test-actionContext.jsp<br/>

<h4>Test ActionContext Page</h4><br/>


application:${applicationScope.applicationKey}<br/>

session: ${sessionScope.sessionKey}<br/>

request: ${requestScope.requestKey}<br/>

parameters: ${parametersMap.parametersKey}
</body>
</html>
