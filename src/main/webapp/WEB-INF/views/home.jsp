<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 10626
  Date: 2017/12/22
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <form:form modelAttribute="user"  action="user">
        <form:input path="id"/>
        <form:input path="age"/>
        <form:input path="name"/>
        <form:input path="birthday"/>
        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>
