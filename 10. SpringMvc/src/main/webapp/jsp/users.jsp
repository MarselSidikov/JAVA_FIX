<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Please Sign Up!
    </div>
    <form method="post" action="/jpa/users">
        <label for="firstName">First Name
            <input class="input-field" type="text" id="firstName" name="firstName">
        </label>
        <label for="lastName">Last Name
            <input class="input-field" type="text" id="lastName" name="lastName">
        </label>
        <input type="submit" value="Add user">
    </form>
</div>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Already in System!
    </div>
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        <c:forEach items="${usersFromServer}" var="user">
            <tr>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
