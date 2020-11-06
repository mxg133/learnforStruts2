<%@ page import="struts2.valuestack.Person" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="struts2.valuestack.PersonComparator" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: mxg
  Date: 2020/11/6
  Time: 10:30 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>common-tag</title>
</head>
<body>
common-tag.jsp<br/>

<s:debug/><br/>
<s:property value="productName"/><br/>
<s:property value="#session.date"/><br/>
<s:property value="#parameters.name[0]"/><br/>
<br/>

url1:|<s:url value="/getProduct" var="url1">
    <s:param name="productId" value="1002"></s:param>
</s:url>
${url1}

<br/>

url2:|<s:url value="/getProduct" var="url2">
    <s:param name="productId" value="productId"></s:param>
    <s:param name="date" value="#session.date"/>
</s:url>
${url2}

<br/>

url3:|<s:url value="/getProduct" var="url3">
    <s:param name="productId" value="'jhahah'"></s:param>
</s:url>
${url3}

<br/>

url4:|<s:url action="testAction" namespace="/mxg" method="save" var="url4">
</s:url>
${url4}

<br/>

url5:|<s:url value="testUrl" includeParams="all" var="url5"></s:url>
${url5}

<br/>

<s:set name="productName" value="productName" scope="request"></s:set>
productName:${requestScope.productName}<br/>

<br/>

<%
    Person person = new Person("person里的Name", 18);
    request.setAttribute("person", person);
%>

标签结束 弹出
<s:push value="#request.person">
    ${name}
</s:push>

<br/>

<s:if test="productPrice > 1000">
    I7 处理器 >1000
</s:if>
<s:elseif test="productPrice > 800">
    I5 处理器 >800
</s:elseif>
<s:else>x
</s:else>

<br/>
<s:if test="#request.person.age > 10">
    age > 10
</s:if>
<s:else>
    age < 10
</s:else>

<br/>

<%
    List<Person> persons = new ArrayList<>();
    persons.add(new Person(("01"), 11));
    persons.add(new Person(("02"), 22));
    persons.add(new Person(("03"), 33));
    persons.add(new Person(("04"), 44));
    persons.add(new Person(("05"), 55));

    request.setAttribute("persons", persons);
%>
<s:iterator value="#request.persons" status="status">
   index: ${status.index} - ${status.count} -${name} - ${age}<br/>
</s:iterator>

<br/>

<s:iterator value="persons">
    ${name} - ${age}<br/>
</s:iterator>

<br/>

<%
    PersonComparator personComparator = new PersonComparator();
    request.setAttribute("personComparator", personComparator);
%>
<s:sort comparator="#request.personComparator" source="persons" var="person2">
    <s:iterator value="#attr.person2">
        ${name} - ${age}<br/>
    </s:iterator>
</s:sort>

<br/>

s:date:
<s:date name="#session.date" format="yyyy-MM-dd hh:mm:ss" var="date2"/>
    ${date2}<br/>

<br/>

<s:iterator value="persons">
    <s:a href="getPerson.action?name=%{name}">${name}</s:a>
</s:iterator>

<br/>
<br/>
<br/>


</body>
</html>
