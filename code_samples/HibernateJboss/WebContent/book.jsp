<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
    <td>编号</td>
    <td>图书名称</td>
    <td>出版社</td>
    <td>出版年份</td>
</tr>
<c:forEach items="${requestScope.list}" var="book">
<tr>
    <td>${book.bookid}</td>
    <td>${book.bookname}</td>
    <td>${book.publicname}</td>
    <td>${book.year}</td>
</tr>
</c:forEach>
</table>

<a href="book_add">book_add</a><br>
<a href="book_modify">book_modify</a><br>
<a href="book_delete">book_delete</a><br>
<a href="book_search">book_search</a><br>
</body>
</html>