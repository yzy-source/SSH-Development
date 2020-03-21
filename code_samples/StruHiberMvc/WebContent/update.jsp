<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="book_update" method="post">
	<input type="hidden" name="bid" value="${requestScope.book.bid}">
	书名：<input type="text" name="bname" value="${requestScope.book.bname}">
	<input type="submit" value="提交">
</form>

</body>
</html>