<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ödev5</title>
</head>
<body>

<form action="LoginServlet" method="post">
    Kullanici Adı :<input type="text" name="username" id="username"><br/>
	Şifre :<input type="password" name="password" id="password"><br/>
    <input type="checkbox" name="rememberMe">Kaydet<br>
    <input type="submit" value="Giriş Yap">
</form>

</body>
</html>