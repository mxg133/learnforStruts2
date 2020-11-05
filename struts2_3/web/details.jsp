<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
<s:debug></s:debug>
– 返回 session 中的 code 属性: #session.code
– 返回 request 中的 customer 属性的 name 属性值: #request.customer.name
– 返回域对象(按 request, session, application 的顺序)的 lastAccessDate 属性: #attr.lastAccessDate
details.jsp<br/>
ProductName:${productName} -> <%=request.getAttribute("productName")%>
-> <s:property value="productName"/>
-> <s:property value="[1].productName"/> <br/>
ProductDesc:${productDesc} -> <s:property value="[1].productDesc"/> <br/>
ProductPrice:${productPrice} -> <s:property value="[0].productPrice"/> <br/>
ProductPrice:${productPrice} -> <s:property value="productPrice"/> <br/>

<br/><br/>
ProductName1: ${sessionScope.test.ProductName} ->
<s:property value="#session.product.productName"/> <br/>

ProductName2: ${requestScope.test.productName} ->
<s:property value="#request.test.productName"/> <br/>

<br/><br/>
<%-- 使用OGNL 调用public类的 public类型的静态方法/字段 --%>
<s:property value="@java.lang.Math@PI"/><br/>
<s:property value="@java.lang.Math@cos(0)"/><br/>
<s:property value="@java.lang.Math@sin(0)"/><br/>


<s:property value="productName"/><br/>
<%-- 调用对象栈的方法为一个属性赋值 --%>
<s:property value="setProductName('666666')"/><br/>
<s:property value="productName"/><br/>
<br/>
<%-- 调用数组对象的属性 --%>
<%
    String names[] = new String[]{"aa", "bb", "cc", "dd"};
    request.setAttribute("names", names);
%>
legnth:<s:property value="#attr.names.length"/><br/>
names[2]：<s:property value="#attr.names[2]"/><br/>
<br/>


<%-- 使用OGNL访问 map  调用map对象的属性 --%>
<%
    Map<String, Object> letters = new HashMap<>();
    request.setAttribute("letters", letters);
    letters.put("aa", "aaa");
    letters.put("b", "bbb");
    letters.put("c", "ccc");
%>
<s:property value="#attr.letters.size"/><br/>
a:<s:property value="#attr.letters['aa']"/><br/>

</body>
</html>