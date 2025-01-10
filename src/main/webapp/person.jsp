<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 10/01/2025
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<main class="container">
    <h1> Person List</h1>
    <table class="table">
        <thead>
        <tr>
            <td>Lastname</td><td>Firstname</td><td>Age</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="person" items="${persons}">
            <tr>
                <td>${person.getLastname()}</td><td>${person.getFirstname()}</td><td>${person.getAge()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
</body>
</html>
