<%-- 
    Document   : arithmeticcalculator
    Created on : 27-Sep-2020, 9:31:43 PM
    Author     : 801174
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body style="background-color: #121212; color: yellowgreen">
        <div style="text-align: left; margin-top: 10rem; margin-left: 40%">
        <h1>Arithmetic Calculator</h1>
        <form method="post">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" name="button" value="+">
            <input type="submit" name="button" value="-">
            <input type="submit" name="button" value="*">
            <input type="submit" name="button" value="%">
        </form>
            <p>Result: ${result}</p>
            <a href="age">Age Calculator</a>
        </div>
    </body>
</html>
