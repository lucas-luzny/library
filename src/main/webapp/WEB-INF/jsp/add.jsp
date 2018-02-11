<%--
  Created by IntelliJ IDEA.
  User: Lucas
  Date: 11.02.2018
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
           prefix="springForm" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <title>Add book to library</title>
</head>
<body>
<center>
    <springForm:form method="POST" commandName="book" action="add">
        <div class="add">
            <table class="add">
                <tr>
                    <td>Title:</td>
                    <td><springForm:input path="title"/></td>
                    <td><springForm:errors path="title" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>Author:</td>
                    <td><springForm:input path="author"/></td>
                    <td><springForm:errors path="author" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>ISBN:</td>
                    <td><springForm:input path="isbn"/></td>
                    <td><springForm:errors path="isbn" cssClass="error"/></td>
                </tr>
                <tr>
                    <td colspan="3"><input type="submit" value="Add book"></td>
                </tr>
            </table>
        </div>
    </springForm:form>
</center>
</body>
</html>