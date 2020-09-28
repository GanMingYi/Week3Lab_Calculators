<%-- 
    Document   : agecalculator
    Created on : 27-Sep-2020, 8:17:07 PM
    Author     : 801174
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body style="background-color: #121212; color: aliceblue">
        <div style="text-align: left; margin-top: 10rem; margin-left: 40%">
        <h1>Age Calculator</h1>
        <form method="post">
            Enter your age: <input type="text" name="userage" value="${userage}"><br>
            <input type="submit" value="Age next birthday">
        </form>
            <p>${message}</p>
            <a href="arithmetic">Arithmetic Calculator</a>
        </div>
    </body>
</html>
