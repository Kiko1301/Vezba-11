<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Vezba11</title>
    <!-- Add any additional CSS or meta tags here -->
</head>
<body>
    <center>
        <h1>New JSP File</h1>
        <form method="post" action="uploadServlet" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td>First Name: </td>
                    <td><input type="text" name="firstName" size="50"/></td>
                </tr>
                <tr>
                    <td>Last Name: </td>
                    <td><input type="text" name="lastName" size="50"/></td>
                </tr>
                <tr>
                    <td>Code: </td>
                    <td><input type="password" name="password" size="50"/></td>
                </tr>
                <tr>
                    <td>Date: </td>
                    <td><input type="date" name="date" size="50"/></td>
                </tr>
                <tr>
                    <td>Portrait Photo: </td>
                    <td><input type="file" name="photo" size="50"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save" a href="Message.jsp">
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
