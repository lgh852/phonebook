<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	
</style>
<body>
<form method="post">
	<table class="table">
	<tr>
		<td>번호</td>
		<td><input type="text" name="idx"class="form-control inputborder" value="${guestlist.idx}" readonly="readonly"></td>
	</tr>
	<tr>	
		<td>제목</td>
		<td><input type="text" name="listTitle"class="form-control inputborder" value="${guestlist.listTitle}"></td>
	</tr>	
	<tr>
		<td>내용</td>
		<td><textarea rows="10" cols="50" name="listText" class="form-control inputborder">${guestlist.listTitle}</textarea></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" class= "btn-primary"value="확인">	<input type="reset"class= "btn-primary" value="취소"></td>
	
	</tr>


	</table>
</form>

</body>
</html>