<%-- 
    Document   : LoginForm
    Created on : 2 mars 2023, 09:50:55
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <br>
        <form method="post" action="TraitmantServlet?action=Lister">
            <table>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="Email"></td>
                </tr>
                <tr>
                    <td>Passworde</td>
                    <td><input type="password" name="pass"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="submit" value="submit"></td>
                    <td><input type="reset" name="reset" value="reset"></td>

                </tr>
            </table>
        </form>
    </body>
</html>
