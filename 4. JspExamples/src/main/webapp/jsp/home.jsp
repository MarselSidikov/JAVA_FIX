<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 14.03.2018
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--Цвет текста берем из значения куки color --%>
<span style="color: ${cookie.color.value}">Hello</span>

<form method="post" action="/home">
    <label for="color">
        <select name="color" id="color">
            <option value="red">Красный</option>
            <option value="black">Черный</option>
            <option value="white">Белый</option>
        </select>
    </label>
    <input type="submit" value="Color send">
</form>
</body>
</html>
