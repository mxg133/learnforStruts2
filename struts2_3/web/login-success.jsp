<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/4
  Time: 3:31 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>seccess</title>
</head>
<body>
ok<br/>
${sessionScope.username}，你好！登陆成功...... <br/>
${applicationScope.count} 人在线......<br/>
<a href="Logout.do">out</a>
</body>
</html>
