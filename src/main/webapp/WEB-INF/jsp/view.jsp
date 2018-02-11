<%--
  Created by IntelliJ IDEA.
  User: Lucas
  Date: 11.02.2018
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <title>Library</title>
</head>
<body>
<center>
    <div id="container">
        <h1><b>Library</b></h1>
        <br/>
        <h2><b>Available books:</b></h2>
        <div>
            <table>
                <tr>
                    <th>Title</th>
                    <th>Author</th>
                    <th>ISBN</th>
                </tr>
                <c:forEach var="book" items="${library}">
                    <tr>
                        <td>${book.title}</td>
                        <td>${book.author}</td>
                        <td>${book.isbn}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <c:if test="${empty library}">
        <i>No records.</i>
        </c:if>
        <br/>
        <br/>
        <b><a href="add">Add book to library</a></b>
</center>
</body>
</html>