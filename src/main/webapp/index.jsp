<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h2>Добро пожаловать в онлайн-магазин</h2><br>
<a href="login">Войдите</a> на сайт или <a href="reg">зарегистрируйтесь</a>

<h3>Список товаров:</h3>
<table>
    <tr>
        <th>ID</th>
        <th>Наименование товара</th>
        <th>Стоимость</th>
    </tr>
    <c:forEach items="${product}" var="item">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.cost}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
