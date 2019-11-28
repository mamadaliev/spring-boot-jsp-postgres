<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
    <div>
        <c:forEach items="${books}" var="book">
            <div>${book.id}</div>
            <a href="/books/${book.id}">${book.name}</a>
            <div>${book.author}</div>
            <br>
        </c:forEach>
    </div>
</body>
</html>
