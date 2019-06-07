<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Online shop</title>
</head>
<body>
<h1>Products</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Cost</th>
    </tr>
    <#list product as product>
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.cost}</td>
            <td><a href="/product/${product.id}">Buy</a> </td>
        </tr>
    </#list>
</table>

</body>
</html>