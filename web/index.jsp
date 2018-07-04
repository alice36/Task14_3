<%--
  Created by IntelliJ IDEA.
  User: Alice
  Date: 2018-07-04
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Kursy walut</title>
  </head>
  <body>
  <form method="post" action="waluty">
    Wartosc: <input type="text" name="wartosc"><br>
    Waluta: <br>
    <input type="radio" name="waluta" value="USD">USD<br>
    <input type="radio" name="waluta" value="EUR">EUR<br>
    <input type="radio" name="waluta" value="CHF">CHF<br>
    <input type="date" name="day"><br>
    <input type="submit" value="Przelicz">
  </form>
  </body>
</html>
