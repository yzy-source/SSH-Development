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
		</tr>
		<c:forEach items="${requestScope.bookPage.dataList}" var="book">
			<tr>
			<td>${book.bid}</td>
			<td>${book.bname}</td>
			<td><a href="book_findById?bid=${book.bid}">修改</a></td>
			<td><a href="book_delete?bid=${book.bid}">删除</a></td>
		</tr>
		</c:forEach>
		
		
		<tr>
			<td>
				每页${requestScope.bookPage.pageSize}条记录 总共${requestScope.bookPage.totalPage}页
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				当前：第${requestScope.bookPage.currentPage} / ${requestScope.bookPage.totalPage}页
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				请选择：第
				<c:forEach begin="1" end="${requestScope.bookPage.totalPage}" step="1" var="i">
					<c:if test="${i==requestScope.bookPage.currentPage}">
						【${i}】
					</c:if>
					<c:if test="${i!=requestScope.bookPage.currentPage}">
						<a href="book_search?currentPage=${i}">${i}</a>
					</c:if>
				</c:forEach>
				页
			
			</td>
		
		
		
		</tr>
	</table>
成功！
</body>
</html>