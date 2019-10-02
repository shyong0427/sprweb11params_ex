<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인덱스</title>
</head>
<body>
	** 요청 파라미터 문제 **<p/>
	** Glove **<p/>
	<form action="sangpum/glove" method="post">
		수   량 : <input type="text" name="su">
		단   가 : <input type="text" name="dan">
		<input type="submit">
	</form>
	** Socks **<p/>
	<form action="sangpum/socks" method="post">
		수   량 : <input type="text" name="su">
		단   가 : <input type="text" name="dan">
		<input type="submit">
	</form>	
	** Glass **<p/>
	<form action="sangpum/glass" method="post">
		수   량 : <input type="text" name="su">
		단   가 : <input type="text" name="dan">
		<input type="submit">
	</form>
</body>
</html>