<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/cart.do">
<c:forEach var="food" items="${foodList}">
    <c:out value="${food.getName()}"></c:out>
    <c:out value="${food.getPrice()}"></c:out>원
    <input type="text" name="${food.getName()}"></br>
</c:forEach>
    <button type="submit">장바구니 담기</button>
</form>

</body>
</html>
